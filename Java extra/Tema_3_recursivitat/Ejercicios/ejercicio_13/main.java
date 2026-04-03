import java.util.Scanner;

public class main {
    public static int min(int a, int b) {
        System.out.print(" a: " + a + " b: " + b);
        if (a > b) {
            System.out.println(" devolvemos " + b);
            return b;
        } else {
            System.out.println(" devolvemos " + a);
            return a;
        }
    }

    public static int petit(int s) {
        if (s / 10 == 0) {
            // System.out.println("s/10: " + s / 10 + " s % 10: " + s % 10);
            // System.out.println(min(s / 10, s % 10));
            System.out.println(s);
            return s;
        } else {
            // min((s / 10) % 10, s % 10);
            // System.out.println("numero: " + s);
            System.out.println(min(petit(s / 10) % 10, s % 10));
            return (min(petit(s / 10) % 10, s % 10));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        petit(x);
        // System.out.println(petit(x));
        sc.close();
    }
}

/*
 * import java.util.Scanner;
 * 
 * public class Problema13 {
 * 
 * // Funció auxiliar per calcular el mínim de dos enters
 * public static int min(int a, int b) {
 * if (a >= b) return b;
 * else return a;
 * }
 * 
 * public static int petit(int x) {
 * if (x < 10) return x;
 * else {
 * return 10 * petit(x/10) + min(x%10,petit(x/10)%10);
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * int x = sc.nextInt();
 * 
 * System.out.println(petit(x));
 * 
 * sc.close();
 * }
 * }
 */