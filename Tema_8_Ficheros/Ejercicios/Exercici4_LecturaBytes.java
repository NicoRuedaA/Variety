import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

public class Exercici4_LecturaBytes {
    public static void main(String[] args) {
        FileInputStream fitxer = null;
        String text = "";
        int totalBytes = 0;

        try {
            fitxer = new FileInputStream("dades.txt");
            int size = fitxer.available();

            for (int i = 0; i < size; i++) {
                char caracter = (char) fitxer.read();
                text = text + caracter;
                totalBytes++;
            }

            System.out.println("Contingut del fitxer:");
            System.out.println(text);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fitxer != null) {
                try {
                    fitxer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Mostrar el total de bytes amb el mètode length() de File
        File f = new File("dades.txt");
        System.out.println("Total de bytes del fitxer (length()): " + f.length());
        System.out.println("Total de bytes comptats llegint: " + totalBytes);
    }
}
