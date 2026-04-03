import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, contador = 0;

        while (sc.hasNextInt()) {
            input = sc.nextInt();

            if (input%3==0) {
                contador+=input;

            }
            if (input%5==0) {
                contador-=input;

            }

        }


        System.out.println(contador);
        sc.close();
        }
    }

