package nicorueda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tope = 1000;

        int suma = 0;
        for (int i = 0; i < tope; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                suma += i;
            }
        }

        System.out.println(suma);

    }
}