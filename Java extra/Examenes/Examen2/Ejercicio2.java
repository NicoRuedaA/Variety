import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean correcte = false;
        boolean obert = false;
        boolean tancat = false;

        int contador = 0;

        String inputActual = "";

        while (!inputActual.equals("*")) {
            inputActual = sc.next();
            if (!obert) {
                if (inputActual.equals("principi")) {
                    obert = true;
                }
            } else {
                if (inputActual.equals("final")) {
                    tancat = true;
                    correcte = true;
                } else if (!tancat)
                    contador++;
            }

        }

        if (!correcte)
            System.out.println("incorrecte");

        else
            System.out.println(contador);

        sc.close();
    }
}