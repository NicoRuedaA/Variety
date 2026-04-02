package es.cide.programacio;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        //declaramos un objeto Scanner 
        Scanner sc = new Scanner(System.in);
        //char[] fraseIntroduida = new char[999];
        //Guardaremos aqui la frase introducida
        String fraseIntroduida = " ";
        System.out.print("Introdueix una paraula o frase:");
        boolean error=false;

        //variables para guardar el numero de vocales y vocales totales
        int vocalsTotals = 0, nombreDeA = 0, nombreDeE = 0, nombreDeI = 0, nombreDeO = 0, nombreDeU = 0, nombreDeVocalsMesIntroduida = 0;

        char vocalMesrepetida = ' ';

        //introducimos una palabra o frase
        do{
            try{
                fraseIntroduida = sc.nextLine();
                error = false;
            }
            catch(InputMismatchException e){
                error = true;
                System.out.println("Input introducido no es correcto");
                sc.nextLine();
            }
        }while(error);


        //recorremos la frase introducida letra por letra
        for(int i = 0; i<fraseIntroduida.length(); i++){
            //en caso de que la letra sea vocal, sumamos 1 a su tipo de vocal y al contador de vocales totales
            switch(fraseIntroduida.charAt(i)){
                //suponemos que el usuario solo introduce minusculas
                case 'a':
                    nombreDeA++;
                    vocalsTotals++;
                break;
                case 'e':
                    nombreDeE++;
                    vocalsTotals++;
                break;
                case 'i':
                    nombreDeI++;
                    vocalsTotals++;
                break;
                case 'o':
                    nombreDeO++;
                    vocalsTotals++;
                break;
                case 'u':
                    nombreDeU++;
                    vocalsTotals++;
                break;
            }
        }
        //menor o menor igual

        //mostramos las estadisitas de la frase introducida
        System.out.println("Nombre de a : " + nombreDeA);
        System.out.println("Nombre de e : " + nombreDeE);
        System.out.println("Nombre de i : " + nombreDeI);
        System.out.println("Nombre de o : " + nombreDeO);
        System.out.println("Nombre de u : " + nombreDeU);
        System.out.println("Nombre total de vocals : " + vocalsTotals);

        //al ser A la primera vocal a analizar, la ponemos como la mas repetida al principio
        nombreDeVocalsMesIntroduida=nombreDeA;
        vocalMesrepetida = 'a';

        //miramos que vocal se repite mas usando el numero de veces que se ha repetido la vocal mas repetida
        if(nombreDeE > nombreDeVocalsMesIntroduida) {
            nombreDeVocalsMesIntroduida = nombreDeE;
            vocalMesrepetida = 'e';
        }
        if(nombreDeI > nombreDeVocalsMesIntroduida){
            nombreDeVocalsMesIntroduida = nombreDeI;
            vocalMesrepetida = 'i';
        }
        if(nombreDeI > nombreDeVocalsMesIntroduida){
            nombreDeVocalsMesIntroduida = nombreDeO;
            vocalMesrepetida = 'o';   
        }
        if(nombreDeI > nombreDeVocalsMesIntroduida){
            nombreDeVocalsMesIntroduida = nombreDeU;
            vocalMesrepetida = 'u';
        }

        if(nombreDeVocalsMesIntroduida == 0) System.out.println("No hi ha vocals");
        else System.out.println("La vocal mes repetida es " + vocalMesrepetida + " " + nombreDeVocalsMesIntroduida + " vegades");



        sc.close();
    }
}