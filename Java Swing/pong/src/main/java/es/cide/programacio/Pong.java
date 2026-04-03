package es.cide.programacio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Pong extends JPanel implements ActionListener {

    // ------Constantes------
    private static final boolean[] KEYS = new boolean[1024];
    // Objetos
    private static final int RADI = 20;
    private static final double DXPILOTAINI = 6, DYPILOTAINI = 6;
    private static final int XPILOTAINI = Recursos.WIDTH / 2, YPILOTAINI = Recursos.HEIGHT / 2;
    private static final double XRECTANGLESIZE = 50, YRECTANGLESIZE = 180;
    private static final double XRECTANGLE11 = 200, YRECTANGLE11 = 100;
    private static final double XRECTANGLE22 = 700, YRECTANGLE12 = 100;
    private static final double XRECTANGLE21 = Recursos.WIDTH - (XRECTANGLE11 + XRECTANGLESIZE), YRECTANGLE21 = 100;
    private static final double XRECTANGLE12 = Recursos.WIDTH - (XRECTANGLE22 + XRECTANGLESIZE), YRECTANGLE22 = 100;
    private static final double RECTANGLEVEL = 15.0;
    // Comportamiento
    private static final int DELAY = 10;
    private static final Image imagenJ1 = Recursos.PLAYER1_IMG;
    private static final Image imagenJ2 = Recursos.PLAYER2_IMG;
    // menú pausa
    private static final Color COLOR_MENU_PAUSE = new Color(0, 0, 0, 150);
    private static final Color COLOR_BOTON = new Color(50, 50, 100);
    private static final Font FONT_PAUSA = new Font("Arial", Font.BOLD, 80);
    private static final Font FONT_BOTON = new Font("Arial", Font.BOLD, 24);

    // ------Variables------
    private Timer timer;
    private int puntuacion1 = 0;
    private int puntuacion2 = 0;
    private boolean pausado = false;
    // Variables de JSwing para los menus
    private java.awt.Rectangle botonMenuBounds = null;
    private final CardLayout cardLayout;
    private final JPanel contenedor;
    // Pause
    private int btnW = 300, btnH = 60;
    private int btnX = (Recursos.WIDTH - btnW) / 2;
    private int btnY = Recursos.HEIGHT / 2 + 20;
    // ------Objetos------
    private Random random = new Random();
    Rectangle r1 = new Rectangle(XRECTANGLE11, YRECTANGLE11, XRECTANGLESIZE, YRECTANGLESIZE, RECTANGLEVEL,
            RECTANGLEVEL);
    Rectangle r2 = new Rectangle(XRECTANGLE12, YRECTANGLE12, XRECTANGLESIZE, YRECTANGLESIZE, RECTANGLEVEL,
            RECTANGLEVEL);
    Rectangle r3 = new Rectangle(XRECTANGLE22, YRECTANGLE22, XRECTANGLESIZE, YRECTANGLESIZE, RECTANGLEVEL,
            RECTANGLEVEL);
    Rectangle r4 = new Rectangle(XRECTANGLE21, YRECTANGLE21, XRECTANGLESIZE, YRECTANGLESIZE, RECTANGLEVEL,
            RECTANGLEVEL);
    Cercle c1 = new Cercle(XPILOTAINI, YPILOTAINI, DXPILOTAINI, DYPILOTAINI, RADI);

    // ------Constructores------
    public Pong(CardLayout cardLayout, JPanel contenedor) {

        this.cardLayout = cardLayout; // Comportamiento de JSwing para cambios de mnu
        this.contenedor = contenedor;

        setBackground(Color.GRAY); // Color de fondo
        addKeyboard(); // Listener del teclado

        timer = new Timer(DELAY, this); // timer
    }

    // ------Metodos Publicos------
    public void iniciar() { // Se llama al entrar desde el menu
        pausado = false;
        timer.start();
    }

    public void pausar() { // Se llama al pulsar "esc"
        pausado = true;
        timer.stop();
        repaint();
    }

    public void reanudar() { // Se lama al reanudar desde el menu pausa
        pausado = false;
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {

        // Colision con los lados
        if (c1.getPosX() + 2 * RADI >= getWidth() || c1.getPosX() <= 0) {
            // Calculamos si la pelota está dentro del área de portería
            int altoArea = 400;
            double portYMin = getHeight() / 2.0 - altoArea / 2.0;
            double portYMax = getHeight() / 2.0 + altoArea / 2.0;
            double ballCenterY = c1.getPosY() + RADI;

            if (ballCenterY >= portYMin && ballCenterY <= portYMax) {
                // Está dentro de la portería: es un punto
                if (c1.getPosX() <= 0)
                    point(2);
                else
                    point(1);
            } else {
                // Fuera de la portería: rebota
                c1.setXvel(-c1.getVelX());
                // Sacamos la pelota del borde para evitar que quede pegada
                if (c1.getPosX() <= 0)
                    c1.setXpos(1);
                else
                    c1.setXpos(getWidth() - 2 * RADI - 1);
            }
        }

        // Colision arriba y abajo
        if (c1.getPosY() + 2 * RADI >= getHeight() || c1.getPosY() <= 0) {
            c1.setYvel(-c1.getVelY());
        }

        // Revisamos si hay colision rectangulo-circulo
        if (CollisionDetector.collides(r1, c1))
            // Si hay, miramos en que lado ha sido
            handleCollision(r1);
        if (CollisionDetector.collides(r2, c1))
            handleCollision(r2);
        if (CollisionDetector.collides(r3, c1))
            handleCollision(r3);
        if (CollisionDetector.collides(r4, c1))
            handleCollision(r4);

        // Movimientode la pelota
        c1.setXpos(c1.getPosX() + c1.getVelX());
        c1.setYpos(c1.getPosY() + c1.getVelY());

        repaint();
    }

    // ------Metodos Privados------
    private void handleCollision(Rectangle r) {
        // obtenemos el centro del circulo
        double cx = c1.getPosX() + c1.getRadi();
        double cy = c1.getPosY() + c1.getRadi();
        // obtenemos el centro del rectangulo
        double rectCenterX = r.getPosX() + r.getSizeX() / 2.0;
        double rectCenterY = r.getPosY() + r.getSizeY() / 2.0;

        // calculamos la distancia entre los centros
        double dx = Math.abs(cx - rectCenterX);
        double dy = Math.abs(cy - rectCenterY);

        // calculamos que distancia ha "pentrado" el circulo en el rectangulo
        double overlapX = (c1.getRadi() + r.getSizeX() / 2.0) - dx;
        double overlapY = (c1.getRadi() + r.getSizeY() / 2.0) - dy;

        // miramos cual es menor
        if (overlapX < overlapY) {

            // si la x es menor
            // golpe lateral
            c1.setXvel(-c1.getVelX());

            // movemos el circulo fuera del rectangulo
            // si el centro de la pelota es menor, está más a la izquierda
            if (cx < rectCenterX) {
                // la colocamos a la izquierda del rectángulo.
                c1.setXpos(r.getPosX() - c1.getRadi() * 2);
            } else {
                // si no, al borde derecho.
                c1.setXpos(r.getPosX() + r.getSizeX());
            }

        } else {
            // la y es menor
            // golpe vertical
            c1.setYvel(-c1.getVelY());

            // si es menor, choca por arriba
            if (cy < rectCenterY) {
                // la colocamos arriba del rectangulo
                c1.setYpos(r.getPosY() - c1.getRadi() * 2);
            } else {
                // si no, por debajo
                c1.setYpos(r.getPosY() + r.getSizeY());
            }
        }

        // aplicamos pseudo aceleracion
        c1.accelerate();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // -----CAMPO-----
        drawCampo(g2d);
        // -----PELOTA-----
        drawCercle(g2d);
        // -----JUGADORES-----
        drawRectangle(g2d, r1, imagenJ1);
        drawRectangle(g2d, r2, imagenJ1);
        drawRectangle(g2d, r3, imagenJ2);
        drawRectangle(g2d, r4, imagenJ2);

        // ----- CONTADOR -----
        g2d.setColor(Color.WHITE);
        g2d.setFont(new Font("Arial", Font.BOLD, 20));
        g2d.drawString("Punts J1: " + puntuacion1, Recursos.WIDTH / 4, 50);
        g2d.drawString("Punts J2: " + puntuacion2, Recursos.WIDTH - Recursos.WIDTH / 4, 50);

        // Overlay de pausa
        if (pausado) {
            drawPausa(g2d);
        }
    }

    private void drawPausa(Graphics2D g2d) {

        // Dibujamos un fondo transparente en el menu de pausa
        g2d.setColor(COLOR_MENU_PAUSE);
        g2d.fillRect(0, 0, Recursos.WIDTH, Recursos.HEIGHT);

        // Escribimos "PAUSA"
        String txtPausa = "PAUSA";
        g2d.setFont(FONT_PAUSA); // fuente
        g2d.setColor(Color.WHITE); // color
        FontMetrics fm = g2d.getFontMetrics(); // calculamos lo que hace de ancho el texto

        // Centramos horizontalmente
        // restanmos la mitad del ancho del texto
        // al centro de la pantalla
        g2d.drawString(txtPausa, (Recursos.WIDTH - fm.stringWidth(txtPausa)) / 2, Recursos.HEIGHT / 2 - 60);

        botonMenuBounds = new java.awt.Rectangle(btnX, btnY, btnW, btnH); // Actualizar bounds

    }

    private void drawRectangle(Graphics2D g2d, Rectangle r, Image img) {
        // Metodo para pintar un rectangulo
        g2d.setColor(Color.GREEN); // color..
        g2d.fillRect((int) r.getPosX(), (int) r.getPosY(), (int) r.getSizeX(), (int) r.getSizeY()); // tamaño...

        if (img != null) { // imagen...
            g2d.drawImage(img, (int) r.getPosX(), (int) r.getPosY(), (int) r.getSizeX(), (int) r.getSizeY(),
                    this);
        }
    }

    private void drawCercle(Graphics2D g2d) {
        // Metodo para pintar un circulo
        g2d.setColor(Color.WHITE);
        g2d.fillOval((int) c1.getPosX(), (int) c1.getPosY(), RADI * 2, RADI * 2);
    }

    private void drawCampo(Graphics2D g2d) {
        // cesped
        g2d.setColor(new Color(34, 139, 34));
        g2d.fillRect(0, 0, getWidth(), getHeight());
        // configuramos las lineas
        g2d.setColor(Color.WHITE);
        g2d.setStroke(new BasicStroke(3));
        // exteriores
        int margen = 20;
        int campoW = getWidth() - (margen * 2);
        int campoH = getHeight() - (margen * 2);
        g2d.drawRect(margen, margen, campoW, campoH);
        // medio campo
        int mitadX = getWidth() / 2;
        g2d.drawLine(mitadX, margen, mitadX, getHeight() - margen);
        // circulo
        int radioCirculo = 100;
        g2d.drawOval(mitadX - radioCirculo, (getHeight() / 2) - radioCirculo, radioCirculo * 2, radioCirculo * 2);
        // centro
        g2d.fillOval(mitadX - 5, (getHeight() / 2) - 5, 10, 10);
        // porterias
        int anchoArea = 150;
        int altoArea = 400;
        g2d.drawRect(margen, (getHeight() / 2) - (altoArea / 2), anchoArea, altoArea);
        g2d.drawRect(getWidth() - margen - anchoArea, (getHeight() / 2) - (altoArea / 2), anchoArea, altoArea);
    }

    private void point(int player) {
        // Sumamos 1 al contador dependiendo del jugador
        if (player == 1)
            puntuacion1++;
        else
            puntuacion2++;

        c1.slowDown(); // Reiniciamos la velocidad

        resetCerclePos(); // Movemos la pelota al centro del campo

    }

    private void resetCerclePos() {
        c1.setPos(XPILOTAINI, YPILOTAINI); // pelota al centro
        // reiniciamos la velocidad de la pelota
        c1.setXvel(random.nextBoolean() ? DXPILOTAINI : DXPILOTAINI * -1);
        c1.setYvel(random.nextBoolean() ? DYPILOTAINI : DYPILOTAINI * -1);
    }

    private void updateMovement() {
        // si el juego está pausado no hacemos nada
        if (pausado)
            return;
        // límites para que los jugadores no se salgan de la pantalla
        int limiteInferior = getHeight() - (int) YRECTANGLESIZE;

        // si se pulsa w...
        if (KEYS[KeyEvent.VK_W]) {
            r1.setPosY(Math.max(0, r1.getPosY() - r1.getVelY()));
            r2.setPosY(Math.max(0, r2.getPosY() - r2.getVelY()));
        }
        // si se pulsa s...
        if (KEYS[KeyEvent.VK_S]) {
            r1.setPosY(Math.min(limiteInferior, r1.getPosY() + r1.getVelY()));
            r2.setPosY(Math.min(limiteInferior, r2.getPosY() + r2.getVelY()));
        }
        // si se pulsa flecha arriba...
        if (KEYS[KeyEvent.VK_UP]) {
            r3.setPosY(Math.max(0, r3.getPosY() - r3.getVelY()));
            r4.setPosY(Math.max(0, r4.getPosY() - r4.getVelY()));
        }
        // si se pulsa flecha abajo...
        if (KEYS[KeyEvent.VK_DOWN]) {
            r3.setPosY(Math.min(limiteInferior, r3.getPosY() + r3.getVelY()));
            r4.setPosY(Math.min(limiteInferior, r4.getPosY() + r4.getVelY()));
        }

        repaint();
    }

    // listener del teclado
    private void addKeyboard() {
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {
            @Override
            // metodo que se ejecuta cada vez que el usuario pulsa o suelta una tecla
            public boolean dispatchKeyEvent(KeyEvent e) {
                int code = e.getKeyCode(); // obtiene el código de la tecla pulsada

                if (code >= 0 && code < KEYS.length) {
                    // comprobamos que el código no salga del rango (constante KEYS) para evitar un
                    // error
                    if (e.getID() == KeyEvent.KEY_PRESSED) {
                        KEYS[code] = true;
                        // si la tecla se ha pulsado se marca esta como true

                        if (code == KeyEvent.VK_ESCAPE) {
                            if (pausado)
                                reanudar();
                            else
                                pausar();
                        }
                        // caso del esc para el menu pausa
                    } else if (e.getID() == KeyEvent.KEY_RELEASED) {
                        KEYS[code] = false;
                    }
                    // cuando se suelta la tecla, se marca la tecla como false
                }
                return false;
            }
        });

        // update
        Timer gameLoop = new Timer(16, e -> updateMovement());
        gameLoop.start();
    }
}