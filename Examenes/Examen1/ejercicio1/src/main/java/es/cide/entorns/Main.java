//Nicolás Daniel Rueda Araque
//29/10/2025
package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean fi = false;
        int nombre = 0, aux = 0, resultat = 0;

        nombre = sc.nextInt();
        aux = nombre/2;

        //primero obtenemos los divisores
        while (!fi) {
            if(aux==0) fi = true;
            if(!fi){
                if(nombre%aux==0){
                resultat+=aux;
                }
                aux--;

            }
        }
        //System.out.println(resultat);    
        if(resultat==nombre) System.out.println(nombre + " és perfecte");
        else System.out.println(nombre + " no és perfecte");

        sc.close();
    }
}