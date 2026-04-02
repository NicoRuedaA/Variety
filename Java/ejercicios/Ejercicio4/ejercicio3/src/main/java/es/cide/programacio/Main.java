package es.cide.programacio;
import java.util.Scanner;

public class Main {
    //declaramos una constante para modificar el maximo de la array
    public static final int MAX = 6; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos la array
        int[] arrayEnters = new int[MAX];

        int valorMenor, aux=1;
        //llenamos la array
        System.out.println("Introduce " + MAX + " valores");
        for(int i = 0; i<MAX; i++){
            System.out.println("Introduce valor " + i);
            arrayEnters[i] = sc.nextInt();
        }
        //recorremos la array
        valorMenor=arrayEnters[0];
        while(aux<MAX){
                if(valorMenor>arrayEnters[aux]) valorMenor = arrayEnters[aux];
                aux++;
        
        }

        System.out.println(valorMenor);
        
        sc.close();
    }
}