package es.cide.programacio;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * PROU7EX02 - Editor de Text amb Barra d'Eines i Gestió de Fitxers
 *
 * Utilitza FileOutputStream per escriptura seqüencial i
 * FileInputStream per lectura seqüencial, tal com demana la unitat 7.
 */
public class PROU7EX02_EditorText extends JFrame {

    // ─────────────────────────────────────────────
    // Components de la GUI
    // ─────────────────────────────────────────────
    private final JTextArea areaText;
    private final JLabel labelFitxerActual;

    // ─────────────────────────────────────────────
    // Estat intern: fitxer obert actualment
    // ─────────────────────────────────────────────
    private File fitxerActual = null;

    // ═════════════════════════════════════════════
    // Constructor – munta tota la interfície
    // ═════════════════════════════════════════════
    public PROU7EX02_EditorText() {
        setTitle("Editor de Text – PROU7EX02");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        // ── Barra d'eines ──────────────────────────
        JToolBar barraEines = new JToolBar();
        barraEines.setFloatable(false);
        barraEines.setBackground(new Color(40, 40, 48));
        barraEines.setBorder(new EmptyBorder(6, 8, 6, 8));

        JButton btnNou = crearBoto("📄 Nou", new Color(70, 130, 180));
        JButton btnObrir = crearBoto("📂 Obrir", new Color(60, 160, 100));
        JButton btnDesar = crearBoto("💾 Desar", new Color(200, 140, 30));
        JButton btnDesarCom = crearBoto("💾➕ Desar com...", new Color(160, 60, 160));

        barraEines.add(btnNou);
        barraEines.addSeparator(new Dimension(8, 0));
        barraEines.add(btnObrir);
        barraEines.addSeparator(new Dimension(8, 0));
        barraEines.add(btnDesar);
        barraEines.addSeparator(new Dimension(8, 0));
        barraEines.add(btnDesarCom);

        // ── Àrea de text amb scroll ────────────────
        areaText = new JTextArea();
        areaText.setFont(new Font("Monospaced", Font.PLAIN, 14));
        areaText.setBackground(new Color(28, 28, 36));
        areaText.setForeground(new Color(220, 220, 220));
        areaText.setCaretColor(Color.WHITE);
        areaText.setLineWrap(true);
        areaText.setWrapStyleWord(true);
        areaText.setMargin(new Insets(12, 16, 12, 16));

        JScrollPane scrollPane = new JScrollPane(areaText);
        scrollPane.setBorder(BorderFactory.createLineBorder(new Color(55, 55, 70)));

        // ── Barra d'estat inferior ─────────────────
        labelFitxerActual = new JLabel("  Cap fitxer obert");
        labelFitxerActual.setForeground(new Color(150, 150, 170));
        labelFitxerActual.setFont(new Font("SansSerif", Font.PLAIN, 12));
        labelFitxerActual.setBorder(new EmptyBorder(4, 8, 4, 8));

        JPanel panellEstat = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        panellEstat.setBackground(new Color(30, 30, 40));
        panellEstat.add(labelFitxerActual);

        // ── Muntatge de la finestra ────────────────
        setLayout(new BorderLayout());
        add(barraEines, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(panellEstat, BorderLayout.SOUTH);

        getContentPane().setBackground(new Color(28, 28, 36));

        // ── Listeners dels botons ──────────────────
        btnNou.addActionListener(e -> accioNou());
        btnObrir.addActionListener(e -> accioObrir());
        btnDesar.addActionListener(e -> accioDesar());
        btnDesarCom.addActionListener(e -> accioDesarCom());
    }

    // ═════════════════════════════════════════════
    // Helpers de disseny
    // ═════════════════════════════════════════════
    private JButton crearBoto(String text, Color color) {
        JButton btn = new JButton(text);
        btn.setBackground(color);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font("SansSerif", Font.BOLD, 13));
        btn.setFocusPainted(false);
        btn.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(color.darker(), 1),
                new EmptyBorder(6, 14, 6, 14)));
        btn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        // Efecte hover
        btn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                btn.setBackground(color.brighter());
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btn.setBackground(color);
            }
        });
        return btn;
    }

    // ═════════════════════════════════════════════
    // Accions dels botons
    // ═════════════════════════════════════════════

    /** 📄 NOU – Neteja l'àrea i reinicia el fitxer actual */
    private void accioNou() {
        // Si hi ha canvis sense desar, preguntar
        int resposta = JOptionPane.showConfirmDialog(
                this,
                "Vols crear un document nou?\nEls canvis no desats es perdran.",
                "Document nou",
                JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            areaText.setText("");
            fitxerActual = null;
            actualitzarTitol();
        }
    }

    /** 📂 OBRIR – Selector de fitxers + lectura seqüencial amb FileInputStream */
    private void accioObrir() {
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Obrir fitxer de text");

        int resultat = selector.showOpenDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxerActual = selector.getSelectedFile();
            llegirFitxer(fitxerActual);
            actualitzarTitol();
        }
    }

    /**
     * 💾 DESAR – Si ja tenim un fitxer obert, desa directament.
     * Si no, delega a "Desar com..."
     */
    private void accioDesar() {
        if (fitxerActual != null) {
            escriureFitxer(fitxerActual);
        } else {
            // Encara no tenim fitxer: comportament igual que "Desar com..."
            accioDesarCom();
        }
    }

    /** 💾➕ DESAR COM... – Sempre obre el selector per triar ruta */
    private void accioDesarCom() {
        JFileChooser selector = new JFileChooser();
        selector.setDialogTitle("Desar com...");

        int resultat = selector.showSaveDialog(this);
        if (resultat == JFileChooser.APPROVE_OPTION) {
            fitxerActual = selector.getSelectedFile();
            // Afegir extensió .txt si no en té
            if (!fitxerActual.getName().contains(".")) {
                fitxerActual = new File(fitxerActual.getAbsolutePath() + ".txt");
            }
            escriureFitxer(fitxerActual);
            actualitzarTitol();
        }
    }

    // ═════════════════════════════════════════════
    // Lògica de fitxers (java.io)
    // ═════════════════════════════════════════════

    /**
     * Lectura seqüencial del fitxer amb FileInputStream.
     * Llegeix byte a byte i reconstrueix el text.
     */
    private void llegirFitxer(File fitxer) {
        FileInputStream fis = null;
        StringBuilder text = new StringBuilder();

        try {
            fis = new FileInputStream(fitxer);
            int size = fis.available();

            for (int i = 0; i < size; i++) {
                char caracter = (char) fis.read();
                text.append(caracter);
            }

            areaText.setText(text.toString());
            JOptionPane.showMessageDialog(this,
                    "Fitxer carregat correctament:\n" + fitxer.getAbsolutePath(),
                    "Obert", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error en llegir el fitxer:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Tancament garantit al bloc finally
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * Escriptura seqüencial del text al fitxer amb FileOutputStream.
     * Escriu caràcter a caràcter convertint a byte.
     */
    private void escriureFitxer(File fitxer) {
        FileOutputStream fos = null;
        String text = areaText.getText();

        try {
            fos = new FileOutputStream(fitxer);

            for (int i = 0; i < text.length(); i++) {
                char caracter = text.charAt(i);
                fos.write((byte) caracter);
            }

            JOptionPane.showMessageDialog(this,
                    "Fitxer desat correctament:\n" + fitxer.getAbsolutePath(),
                    "Desat", JOptionPane.INFORMATION_MESSAGE);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this,
                    "Error en desar el fitxer:\n" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Tancament garantit al bloc finally
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // ═════════════════════════════════════════════
    // Actualitzar títol i barra d'estat
    // ═════════════════════════════════════════════
    private void actualitzarTitol() {
        if (fitxerActual != null) {
            setTitle("Editor de Text – " + fitxerActual.getName());
            labelFitxerActual.setText("  " + fitxerActual.getAbsolutePath());
        } else {
            setTitle("Editor de Text – Document nou");
            labelFitxerActual.setText("  Cap fitxer obert");
        }
    }

    // ═════════════════════════════════════════════
    // Main
    // ═════════════════════════════════════════════
    public static void main(String[] args) {
        // Executar la GUI al Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            PROU7EX02_EditorText editor = new PROU7EX02_EditorText();
            editor.setVisible(true);
        });
    }
}