import java.math.*;

import java.util.Scanner;

public class main {

    public static int exponente(int a, int b) {
        if (b == 0) {
            return 1;
        } else {
            return a * exponente(a, b - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(exponente(a, b));
        sc.close();
    }
}
