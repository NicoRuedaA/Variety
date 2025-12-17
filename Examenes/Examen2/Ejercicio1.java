import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int picaEstats = 3143, primero = 0, segundo = 0, tercero = 0;

        boolean esPic = false;

        primero = sc.nextInt();
        segundo = sc.nextInt();
        tercero = sc.nextInt();

        if ((segundo > picaEstats) && (primero < segundo) && (tercero < segundo)) {
            esPic = true;
        }

        while (sc.hasNextInt()) {
            primero = segundo;
            segundo = tercero;
            tercero = sc.nextInt();
            if (!esPic) {
                if ((segundo > picaEstats) && (primero < segundo) && (tercero < segundo))
                    esPic = true;
            }
        }

        if (esPic)
            System.out.println("SI");
        else
            System.out.println("NO");

        sc.close();
    }
}