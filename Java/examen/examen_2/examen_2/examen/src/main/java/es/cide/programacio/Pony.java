package es.cide.programacio;

import java.util.Random;

public class Pony {

    // *********** CONSTANTS ***********

    private static final int FORCA_MIN = 1;
    private static final int FORCA_MAX = 5;

    // *********** OBJECTES ***********

    private Random random;

    // *********** VARAIBLES ***********

    private String nom;
    private int energia;
    private int forca;

    // *********** CONSTRUCTORS ***********
    public Pony() {
        // constructor per defecte nomes per tenir variables inicialitzades
        this.nom = "";
        this.energia = 0;
        this.forca = 1;
    }

    public Pony(String n, int e) {
        this.nom = n;
        this.energia = e;

        random = new Random();
        this.forca = random.nextInt(FORCA_MIN, FORCA_MAX + 1);

    }

    // *********** METODES PUBLICS ***********

    public void mostrar() {
        // mostram la informacio total del pony
        System.out.println("El pony " + this.getNom() + " te " + this.getForca() + " de força i " + this.getEnergia()
                + " d'energia.");
    }

    public void mostrarEnergia() {
        // mostram l'estat de la energia del pony
        if (this.getForca() > 0) {
            System.out.println("Energia restant: " + getEnergia());
        } else
            System.out.println("El pony no té energia restant");
    }

    public boolean superarObstacle(Obstacle o) {
        // variables para comprobar si la dificultad es impar
        double x = o.getDificultat();
        int y = 0;
        // si el pony te mer forca que dificultat l'obstacle
        if (this.compararObstacle(o)) {
            // el pony bota lobstacle
            System.out.println("El pony bota l'obstacle de dificultat " + o.getDificultat() + " amb " + this.getForca()
                    + " força");
            // reduir energia del pony a la meitad de la dificultat de lobstacle
            // miram si la dificultat es impar, li sumam 1
            if (x % 2 != 0)
                y++;
            // reduim la energia (mes 1 si es impar)
            this.reduirEnergia(o.getDificultat() / 2 + y);

        } else {
            // el pony no pot botar l'obstacle
            System.out.println("El pony no pot botar l'obstacle de dificultat " + o.getDificultat() + " amb "
                    + this.getForca() + " força");
        }

        if (this.getEnergia() <= 0)
            System.out.println("El pony mor a l'intent");

        return this.getEnergia() > 0;
    }

    public boolean compararObstacle(Obstacle o) {
        // comparam si el pony te mes forca que dificultat l'obstacle
        return this.getForca() > o.getDificultat();
    }

    // *********** METODES PRIVATS ***********

    private void reduirEnergia(int x) {
        // reduim la energia en x
        this.energia -= x;
    }

    // *********** GETS I SETTERS ***********

    public String getNom() {
        return this.nom;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getForca() {
        return this.forca;
    }

    public void setNom(String s) {
        this.nom = s;
    }

    public void setEnergia(int e) {
        this.energia = e;
    }

    public void setForca(int f) {
        this.forca = f;
    }

}
