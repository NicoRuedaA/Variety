package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        System.out.println("Introdueix A");
        a = sc.nextInt();
        System.out.println("Introdueix B");
        b = sc.nextInt();
        if (a % b == 0)
            System.out.print("B es divisor de A");
        else
            System.out.println("B no es divisor de A");
        sc.close();
    }
}