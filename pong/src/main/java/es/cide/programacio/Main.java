package es.cide.programacio;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    private final static int HEIGHT = 1080;
    private final static int WIDTH = 1920;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Ping Pong");
            Pong panel = new Pong();

            frame.add(panel);
            frame.setSize(WIDTH, HEIGHT);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // mirar
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

}
