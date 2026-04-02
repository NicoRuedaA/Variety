//Nicolás Daniel Rueda Araque
//42313237e
//14/10/25

package es.cide.programacio;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        char opcion = ' ';
        int insulto = -1, respuestaCorrecta = -1, respuestaIncorrecta1 = -1, respuestaIncorrecta2 = -1,
                respuestaElegida = -1, puntosJugador = 0, puntosIniciales = 0, opcionesMostradas = 0;
        // creamos una array con todos los insultos
        String[] arrayInsultos = {
                "¡Luchas como un granjero! ¡ Ordeñaré hasta la última gota de sangre de tu cuerpo !",
                "¡No hay palabras para describir lo asqueroso que eres! Ya no hay técnicas que te puedan salvar.  ",
                "¡He hablado con simios más educados que tu! Ahora entiendo lo que significan basura y estupidez.",
                "¡No pienso aguantar tu insolencia aquí sentado! ¡ Eres como un dolor en la parte baja de la espalda !",
                "¡Mi pañuelo limpiará tu sangre!",
                "¡Ha llegado tu HORA, palurdo de ocho patas! Hoy te tengo preparada una larga y dura lección.",
                "¿Has dejado ya de usar pañales? Espero que tengas un barco para una rápida huida.",
                "¡Una vez tuve un perro más listo que tu! Sólo he conocido a uno tan cobarde como tú.",
                "¡Nadie me ha sacado sangre jamás, y nadie lo hará! Nunca me verán luchar tan mal como tú lo haces.",
                "¡Me das ganas de vomitar! Si tu hermano es como tú, mejor casarse con un cerdo.",
                "¡Tienes los modales de un mendigo! Cada palabra que sale de tu boca es una estupidez.",
                "¡He oído que eres un soplón despreciable! Mi espada es famosa en todo el Caribe ¡ Mi nombre es temido en cada sucio rincón de esta isla !",
                "¡La gente cae a mis pies al verme llegar! Mis enemigos más sabios corren al verme llegar - Veo gente como tú arrastrándose por el suelo de los bares.",
                "¡Demasiado bobo para mi nivel de inteligencia! ¡ Tengo el coraje y la técnica de un maestro !"
        };

        // creamos una array con cada respuesta
        String[] arrayRespuestas = {
                "Qué apropiado, tú peleas como una vaca.",
                "Sí que las hay, sólo que nunca las has aprendido.",
                "Me alegra que asistieras a tu reunión familiar diaria.",
                "Ya te están fastidiando otra vez las almorranas, ¿Eh?",
                "Ah, ¿Ya has obtenido ese trabajo de barrendero?",
                "Y yo tengo un SALUDO para ti, ¿Te enteras?",
                "¿Por qué? ¿Acaso querías pedir uno prestado?",
                "Te habrá enseñado todo lo que sabes.",
                "¿TAN rápido corres?",
                "Me haces pensar que alguien ya lo ha hecho.",
                "Quería asegurarme de que estuvieras a gusto conmigo.",
                "Qué pena me da que nadie haya oído hablar de ti",
                "¿Incluso antes de que huelan tu aliento?",
                "Estaría acabado si la usases alguna vez."
        };

        //creamos un array de opciones mostradas. Las que sean = true no se volverán a mostrar
        //no hace falta inicializar el array. Por defecto se inician en false en Java
        boolean[] opcionYaMostrada = new boolean[arrayInsultos.length];


        //aqui guardaremos las 3 opciones a elegir cada ronda
        String[] respuestasOpciones = new String[3];

        System.out.println("Bienvenido al concurso de insultos de Monkey Island");
        System.out.println("Cada ronda muestra un insulto. Cada acierto suma 2 puntos. Cada error resta 1 punto.");
       

        //introducimos con cuantas vidas (puntos) queremos jugar
        while (puntosJugador < 1) {
            try {
                System.out.print("¿Cuántas vidas quieres marinero? ");
                puntosIniciales = sc.nextInt();
                puntosJugador = puntosIniciales;
            }

            catch (InputMismatchException e) {
                // e.printStackTrace();
                System.out.println("Error: introduce únicamente números");
                //introducimos esto para sacarlo de búcle y "resetear" la memoria
                sc.nextLine();
            }
        }


        //creamos un bucle. Mientras la opción elegida no sea n, seguimos jugando
        while (opcion != 'n' && opcionesMostradas < arrayInsultos.length && puntosJugador>0) {

            //cualquier letra menos n avanza. La n sale del juego
            System.out.println("Pulsa cualquier letra para generar un insulto. 'n' para salir");
            try {
                opcion = sc.next().charAt(0);
            } catch (InputMismatchException e) {
                // e.printStackTrace();
                System.out.println("Error: introduce únicamente un carácter");
                // introducimos esto para sacarlo de búcle y "resetear" la memoria
                sc.nextLine();
            }

            // si seguimos jugando
            if (opcion != 'n') {
                // generamos un numero aleatorio dentro del rango de la lista de insultos
                do{
                insulto = random.nextInt(arrayInsultos.length);
                }while(opcionYaMostrada[insulto]);

                respuestaCorrecta = insulto;
                

                // generamos 2 respuestas incorrectas
                do {
                    // generamos un numero aleatorio entre 0 y el tamaño de la array. Nos indicará
                    // la posición de la respuesta que queremos guardar
                    respuestaIncorrecta1 = random.nextInt(arrayInsultos.length);
                    // si la respuesta generada es la correcta, repetimos
                } while (respuestaIncorrecta1 == respuestaCorrecta);
                // lo mismo que el anterior
                do {
                    respuestaIncorrecta2 = random.nextInt(arrayInsultos.length);
                    // comprobamos que la respuesta generada no es la misma que la anterior
                } while (respuestaIncorrecta2 == respuestaCorrecta || respuestaIncorrecta2 == respuestaIncorrecta1);

                // introducimos las 3 respuestas posibles en un array
                respuestasOpciones[0] = arrayRespuestas[respuestaCorrecta];
                respuestasOpciones[1] = arrayRespuestas[respuestaIncorrecta1];
                respuestasOpciones[2] = arrayRespuestas[respuestaIncorrecta2];

                // mezclamos el array para imprimirlas por pantalla en un orden aleatorio con
                // Fisher-Yates
                for (int i = respuestasOpciones.length - 1; i > 0; i--) {
                    int j = random.nextInt(i + 1);
                    String aux = respuestasOpciones[i];
                    respuestasOpciones[i] = respuestasOpciones[j];
                    respuestasOpciones[j] = aux;
                }

                // mostramos el insulto y las 3 opciones de respuesta
                System.out.println(arrayInsultos[insulto]);
                System.out.println("1) " + respuestasOpciones[0]);
                System.out.println("2) " + respuestasOpciones[1]);
                System.out.println("3) " + respuestasOpciones[2]);

                // el programa repetirá pedirá un numero hasta que el usuario meta un numero entre 1 y 3
                // correcto
                do {
                    try {
                        System.out.print("Respuesta (1-3): ");
                        respuestaElegida = sc.nextInt();
                    }

                    catch (InputMismatchException e) {
                        // e.printStackTrace();
                        System.out.println("Error: introduce únicamente números");
                        // introducimos esto para sacarlo de búcle y "resetear" la memoria
                        sc.nextLine();
                        respuestaElegida = -1;
                    }

                } while (respuestaElegida > 3 || respuestaElegida < 1);

                // si elegimos la respuesta correcta
                if (respuestasOpciones[respuestaElegida - 1].equals(arrayRespuestas[respuestaCorrecta])) {
                    System.out.println("¡CORRECTO!");
                    opcionYaMostrada[insulto]= true;
                    opcionesMostradas ++;
                    puntosJugador+=2;
                }
                // si no....
                else {
                    System.out.println("Incorrecto");
                    // en vez de restar puntos, resto vidas
                    puntosJugador--;
                }
                System.out.println("Tienes " + puntosJugador + " punto/s.");

            }
            // si elegimos n salimos del bucle y nos despedimos
            else{
                System.out.println("Acabaste antes de tiempo gallina! Con " + puntosJugador + " punto/s y ");
            }
        }

        System.out.println("Fin");
        //sacamos una respuesta según los puntos
        if (puntosJugador >= arrayInsultos.length)
            System.out.println(" ¡Has ganado! ¡Eres el rey de los piratas!");
        else if (puntosJugador >= arrayInsultos.length / 2)
            System.out.println("Te has defendido como un buen marinero");
        else
            System.out.println("¡LOS LOROS SE RIEN DE TI!");

        sc.close();
    }
}