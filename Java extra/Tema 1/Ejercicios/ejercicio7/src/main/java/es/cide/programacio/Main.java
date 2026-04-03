package es.cide.programacio;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fraseIntroduida = " ";
        String[] frasesIntroducidas = new String[99];
        boolean puntoEncontrado=false, primerPuntoEncontrado = false;
        int lineasLeidas=0;

        //variables para guardar el numero de vocales y vocales totales
        int nombreDeA = 0;

        System.out.print("Introdueix una paraula o frase:");
        //introducimos una frase
        while(!puntoEncontrado){
            //leo una frase
                fraseIntroduida = sc.nextLine();
            //leo todas las letras de esta frase
                for (int i = 0; i < fraseIntroduida.length(); i++) {
                    //si se encuentra un punto lo indicamos para salir del bucle
                    if(fraseIntroduida.charAt(i)=='.') puntoEncontrado = true;
                }
                //metemos la frase introducida en un array
                frasesIntroducidas[lineasLeidas] = fraseIntroduida;
                //sumamos 1 a la referencia del tamaño dela array
                lineasLeidas++;
        }

        //recorremos el array frase por frase
        for (int i = 0; i < lineasLeidas; i++) {
            //recorremos la frase
            for(int j = 0; j<frasesIntroducidas[i].length(); j++){
                //si no hemos encontrado el primer punto
                if(!primerPuntoEncontrado){
                    switch(frasesIntroducidas[i].charAt(j)){
                        //si el caracter es un punto, lo indicamos para no analizar el resto
                        case '.':
                            primerPuntoEncontrado=true;
                        break;
                        //si es una a, sumamos 1 al contador
                        case 'a':
                            nombreDeA++;
                        break;
                    }
                }    
            }
        }
        
        //mostramos el numero de As encontradas
        System.out.println("Nombre de a : " + nombreDeA);

        sc.close();
    }
}