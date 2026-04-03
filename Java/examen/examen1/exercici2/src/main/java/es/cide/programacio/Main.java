//Nicolás Daniel Rueda Araque
//DNI 42313237e
//21/10/25

package es.cide.programacio;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class Main {

    private static final int DIFERENCIA_CALENT = 10;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //creamos las variables para almacenar el numero aleatorio, el que introduciremos, el numero de intentos y la diferencia
        //entre el numero introducido y el generado
        int nombreGenerat = 0, nombreIntroduit = -1, intents = 0, diferencia=0;
        //un bool para comprobar que hemos acertado y otro para comprobar si seguimos jugando. Un bool error para comprobar que solo introducimos ints
        boolean endevinat = false, repetir = true, error = false;
        //usaremos un string ¨jugar¨ como llave para repetir el juego
        String sortirDeljoc = " ";
    

        while(repetir){
            //generamos un numero entre 1 y 200
            nombreGenerat =  random.nextInt(200) + 1;

            //mientras no hayamso adivinado el numer0
            while(!endevinat){

                System.out.println("Esdevina el nombre:");
                //introducimos un numero
                //comprobamos que la linea introducida es solo un numero
                do{
                    //introducimos un numero
                    try{
                        
                        nombreIntroduit = sc.nextInt();
                        error= false;
                    }
                    //en caso de un error en el input
                    catch(InputMismatchException e){
                        //mostramos mensaje de error
                        System.out.println("ERROR: Introduce solo un numero");
                        //nos asguramos de quedarnso en el while
                        error = true;
                        //limpiamos buffer
                        sc.nextLine();
                    }

                    //nos aseguramos de introducir un valor correcto
                    if(nombreIntroduit>200||nombreIntroduit<1) {
                        //mensaje de error para el usuario
                        System.out.println("ERROR: Introduce solo un valor entre 1 y 200");
                        //nos quedamos en el bucle
                        error = true;
                    }
                    
                }while(error);
                
                //añadimos un intento
                intents ++;
                
                //comprobar que el numero sea mayor que 0 y menor que 201 y añadir try y catch
                //si hemos adivinado el numero
                if(nombreIntroduit==nombreGenerat){
                    //saldremos del bucle
                    endevinat = true;
                }
                else{   
                    //calculamos si la diferencia del valor introducida es muy grande 
                    diferencia = nombreGenerat - nombreIntroduit;
                    //"valor absoluto"
                    if(diferencia<0) diferencia=-diferencia;

                    //si la diferencia es mayor que 10 mostramos...
                    if(diferencia> DIFERENCIA_CALENT) System.out.println("Estás fred");
                    //si no...
                    else System.out.println("Estás calent");
                    //si el numero introducido es mayor que el buscado...
                    if (nombreIntroduit>nombreGenerat){
                        System.out.println("El nombre és molt gran");
                    }
                    //sino (será menor)...
                    else {
                    System.out.println("El nombre és molt petit");
                    }
                }
            }

            //mostramos mensajes según el numero de intentos
            if(intents>10) System.out.println("Es pot millorar");
            else if (intents >1) System.out.println("No está malament");
            else System.out.println("Ets un crack!");

            //mostramos el numero de intentos
            System.out.println("Ho has intentat " + intents + " vegades");

            //preguntamos al usuario si queremos volver a jugar. Cualquie rinput que no sea 'jugar' hace que salgamos del juego
            System.out.println("Escriu 'jugar' per tornar a jugar");
            //limpiamos el buffer
            sc.nextLine();
            sortirDeljoc = sc.nextLine();

            //si decidimos volver a jugar reiniciamos las variables
            if(sortirDeljoc.equals("jugar")) {
                nombreIntroduit = -1;
                intents = 0;
                endevinat=false;
            }
            //sino salimos del juego
            else repetir = false;
    
        }
        

        System.out.println("ADEU!");

        sc.close();
    }
}
