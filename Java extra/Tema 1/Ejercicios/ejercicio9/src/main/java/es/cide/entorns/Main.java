package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nombreEntrades = -1;
        String tipoEntrada = " ";
        
        System.out.println("Quantes entrades vols?");
        nombreEntrades = sc.nextInt();
        String[][] valors = new String[nombreEntrades][3];

        /*valors [0] = sc.next();
        valors [1] = sc.next();
        System.out.println(valors[0]);
                System.out.println(valors[1]);*/

        for (int i = 0; i < nombreEntrades; i++) {
            
            do{
                System.out.println("Introduce un valor");
                valors[i][0] = sc.next();
            }while((!valors[i][0].equals("circulo")) && (!valors[i][0].equals("rectangulo")));
            System.out.println("Introduce valor1");
            valors[i][1] = sc.next();  
            if(valors[i][0].equals("rectangulo")){
                            System.out.println("Introduce valor2");
                valors[i][2] = sc.next();  
            }
        }

        for (int i = 0; i < nombreEntrades; i++) {
            
        }
        System.out.println(valors[0][0] + valors [0][1] + valors[0][2]);

        /*
        if(valors[0].substring(0, 7).equals("circulo")){
            System.out.println("Es un circulo");
        }
        else if (valors[0].substring(0, 10).equals("rectangulo")){
            System.out.println("Es un rectangulo");
        } */

        sc.close();
    } 

    //String type = sc.nect();
    //if(type.equals("rectangulo"))
        //double lenghts = sc.nextInt()
        //double lo otro
        //double resultado es...

}