package es.cide.programacio;
import java.util.Scanner;

public class Main {
    //declaramos una constante para modificar el maximo de la array
    public static final int MAX = 5; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos la array
        int[] arrayEnters = new int[MAX];

        int mediana=0, aux=0;
        //llenamos la array
        System.out.println("Introduce " + MAX + " valores");
        for(int i = 0; i<MAX; i++){
            System.out.println("Introduce valor " + i);
            arrayEnters[i] = sc.nextInt();
        }
        //recorremos la array
        while(aux<MAX){
            mediana+=arrayEnters[aux];
                aux++;
        
        }

        mediana /= arrayEnters.length;

        System.out.println(mediana);
        
        sc.close();
    }
}