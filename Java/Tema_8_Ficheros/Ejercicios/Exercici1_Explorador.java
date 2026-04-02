import java.io.File;
import java.util.Scanner;

public class Exercici1_Explorador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdueix la ruta absoluta d'un directori: ");
        String ruta = scanner.nextLine();

        File directori = new File(ruta);

        if (directori.exists()) {
            System.out.println("El directori existeix. Contingut:");
            String[] contingut = directori.list();
            if (contingut != null && contingut.length > 0) {
                for (String nom : contingut) {
                    System.out.println(" - " + nom);
                }
            } else {
                System.out.println("El directori està buit.");
            }
        } else {
            System.out.println("La ruta indicada no existeix.");
        }

        scanner.close();
    }
}
