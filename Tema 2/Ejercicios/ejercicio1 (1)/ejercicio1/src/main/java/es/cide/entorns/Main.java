package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean parEncontrado = false;
        int leer;

        do {
            leer = sc.nextInt();
            if (leer % 2 == 0 && leer != 0) {
                parEncontrado = true;
            }
        } while (leer != 0);

        System.out.println(parEncontrado ? "Si" : "No");

        sc.close();
    }
}