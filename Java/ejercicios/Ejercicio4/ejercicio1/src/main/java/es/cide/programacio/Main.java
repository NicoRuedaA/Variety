package es.cide.programacio;
import java.util.Scanner;

public class Main {
    //declaramos una constante para modificar el maximo de la array
    public static final int MAX = 6; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos la array
        int[] arrayEnters = new int[MAX];
        int aux=MAX;
        //llenamos la array
        System.out.println("Introduce " + MAX + " valores");
        for(int i = 0; i<MAX; i++){
            System.out.println("Introduce valor " + i);
            arrayEnters[i] = sc.nextInt();
        }
        //recorremos la array
        while(aux>0){
            
                System.out.print(arrayEnters[aux-1] + " ");
                aux--;
        
        }

        
        sc.close();
    }
}