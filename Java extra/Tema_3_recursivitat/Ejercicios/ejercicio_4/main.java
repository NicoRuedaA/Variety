import java.math.*;

import java.util.Scanner;

public class main {

    public static boolean esPrimeroPerfecto(int x) {
        if (x == 0) {
            return true;
        }

        else if (esPrimo(x)) {
            return esPrimo(sumDigits(x));
        } else
            return false;
    }

    public static int sumDigits(int x) {
        if (x < 10)
            return x;

        else

            return sumDigits(x / 10 + x % 10);

    }

    private static boolean esPrimoIterativo(int a, int b) {
        if (b == 1) {
            return true;
        } else {
            if (a % b == 0)
                return false;
            else
                return esPrimoIterativo(a, b - 1);
        }
    }

    private static boolean esPrimo(int x) {
        boolean esPrimo = true;

        int y = (int) Math.sqrt(x);

        
        esPrimo = esPrimoIterativo(x, y);
        return esPrimo;
    }

    public static void main(String[] args) {
        // int x = Integer.parseInt(args[0]);
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(esPrimeroPerfecto(a));
        sc.close();
        // 978
    }
}
