package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int d = 0, n =0; 
            boolean contiene = false;

        d=sc.nextInt(); 
        n=sc.nextInt();

        while(n>0 && !contiene){
            if(n%10==d) contiene = true;
            n=n/10;
        }

        if(contiene) System.out.println("SI"); else System.out.println("NO");
        sc.close();

    }
}