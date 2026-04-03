package es.cide.programacio;
import java.util.Scanner;

public class Main {
    //declaramos una constante para modificar el maximo de la array
    public static final int MAX = 5; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos la array
        String[] arrayStrings = new String[MAX];
        String[] palabrasIguales = new String[MAX];

        String palabrasAbuscar = " ";

        System.out.println("introduce palabra");
        palabrasAbuscar = sc.nextLine();

        int aux=0;

        //llenamos la array
        System.out.println("Introduce " + MAX + " palabras");
        for(int i = 0; i<MAX; i++){
            System.out.println("Introduce valor " + i);
            arrayStrings[i] = sc.nextLine();
        }
        //recorremos la array
        while(aux<MAX){
            if(arrayStrings[aux].length()==palabrasAbuscar.length()) System.out.print(arrayStrings[aux]);
            aux++;
        
        }
        
        sc.close();
    }
}