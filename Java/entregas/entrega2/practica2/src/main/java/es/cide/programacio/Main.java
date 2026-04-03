//Nicolás Daniel Rueda Araque
//42313237e
//07/10/2025

package es.cide.programacio;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //opcio define que operacion vamos a realizar. Valor 1 y 2 sus operantes
        int opcio=0, valor1=0, valor2=0;
        double resultat=0;
        //el programa se repite hasta que salga true
        boolean salir=false;
        
        do {
            //imprimimos el menu de opciones
                    System.out.println(
            "----- MENÚ -----\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Sortir\n" +
            "Tria una opció:");

            //elegimos una opcon del menu
            opcio = sc.nextInt();

            //si la opcion es correcta, introducimos los valores para operar. Si no, no hace falta
            if(opcio>0 && opcio<5){
                System.out.println("Introdueix el primer número: ");
                valor1=sc.nextInt();
                System.out.println("Introdueix el segon número: ");
                valor2=sc.nextInt();
            }
            //si no, se ejcuta la opcion default del switch

        //operamos (o no)
            switch (opcio) {
                case 1:
                    //suma
                    resultat = (double)valor1+valor2;
                    System.out.println("Resultat: " + resultat);
                    break;
                case 2:
                    //resta
                    resultat = (double)valor1-valor2;
                    System.out.println("Resultat: " + resultat);
                    break;
                case 3:
                    //multiplicacion
                    resultat = (double)valor1*valor2;
                    System.out.println("Resultat: " + resultat);
                    break;
                case 4:             
                    //opcion no valida 
                    if(valor2==0) System.out.println("Error: no es pot dividir per 0"); 
                    else{
                        resultat = (double)valor1/valor2;
                        System.out.println("Resultat: " + resultat);
                    }
                    break;
                case 5:
                    //exit
                    System.out.println("Gràcies per utilitzar la calculadora!");
                    salir=true;
                    break;
                default:
                    //opcion incorrecta
                System.out.println("Error: opció incorrecta"); 
                    break;
            }
        } while (!salir);

        sc.close();
    }
}