/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */

package es.cide.programacio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // abrimos el scanner
        Scanner sc = new Scanner(System.in);

        // creamos la isla pasandole nuestra array estatica de objetos "insult"
        Illa illa = new Illa(InsultArray.getInsults());
        // creamos un heroe (vacío)
        Heroi heroi;

        // variables para interactuar durante el juego
        boolean respuestaEsCorrecta, acabarJuego = false;
        String heroiNom, insulto, respuestaElegida;

        // imprimimos el título "The Secret of Monkey Island"
        UI.titulo(illa);

        // introducimos el nombre de nuestro protagonista. Inicializamos el objeto heroi
        // con este nombre y la array
        heroiNom = sc.nextLine(); // pedimos el nombre del jugador y creamos un Heroi con este
        heroi = new Heroi(heroiNom, InsultArray.getInsults());

        // metodos visuales
        UI.escribirLento("Nuestro héroe " + heroi.getNom() + " se encuentra con " + illa.getMaxPiratas() + " piratas",
                40);
        UI.pausa(2000);
        UI.limpiarConsola();

        while (!acabarJuego) {

            // Mostramos una UI con las barras de vidas del jugador y pirata
            UI.mostrarUI(heroi.getVida(), 10, illa.vullPirataActual().getNom(),
                    illa.vullPirataActual().getVida(),
                    illa.vullPirataActual().getVidaMax(), heroi.getNom(), illa.getMaxPiratas());

            // obtenemos el string insulto del "pirata actual"
            insulto = illa.vullPirataActual().insultar();

            // imprimimos el nombre del pirata actual y el String "insulto"
            UI.escribirLento(illa.vullPirataActual().getNom() + ": " + insulto, 15);
            // mostramos las posibles respuestas, elgimos una y la devolvemos
            respuestaElegida = heroi.defensar();
            // comparamos el string devuelto en defensar() con la respuesta correcta del
            // "pirata actual"
            respuestaEsCorrecta = illa.vullPirataActual().replica(respuestaElegida);

            // metodos visuales
            UI.animarGolpe();
            UI.pausa(1000);
            UI.limpiarConsola();

            // si la respuesta es correcta
            if (respuestaEsCorrecta) {
                // restamos una vida
                if (!illa.vullPirataActual().vida()) {
                    // si se queda sin vidas, pasamos al siguiente pirata
                    if (illa.nextPirata()) {
                        // si la isla se queda sin piratas, el juego se acaba y hemos ganado
                        acabarJuego = true;
                        // metodo visual
                        UI.finDelJuego(true);
                    }
                }
                // si la respuesta es incorrecta
            } else if (!heroi.vida()) {
                // si nos quedamos sin vida, el juego se acaba y hemos perdido
                acabarJuego = true;
                // metodo visual
                UI.finDelJuego(false);
            }
        }

        // cerramos el scanner
        sc.close();
    }

}
