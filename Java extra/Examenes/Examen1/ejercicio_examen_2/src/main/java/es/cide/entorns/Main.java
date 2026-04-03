package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String texto = " ";
        texto = sc.nextLine();

        for (int i = texto.length(); i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        
        sc.close();
    }
}