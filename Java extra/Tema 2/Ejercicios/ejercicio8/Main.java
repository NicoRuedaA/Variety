import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean parAnterior, resultado = true;
        Scanner sc = new Scanner(System.in);

        int input;

        input = sc.nextInt();
        parAnterior = input%2==0;

        while(sc.hasNextInt() && resultado){
            input = sc.nextInt();
            //si el numero actual es par y el anterior es par   o   si el numero acual es impar y el anterior es impar
            if((input%2==0 && parAnterior) || (input%2!=0 && !parAnterior)) resultado = false;
            parAnterior = input%2==0;

        }

        System.out.println(resultado);

        sc.close();
    }
}
