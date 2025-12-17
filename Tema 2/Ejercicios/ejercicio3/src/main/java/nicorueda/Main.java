package nicorueda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String aBuscar = sc.next(), ultimoInput = "", cadenaMasGrande = "";
        boolean encontrado = false;
        boolean salir = false;

        ultimoInput = sc.next();
        cadenaMasGrande = ultimoInput;

        if (ultimoInput.equals(aBuscar))
            encontrado = true;
        // while (!ultimoInput.equals(".")) {
        while (!salir) {
            // si la "cadena mas grande" es menor que el ultimo input
            if (cadenaMasGrande.compareTo(ultimoInput) < 0) {
                // el ultimo input será la "cadena mas grande"
                cadenaMasGrande = ultimoInput;
                // si la "cadena mas grande" es igual a buscar
                if (cadenaMasGrande.equals(aBuscar)) {
                    encontrado = true;
                    salir = true;
                }
                // si el ultimo input es mayor que a buscar
                if (ultimoInput.compareTo(aBuscar) > 0)
                    salir = true;
            }

            if (!salir) {
                ultimoInput = sc.next();
                salir = ultimoInput.equals(".");
            }
        }

        System.out.println(encontrado);

        sc.close();
    }
}