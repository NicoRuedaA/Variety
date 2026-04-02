package es.cide.programacio;

import java.util.Random;

public class Obstacle {

    // *********** CONSTANTS ***********
    private static final int DIF_MIN = 1;
    private static final int DIF_MAX = 7;

    private static final int TIPUS_MIN = 1;
    private static final int TIPUS_MAX = 3;

    private static final String[] tipusDeObstacle = { "Seto", "Barra", "Valla" };

    // *********** VARIABLES ***********
    private Random random;

    private String tipus;
    private int dificultat;

    // *********** CONSTRUCTORS ***********

    public Obstacle() {
        // inicialitzam el objecte random
        random = new Random();
        // generam una posicio aleatoria entre 0 i 3
        int tip = random.nextInt(TIPUS_MIN - 1, TIPUS_MAX);
        // assignam el tipus random amb el nombre generat anteriorment
        this.tipus = tipusDeObstacle[tip];
        // generam la dificultat aleatoria
        this.dificultat = random.nextInt(DIF_MIN, DIF_MAX + 1);
    }

    // *********** METODES PUBLICS ***********

    public void mostrar() {
        // mostram informacio de l'obstacle
        System.out.println("Obstacle de tipus " + this.getTipus() + " i dificultat " + this.getDificultat());
    }

    // *********** GETS I SETS ***********

    public void setTipus(String s) {
        this.tipus = s;
    }

    public void setDificultat(int d) {
        this.dificultat = d;
    }

    public String getTipus() {
        return this.tipus;
    }

    public int getDificultat() {
        return this.dificultat;
    }

}
