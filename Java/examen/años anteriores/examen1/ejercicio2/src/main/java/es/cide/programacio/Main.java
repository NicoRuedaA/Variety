package es.cide.programacio;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    private static final int MAX = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int valorIntroducido = -1, maximo=Integer.MIN_VALUE, minimo=Integer.MAX_VALUE;  
        double mediana = -1 ;

        int listaDeEnteros[] = new int[MAX];

        for(int i=0; i<MAX; i++){
            try{
                valorIntroducido = sc.nextInt();
            }
            catch(InputMismatchException e){
                System.out.println("Error: introduce únicamente un numero");
                sc.nextLine();
            }
            listaDeEnteros[i] = valorIntroducido;
            if(listaDeEnteros[i] > maximo) maximo = listaDeEnteros[i];
            if(listaDeEnteros[i] < minimo) minimo = listaDeEnteros[i];
        }

        for(int i=0; i<MAX; i++){
            mediana+=listaDeEnteros[i];
        }
        mediana/=MAX;

        System.out.println("mediana : " + mediana);
        System.out.println("minimo : " + minimo);
        System.out.println("maximo : " + maximo);

        sc.close();
    }
}