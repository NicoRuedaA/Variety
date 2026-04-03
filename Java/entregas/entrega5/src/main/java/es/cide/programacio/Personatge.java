package es.cide.programacio;

public abstract class Personatge {

    // variables del objeto
    protected String nom;
    protected int vida;

    // ***CONSTRUCTOR***
    public Personatge(String nom, int vida) {
        this.nom = nom;
        this.vida = vida;
    }

    public abstract boolean vida();
}