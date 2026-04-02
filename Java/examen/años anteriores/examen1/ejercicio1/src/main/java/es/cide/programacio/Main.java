package es.cide.programacio;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //declaramos -1 par comprobar que haya errores
        int numeroAleatorio = -1, numeroIntroducido=-1, intentosRestantes=6;
        boolean encontrado=false;

        numeroAleatorio = random.nextInt(50) + 1 ;

        while(intentosRestantes>0&&!encontrado){
            System.out.println("introduce un numero entre el 1 y 50");

            try{
            numeroIntroducido = sc.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Error: introduce únicamente un numero");
                // introducimos esto para sacarlo de búcle y "resetear" la memoria
                sc.nextLine();
                continue;
            }

            if(numeroIntroducido==numeroAleatorio) {
                System.out.println("numero correcto");
                encontrado=true;
            }
            else if(numeroIntroducido>numeroAleatorio) {
                System.out.println("numero introducido es mayor");
                intentosRestantes--;
                System.out.println(intentosRestantes + " intentos restantes");
            }
            else{
                System.out.println("numero introducido es menor");
                intentosRestantes--;
                System.out.println(intentosRestantes + " intentos restantes");
            }
        }

        sc.close();

    }
}