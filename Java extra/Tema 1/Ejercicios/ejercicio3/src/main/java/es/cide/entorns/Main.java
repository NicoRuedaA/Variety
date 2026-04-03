package es.cide.entorns;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = -1, y = -1, resultado=0;
        //introducimos x
        while(x<0){
            System.out.println("Introduce un valor X positivo");
            x=sc.nextInt();
        }
        //introducimos y
        while(y<0){
            System.out.println("Introduce un valor Y positivo");
            y=sc.nextInt();
        }
        //sumamos x y veces
        while(y>0){
            resultado+=x;
            y--;
        }
        //imprimimos el resultado
        System.out.println("X por Y es igual a " + resultado);


        sc.close();
    }
}