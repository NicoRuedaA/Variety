package es.cide.programacio;
import java.util.Scanner;

public class Main {
    //declaramos una constante para modificar el maximo de la array
    public static final int MAX = 7; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creamos la array
        String[] arrayStrings = new String[MAX];
        char caracterAbuscar = 'A';
        int repeticiones = 0, aux = 0;


        //llenamos la array
        System.out.println("Introduce " + MAX + " palabras");
        for(int i = 0; i<MAX; i++){
            System.out.println("Introduce valor " + i);
            arrayStrings[i] = sc.nextLine();
        }


        //recorremos la array
        while(aux<MAX){
            if(arrayStrings[aux].charAt(0)==caracterAbuscar) repeticiones++;
            aux++;
        }
        
        System.out.println(repeticiones);

        sc.close();
    }
}