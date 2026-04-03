package es.cide.programacio;

import javax.swing.*;
import java.awt.*;

public class MenuInstrucciones extends JPanel {

    public MenuInstrucciones(CardLayout cardLayout, JPanel contenedor) {
        setLayout(new GridBagLayout()); // grid bag layout para flexibilidad
        setBackground(new Color(20, 20, 40)); // color de fondo

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 0, 10, 0); // margenes
        gbc.gridx = 0; // todoira a la columna 0

        gbc.insets = new Insets(5, 0, 5, 0); // mas margenes

        // Texto que vamos a mostrar para explicar los controles
        String textoInstrucciones = "W / S para mover al jugador 1 | ↑ / ↓ para mover al jugador 2 | Pulsar ESC para pausar";

        // Creamos el JLabel directamente con el String
        JLabel linea = new JLabel(textoInstrucciones, SwingConstants.CENTER);
        linea.setFont(new Font("Arial", Font.PLAIN, 45));
        linea.setForeground(Color.YELLOW);

        // Lo colocamos en la fila 1
        gbc.gridy = 1;
        add(linea, gbc);

        // Botón atrás
        JButton btnAtras = crearBoton(Recursos.BOTO_ATRAS_IMG);

        // click aquí (lambda) y se cambia de pantalla
        btnAtras.addActionListener(e -> cardLayout.show(contenedor, "menu"));

        // lo ponemos en la fila 2
        gbc.gridy = 2;
        gbc.insets = new Insets(30, 0, 0, 0);
        add(btnAtras, gbc);
    }

    // funcion general para crear boton
    private JButton crearBoton(Image img) {

        JButton btn = new JButton(" ");
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setIcon(new ImageIcon(img));

        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false);
        btn.setFocusPainted(false);

        return btn;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (Recursos.FONDO_MENU != null) {
            g.drawImage(Recursos.FONDO_MENU, 0, 0, getWidth(), getHeight(), this);
        }
    }
}