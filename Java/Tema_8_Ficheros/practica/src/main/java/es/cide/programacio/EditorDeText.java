package es.cide.programacio;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.*;
import java.nio.file.*;

public class EditorDeText extends JFrame {

    private JTextArea areaText;
    private File fitxerActual = null;

    public EditorDeText() {
        setTitle("Editor de Text");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // --- Barra de botons ---
        JToolBar barraBotons = new JToolBar();
        barraBotons.setFloatable(false);

        JButton btnNou = new JButton("📄 Nou");
        JButton btnObrir = new JButton("📂 Obrir");
        JButton btnDesar = new JButton("💾 Desar");
        JButton btnDesarCom = new JButton("💾➕ Desar com...");

        barraBotons.add(btnNou);
        barraBotons.add(btnObrir);
        barraBotons.add(btnDesar);
        barraBotons.add(btnDesarCom);

        // --- Àrea de text amb scroll ---
        areaText = new JTextArea();
        areaText.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane = new JScrollPane(areaText);

        // --- Layout principal ---
        add(barraBotons, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // --- Accions dels botons ---
        btnNou.addActionListener(e -> accioNou());
        btnObrir.addActionListener(e -> accioObrir());
        btnDesar.addActionListener(e -> accioDesar());
        btnDesarCom.addActionListener(e -> accioDesarCom());

        setVisible(true);
    }

    private void accioNou() {
        int resposta = JOptionPane.showConfirmDialog(this,
                "Vols descartar els canvis actuals?",
                "Nou document",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            areaText.setText("");
            fitxerActual = null;
            setTitle("Editor de Text");
        }
    }

    private void accioObrir() {
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Fitxers de text (*.txt)", "txt"));
        int resultat = selector.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxerActual = selector.getSelectedFile();
            try {
                String contingut = Files.readString(fitxerActual.toPath());
                areaText.setText(contingut);
                setTitle("Editor de Text - " + fitxerActual.getName());
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Error en obrir el fitxer:\n" + ex.getMessage(),
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void accioDesar() {
        if (fitxerActual == null) {
            accioDesarCom();
        } else {
            guardarFitxer(fitxerActual);
        }
    }

    private void accioDesarCom() {
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new FileNameExtensionFilter("Fitxers de text (*.txt)", "txt"));
        int resultat = selector.showSaveDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            File fitxer = selector.getSelectedFile();
            // Afegir extensió .txt si no en té
            if (!fitxer.getName().endsWith(".txt")) {
                fitxer = new File(fitxer.getAbsolutePath() + ".txt");
            }
            fitxerActual = fitxer;
            guardarFitxer(fitxerActual);
        }
    }

    private void guardarFitxer(File fitxer) {
        try {
            Files.writeString(fitxer.toPath(), areaText.getText());
            setTitle("Editor de Text - " + fitxer.getName());
            JOptionPane.showMessageDialog(this, "Fitxer desat correctament.",
                    "Desar", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error en desar el fitxer:\n" + ex.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EditorDeText::new);
    }
}