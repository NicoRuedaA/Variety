package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double operador1, operador2;
        boolean salir = false;
        String operacion = " ";

        System.out.println("Introduce operador 1");
        operador1= sc.nextInt();
        System.out.println("Introduce operador 2");
        operador2 = sc.nextInt();

        Calculadora miCalculadora = new Calculadora(operador1, operador2);

        while(!salir){
            System.out.println("Introduce operacion");
            sc.nextLine();
            operacion = sc.nextLine();
            switch (operacion) {
                case "suma":
                    System.out.println(miCalculadora.Sumar());
                    salir=true;
                    break;
                case "resta":
                    System.out.println(miCalculadora.Restar());
                    salir=true;
                break;
                case "multiplicacion":
                    System.out.println(miCalculadora.Multiplicar());
                    salir=true;
                break;
                case "division":
                    System.out.println(miCalculadora.Dividir());
                    salir=true;
                break;
            }
        }
    
        sc.close();
    }
}