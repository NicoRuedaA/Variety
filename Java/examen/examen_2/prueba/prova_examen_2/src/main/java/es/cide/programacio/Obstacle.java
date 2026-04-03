package es.cide.programacio;

import java.util.Random;

//objecte obstacle
public class Obstacle {
    // constants per declarar dificultats aleatories
    private static final int MIN_DIF = 1;
    private static final int MAX_DIF = 10;

    // nom del obstable
    private String tipus;
    // dificultat de l'obstacle
    private int dificultat;

    // constructor per fecte
    public Obstacle() {
        Random random = new Random();

        this.tipus = "";
        // declaram una dificultat aleatoria
        this.dificultat = random.nextInt(MIN_DIF, MAX_DIF + 1);
    }

    // constructor a partir de tipus i dificultat
    public Obstacle(String t, int d) {
        this.tipus = t;
        this.dificultat = d;
    }

    // constructor a partir de tipus
    public Obstacle(String t) {
        Random random = new Random();
        this.tipus = t;
        // declaram una dificultat aleatoria
        this.dificultat = random.nextInt(MIN_DIF, MAX_DIF + 1);
    }

    @Override
    public String toString() {
        // retornam la informació del nostre objecte en foram de String
        return ("Aquest obstacle es tipus " + tipus + " de dificultat " + dificultat);
    }

    public String getTipus() {
        // retorna el String tipus
        return this.tipus;
    }

    public int getDificultat() {
        // retorna el int dificultat
        return this.dificultat;
    }

}
