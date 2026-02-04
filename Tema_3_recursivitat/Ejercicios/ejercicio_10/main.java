import java.util.Scanner;

public class main {

    public static int exponente(String s) {
        if (s.length() < 2) {
            return 0;

        } else {
            if (s.charAt(0) == 's' && s.charAt(1) == 'i') {
                return 1 + exponente(s.substring(2, s.length()));
            } else {
                return 0 + exponente(s.substring(1, s.length()));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.next();
        System.out.println(exponente(palabra));
        sc.close();
    }
}
