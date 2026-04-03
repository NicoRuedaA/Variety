package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b;
        System.out.print("Introduce los nombres");
        a = sc.next();
        b = sc.next();
        if(a.compareTo(b)>0){
            System.out.print(a + " > " + b);
        }
        else if (a.compareTo(b)<0){
            System.out.print(a + " < " + b);
        }
        else System.out.print(a + " = " + b);
        sc.close();
    }
}