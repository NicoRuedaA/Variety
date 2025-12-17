import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input, contador = 0;

        while (sc.hasNextInt()) {
            input = sc.nextInt();

            if (input%2==0) {
                contador+=input;
                
            } else {
                contador-=input;;
            }
        }

    
        System.out.println(contador);
        sc.close();
        }
    }

