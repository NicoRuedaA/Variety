import java.io.File;
import java.util.Scanner;

public class Exercici5_ComprovadorPermisos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix el nom del fitxer o directori: ");
        String nom = scanner.nextLine();

        File fitxer = new File(nom);

        System.out.println("\n===== FITXA TÈCNICA =====");

        // Comprovar si és fitxer o directori
        if (fitxer.isFile()) {
            System.out.println("Tipus: Fitxer");
        } else if (fitxer.isDirectory()) {
            System.out.println("Tipus: Directori");
        } else {
            System.out.println("Tipus: No existeix al disc.");
        }

        // Permisos de lectura i escriptura
        System.out.println("Permís de lectura:    " + (fitxer.canRead()  ? "Sí" : "No"));
        System.out.println("Permís d'escriptura:  " + (fitxer.canWrite() ? "Sí" : "No"));

        // Ruta absoluta
        System.out.println("Ruta absoluta: " + fitxer.getAbsolutePath());

        System.out.println("=========================");

        scanner.close();
    }
}
