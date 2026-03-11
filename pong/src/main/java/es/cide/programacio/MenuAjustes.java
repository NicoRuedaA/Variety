package es.cide.programacio;

import javax.swing.*;
import java.awt.*;

public class MenuAjustes extends JPanel {

    public MenuAjustes(CardLayout cardLayout, JPanel contenedor, JFrame frame) {
        // repetimos la misma estructura que en menu instrucciones...
        setLayout(new GridBagLayout());
        setBackground(new Color(20, 20, 40));

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;

        // checkbox para pantalla completa
        JCheckBox chkPantallaCompleta = new JCheckBox("Pantalla completa");
        chkPantallaCompleta.setFont(new Font("Arial", Font.PLAIN, 22));
        chkPantallaCompleta.setForeground(Color.WHITE);
        chkPantallaCompleta.setBackground(new Color(20, 20, 40));
        chkPantallaCompleta.setFocusPainted(false);

        // revisamos si ya tenemos la pantalla completa
        chkPantallaCompleta.setSelected(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH);

        // action listener del checkbox
        chkPantallaCompleta.addActionListener(e -> {
            boolean isFullscreen = chkPantallaCompleta.isSelected();

            frame.dispose(); // "apagamos" la pantalla (si no, no funcionaba)
            frame.setUndecorated(isFullscreen); // quitamos los bordes de la pantalla
            frame.setExtendedState(isFullscreen ? JFrame.MAXIMIZED_BOTH : JFrame.NORMAL); // cambiamos el tamaño maximo

            if (!isFullscreen) {
                frame.setSize(1920, 1080);
                frame.setLocationRelativeTo(null); // cebtramos en pantalla
            }

            frame.setVisible(true); // encendemos la pantalla
        });

        gbc.gridy = 1;
        gbc.insets = new Insets(10, 0, 10, 0);
        add(chkPantallaCompleta, gbc);

        // 3. Botón de Atrás
        JButton btnAtras = crearBoton(Recursos.BOTO_ATRAS_IMG);
        btnAtras.addActionListener(e -> cardLayout.show(contenedor, "menu"));

        gbc.gridy = 2;
        gbc.insets = new Insets(30, 0, 0, 0);
        add(btnAtras, gbc);
    }

    private JButton crearBoton(Image img) {
        JButton btn = new JButton();
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