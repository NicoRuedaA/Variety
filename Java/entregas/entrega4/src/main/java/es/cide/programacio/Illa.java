/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

import java.util.Random;

//objeto tipo illa
public class Illa {

    // nombres posibles para la isla
    private static final String[] nombresIsla = { "La Española", "Isla Antigua", "Icacos", "Booby Cay",
            "Waterlemon Cay" };

    // tamaño maximo de la isla. 7. Creamos variable variacion para generarlo
    // aleatoriamente
    private static final int MIDA_VARIACION = 5;
    // tamaño min
    private static final int MIDA_MIN = 3;

    // variables para interactuar durante la partida
    private int mida, pirataActual;
    private Random random = new Random();
    // array que guarda los piratas que nos encontraremos durante la isla
    private Pirata[] arrayPiratas;
    private String nomIlla;

    // Constructor
    public Illa(Insult[] arrayInsultos) {
        // obtenemos el tamaño de la isla - 3
        mida = random.nextInt(MIDA_VARIACION);
        // creamos el array de piratas con el tamaño final de la isla
        this.arrayPiratas = new Pirata[mida + MIDA_MIN];
        // obtenemos el nombre de la isla a partir del tamaño de esta
        nomIlla = nombresIsla[mida];
        // obtenemos un indice del pirata actual contra el que estamos luchando
        this.pirataActual = 0;

        // creamos un pirata para llenar el array de piratas
        for (int i = 0; i < arrayPiratas.length; i++) {
            arrayPiratas[i] = new Pirata(arrayInsultos);
        }
    }

    // pasamos al siguiente pirata. Devolvemos si hemos recorrido toda la isla
    // (array de piratas)
    public boolean nextPirata() {
        pirataActual++;

        return pirataActual >= arrayPiratas.length;
    }

    // devuelve un objeto de tipo pirata por el indice
    public Pirata vullUnPirata(int index) {
        return arrayPiratas[index];
    }

    // devuelve el objeto Pirata según el "pirata actual"
    public Pirata vullPirataActual() {
        return vullUnPirata(pirataActual);
    }

    // devolvemos el array de piratas
    public Pirata[] getArrayPiratas() {
        return this.arrayPiratas;
    }

    // devolvemos el maximo de piratas que puede tener la isla
    public int getMaxPiratas() {
        return this.arrayPiratas.length;
    }

    // devolvemos el nombre de la isla
    public String getNom() {
        return this.nomIlla;
    }

    // imprimimos el numero del pirata atual. Imprimimos el "insulto actual" del
    // "pirta actual"
    public Insult getInsultoActual() {
        System.out.println("Pirata actual: " + pirataActual);
        return vullPirataActual().getInsultoActual();
    }
}
