package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int sietes = n/7, cuatros= 0, aux=0;

        boolean salir = false, solucion=true;
        
        while(sc.hasNextInt()){
            n = sc.nextInt();
            sietes = n/7; cuatros= 0; aux=0;
            salir = false; solucion=true;
                while(!salir && solucion){
                    aux = n-sietes*7;
                    if(aux%4!=0) {
                        sietes--;
                        if(sietes<0) {
                            //caso que n sea menor a 18
                            System.out.println("sin solucion"); 
                            solucion = false;
                        }
                    }
                    else{
                        cuatros = aux/4;
                        salir=true;
                    }
                }
            if(solucion) System.out.println(sietes + " " + cuatros);
        }
        sc.close();
    }
}