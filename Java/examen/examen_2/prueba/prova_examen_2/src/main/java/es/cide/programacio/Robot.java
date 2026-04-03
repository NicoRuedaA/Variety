package es.cide.programacio;

//objecte robot
public class Robot {

    // atributs privats d'aquest
    private String nom;
    private int energia;
    private int forca;

    // constructor per defecte
    public Robot() {
        nom = " ";
        energia = 0;
        forca = 0;
    }

    // constructor amb valors donats
    public Robot(String n, int e, int f) {
        this.nom = n;
        this.energia = e;
        this.forca = f;
    }

    public String getNom() {
        // retorna el String nom
        return this.nom;
    }

    public int getEnergia() {
        // retorna el int energia
        return this.energia;
    }

    public int getForca() {
        // retorna el int força
        return this.forca;
    }

    public void mostrarEnergia() {
        // Si el robot no te energia mostra...
        if (energia <= 0) {
            System.out.println("el robot no te energia");
        }
        // sino (si te energia) mostra la energia del robot
        else
            System.out.println("el robot te : " + energia + " energia.");
    }

    public boolean superarObstacle(Obstacle o) {
        // reduim la energia del robot multiplicant la dificultat de l'obstacle *2
        this.energia -= o.getDificultat() * 2;
        // retorna si la energia es major que 0
        return energia > 0;
    }

}
