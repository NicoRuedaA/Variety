package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b;
        String operacion;
        System.out.println("Introduce operacion");    
        operacion = sc.next();

        //System.out.println("suma".equals("suma"));

        while(operacion!="aturar"){

            //si sumamos o restamos
            if(((operacion=="sumar"))||((operacion=="restar"))){
                //introducimos a y b
                System.out.println("Introduce a");
                a = sc.nextDouble();
                System.out.println("Introduce b");    
                b = sc.nextDouble();
                    if(operacion=="sumar"){
                    //sumamos
                    System.out.println("resultado " + (a + b));
                    }
                    //restamos
                    else if(operacion=="restar"){
                    System.out.println("resultado " + (a - b));
                }
            }

            //si es inversion
            else if(operacion=="inversion"){
                //introducimos solo a
                System.out.println("Introduce a");
                a = sc.nextDouble();
                System.out.println("resultado " + -a);
            }
            else System.out.println("operacion no soportada");

            System.out.println("Introduce operacion");    
            operacion = sc.next();
        }
        sc.close();
    }
}