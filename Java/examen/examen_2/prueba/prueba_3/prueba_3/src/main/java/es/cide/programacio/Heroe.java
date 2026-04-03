package es.cide.programacio;

public class Heroe {
    private String nombre;
    private int vida;
    private int VIDA_MAX = 200;
    private String elemento;
    private Pocion[] mochila;

    Heroe(String n, String e, int v) {
        this.nombre = n;
        this.vida = v;
        this.elemento = e;
        this.mochila = new Pocion[3];
    }

}
