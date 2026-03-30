import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercici2_CreadorCarpetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el nom de la nova carpeta: ");
        String nomCarpeta = scanner.nextLine();

        // Crear la carpeta
        File carpeta = new File(nomCarpeta);
        if (carpeta.mkdir()) {
            System.out.println("Carpeta '" + nomCarpeta + "' creada correctament.");

            // Crear fitxer buit hola.txt dins la carpeta
            File fitxer = new File(carpeta, "hola.txt");
            try {
                if (fitxer.createNewFile()) {
                    System.out.println("Fitxer 'hola.txt' creat dins la carpeta.");
                } else {
                    System.out.println("El fitxer 'hola.txt' ja existia.");
                }
            } catch (IOException e) {
                System.out.println("Error en crear el fitxer: " + e.getMessage());
            }
        } else {
            System.out.println("No s'ha pogut crear la carpeta (potser ja existeix).");
        }

        scanner.close();
    }
}
