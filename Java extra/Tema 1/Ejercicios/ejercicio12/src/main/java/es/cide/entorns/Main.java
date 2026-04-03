package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea = " ";
        int aux = 0;
        // String[] numerosStrings = new String[999];
        int[] numeros = new int[999];
        boolean salir = false;

        while (!salir) {
            linea = sc.nextLine();
            // separamos las lineas introducidas por palabras
            String[] numerosStrings = linea.split(" ");
            // comparamos si alguna palabra es igual a *
            for (int i = 0; i < numerosStrings.length; i++) {
                if (!salir) {
                    if (numerosStrings[i].equals("*")) {
                        salir = true;
                    } else {
                        numeros[aux] = Integer.parseInt(numerosStrings[i]);
                        aux++;
                    }
                }
            }
        }

        for (int i = 0; i < aux; i++) {
            if (numeros[i] % 10 == 0)
                System.out.println("");
            System.out.println(numeros[i]);
        }

        // System.out.println(numeros);
        sc.close();
    }
}