package es.cide.programacio;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JPanel {

    public MenuPrincipal(CardLayout cardLayout, JPanel contenedor) {

        // seguimos usando la misma estrucutra que en menu instrucciones...
        setLayout(new GridBagLayout());

        // color de fondo
        setBackground(new Color(20, 20, 40));

        GridBagConstraints gridBagCons = new GridBagConstraints();
        gridBagCons.insets = new Insets(10, 0, 10, 0); // margenes
        gridBagCons.fill = GridBagConstraints.HORIZONTAL; // definimos que los botones se estiran a lo ancho
        gridBagCons.gridx = 0; // columna unica
        gridBagCons.gridy = 0; // fila 0

        // boton para comenzar el juego
        JButton btnComenzar = crearBoton(Recursos.BOTO_COMENCAR_IMG);
        btnComenzar.addActionListener(e -> {
            // se crea un "nuevo pong"
            Pong pong = new Pong(cardLayout, contenedor);
            // al contenedor le metemos el pong
            contenedor.add(pong, "pong");
            // y lo mostramos
            cardLayout.show(contenedor, "pong");

            // ponemos el foco en el pong
            pong.requestFocusInWindow();
            // iniciamos el pong a nivel lógico
            pong.iniciar();
        });
        // añadimos los botones a la pantalla
        add(btnComenzar, gridBagCons);
        gridBagCons.gridy++; // siguiente fila

        // boton instrucciones
        JButton btnInstrucciones = crearBoton(Recursos.BOTO_INSTRUCCIONS_IMG);
        // cambiamos al menu instrucciones
        btnInstrucciones.addActionListener(e -> cardLayout.show(contenedor, "instrucciones"));
        add(btnInstrucciones, gridBagCons);
        gridBagCons.gridy++; // Bajamos otra fila

        // boton ajustes
        JButton btnAjustes = crearBoton(Recursos.BOTO_AJUSTES_IMG);
        // cambiamos al menu ajustes
        btnAjustes.addActionListener(e -> cardLayout.show(contenedor, "ajustes"));
        add(btnAjustes, gridBagCons);
        gridBagCons.gridy++; // Bajamos otra fila

        // boton salir
        JButton btnSalir = crearBoton(Recursos.BOOT_SALIR_IMG);
        // System.exit(0) mata el proceso
        btnSalir.addActionListener(e -> System.exit(0));
        add(btnSalir, gridBagCons);
    }

    // metodo par acrear botones
    private JButton crearBoton(Image img) {
        JButton btn = new JButton(); // boton sin texto ya que le ponemos imagenes
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR)); // manita al pasar el raton por encima
        btn.setIcon(new ImageIcon(img)); // l eponemos la imagen

        btn.setContentAreaFilled(false); // quitamos el fondo
        btn.setBorderPainted(false); // quitamos el borde
        btn.setFocusPainted(false); // quitamos el marco

        return btn;
    }

    // le pintamos el fondo del "Maincra"
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // miramos que la imagen se ha cargado
        if (Recursos.FONDO_MENU != null) {

            g.drawImage(Recursos.FONDO_MENU, 0, 0, getWidth(), getHeight(), this);
        }
    }
}