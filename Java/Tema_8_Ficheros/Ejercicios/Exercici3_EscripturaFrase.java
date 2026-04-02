import java.io.FileOutputStream;
import java.io.IOException;

public class Exercici3_EscripturaFrase {
    public static void main(String[] args) {
        FileOutputStream fitxer = null;
        String text = "Hola, estic aprenent Java!";

        try {
            fitxer = new FileOutputStream("dades.txt");

            for (int i = 0; i < text.length(); i++) {
                char caracter = text.charAt(i);
                fitxer.write((byte) caracter);
            }

            System.out.println("Frase escrita correctament a 'dades.txt'.");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Tancar el flux sempre al bloc finally
            if (fitxer != null) {
                try {
                    fitxer.close();
                    System.out.println("Flux tancat correctament.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
