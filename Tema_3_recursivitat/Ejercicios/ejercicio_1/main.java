import java.util.Scanner;

public class main {

    private static int numDigits(int n) {
        if ((n / 10) < 1) {
            return 1;

        }
        return 1 + numDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int x = sc.nextInt();

        System.out.println("numero de digitos: " + numDigits(x));
        sc.close();
    }

}
