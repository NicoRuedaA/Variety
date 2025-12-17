import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = "";
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        

        while (!input.equals(".")) {
            input = sc.next();

            if (input%2==0) {
                contador--;
                if (contador < 0)
                    leer = false;
            } else {
                contador++;
            }

        }

        System.out.println(contador

        System.out.println(abiertos == 0);
        sc.close();

    }
}
