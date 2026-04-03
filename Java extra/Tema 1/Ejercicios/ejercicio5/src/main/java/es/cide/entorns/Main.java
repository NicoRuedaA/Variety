package es.cide.entorns;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0, aux=0;
        boolean esPrimo=true;

        //el usuario solo ingresará valores enteros
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();
        aux=numero-1;
        if (numero==1) esPrimo = false;
        while(esPrimo&&aux>1){
            if(numero%aux==0) esPrimo=false;
            aux--;
        }
        if (esPrimo) System.out.println("Es primo");
        else System.out.println("No es primo");
        sc.close();
    }
}