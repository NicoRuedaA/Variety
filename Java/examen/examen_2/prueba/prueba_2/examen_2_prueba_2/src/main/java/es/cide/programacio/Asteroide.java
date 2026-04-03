package es.cide.programacio;

import java.util.Random;

public class Asteroide {
    // rocoso hielo o metalico
    private static final int MASA_MAX = 50;
    private static final int MASA_MIN = 10;

    private String tipo;
    private int masa;

    private Random random;

    public Asteroide() {
        tipo = "";
        masa = 0;
    }

    public Asteroide(String t) {
        this.tipo = t;
        random = new Random();
        this.masa = random.nextInt(MASA_MIN, MASA_MAX + 1);
    }

    public void recibeDisparo() {

        this.masa -= 5;
        System.out.println("Disparao recibido, masa restante: " + this.masa);
    }

    @Override
    public String toString() {

        return ("Asteroide " + this.tipo + " de " + this.masa + " toneladas.");
    }

    public boolean estadoAsteroide() {
        return this.masa > 0;
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setMasa(int m) {
        this.masa = m;
    }

    public String getTipo() {
        return this.tipo;
    }

    public int getMasa() {
        return this.masa;
    }

}
