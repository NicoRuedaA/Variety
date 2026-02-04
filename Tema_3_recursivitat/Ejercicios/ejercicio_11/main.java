import java.util.Scanner;

public class main {

    public static String letra(String s) {
        if (s.length() == 0) {

            return " ";
        } else {

            if (s.charAt(0) == 'x') {
                System.out.println("entra en x");
                return ("y" + letra(s.substring(1, s.length())));

            } else if (s.charAt(0) == 'y') {

                return ("x" + letra(s.substring(1, s.length())));
            }

            else
                System.out.println("entra en nada");
            System.out.println(s.substring(1, s.length()));
            return ("" + letra(s.substring(1, s.length())));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // letra(s);
        System.out.println(letra(s));
        // System.out.println(petit(x));
        sc.close();
    }
}
