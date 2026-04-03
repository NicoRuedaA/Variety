package com.cide.entorns;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0,  contador = 0;
        System.out.println("Introduce A");
        a = sc.nextInt();
        System.out.println(a/10);
        boolean seguir = true;
        do{
            contador++;
            if(a/10==0) seguir = false;
            else a=a/10;
        }while(seguir);
        System.out.println("A tiene " + contador + " valores" );
        sc.close();
    }
}