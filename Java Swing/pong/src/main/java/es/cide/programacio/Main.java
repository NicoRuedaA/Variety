package es.cide.programacio;

import javax.swing.*;
import java.awt.*;

public class Main {
    // a lo largo del programa uso los ifs con la estrucutra
    // variable = (condición) ? valor_si_es_verdad : valor_si_es_falso;

    // faltaria limitar los puntos a la porteria. Pero no me da tiempo que son y 57

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { // hace que todo se ejecute en un mismo hilo (cosas de JSwing "EDT")
            JFrame frame = new JFrame("Ping Pong"); // ventana principal
            frame.setSize(Recursos.WIDTH, Recursos.HEIGHT); // tamaño
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se cierra el proceso al cerrar la ventana
            frame.setLocationRelativeTo(null); // centra la pantalla al centro del monitor

            // Contenedor principal con CardLayout
            // cardlayout apila paneles para ver solo uno al mismo tiempo
            CardLayout cardLayout = new CardLayout();
            JPanel contenedor = new JPanel(cardLayout);

            // Añadir pantallas
            contenedor.add(new MenuPrincipal(cardLayout, contenedor), "menu");
            contenedor.add(new MenuInstrucciones(cardLayout, contenedor), "instrucciones");
            contenedor.add(new MenuAjustes(cardLayout, contenedor, frame), "ajustes");

            // Mostrar menú principal al inicio
            cardLayout.show(contenedor, "menu");

            frame.add(contenedor); // añadimos nuestro "contenedor" a la ventana principal
            frame.setVisible(true); // hace visible la ventan
        });
    }
}