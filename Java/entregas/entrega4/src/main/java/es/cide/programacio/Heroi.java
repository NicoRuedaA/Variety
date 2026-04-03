/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

import java.util.Scanner;

//objeto de tipo Heroi
public class Heroi {

    // vida (inicial) constante
    private static final int VIDA = 10;

    // variables para interactuar durante el juego
    private String nom;
    private int vida;
    // array con todas las respuestas posibles del pirata
    private Insult[] arrayRespuestas;

    // constructor por defecto
    public Heroi() {
        this.nom = "";
        this.vida = VIDA;
        this.arrayRespuestas = new Insult[0];
    }

    // constructor a partir del nombre s (que introduciremos por consola en el main)
    public Heroi(String s, Insult[] arrResp) {
        this.nom = s;
        this.vida = VIDA;
        this.arrayRespuestas = arrResp;
    }

    // restamos 1 de vida. Devolvemos si el jugador sigue vivo
    public boolean vida() {
        this.vida--;
        return vida > 0;
    }

    // imprimimos la lista de respuestas posibles. Elegimos uno. Lo devolvemos
    public String defensar() {
        Scanner scHeroi = new Scanner(System.in); // no hace falta cerrarlo. Basta con cerrar Scanner al final en el
                                                  // main. Lo ideal sería pasar el scanner del main tal que defensar(sc)

        UI.escribirLento(" ¿Qué le contestas? (1-10)", 15);
        System.out.println();
        // mostramos las respuestas
        mostrarRespuestas();
        // elegimos una
        int respuesta = getInputValidado(scHeroi);
        // devolvemos la respuesta elegida
        return arrayRespuestas[respuesta].getTextoRespuesta();
    }

    // imprimimos la lista de respuestas posibles
    private void mostrarRespuestas() {
        // mostramos cada String espuesta del array de objeto tipo Insults

        for (int i = 0; i < arrayRespuestas.length; i++) {
            UI.escribirLento((i + 1) + " " + arrayRespuestas[i].getTextoRespuesta(), 5);
            System.out.println();
        }
    }

    // validamos el input de defensar()
    private int getInputValidado(Scanner scan) {
        int res = -1;
        System.out.println();

        // mientras el input no esté contenido entre 1 y 10, repetimos
        while (res < 1 || res > arrayRespuestas.length) {
            System.out.println();
            UI.escribirLento(("Introdueix la teva resposta 1-10: "), 15);
            // miramos si se introduce un dato de tipo diferente a int
            try {
                res = scan.nextInt();
                if (res < 1 || res > arrayRespuestas.length)
                    // hemos introducido un valor fuera de rango
                    UI.escribirLento(("Fuera de rango:"), 15);
            } catch (Exception e) {
                // limpiamos buffer
                scan.next();
            }
            System.out.println();
        }

        // devolvemos la posición de la respuesta elegida. Restamos 1 ya que el usuario
        // elige a partir del 1, no el 0
        return res - 1;
    }

    // get que devuelve String de la variable "nom"
    public String getNom() {
        return this.nom;
    }

    // get que devuelve el int de la variable "vida"
    public int getVida() {
        return this.vida;
    }

}
