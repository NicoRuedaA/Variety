package es.cide.programacio;

import java.util.Random;

public class Monstruo {

    private static final int VIDA_MIN = 10;
    private static final int VIDA_MAX = 100;
    private static final int DANO_MIN = 10;
    private static final int DANO_MAX = 20;

    private static Random random = new Random();

    private String nombre;
    private String elemento;
    private int vida;
    private int vidaMax;
    private int danoBase;

    public Monstruo(String n, String e) {
        this.nombre = n;
        this.elemento = e;
        this.vida = random.nextInt(VIDA_MIN, VIDA_MAX + 1);
        this.vidaMax = vida;
        this.danoBase = random.nextInt(DANO_MIN, DANO_MAX + 1);
    }

    public int atacar() {
        if (this.vida < this.vidaMax / 5) {
            // critico
            return this.danoBase * 2;
        } else
            return this.danoBase;
    }

    public void recibirDano(int cantidad) {
        this.vida -= cantidad;
        if (this.vida < 0)
            vida = 0;
    }

    public boolean estaVivo() {
        return this.vida > 0;
    }

    public String getNobre() {
        return this.nombre;
    }

    public String getElemento() {
        return this.elemento;
    }

    public int getVida() {
        return this.vida;
    }

    public int getDanoBase() {
        return this.danoBase;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setElemento(String e) {
        this.elemento = e;

    }

    public void setVida(int v) {
        this.vida = v;
    }

    public void setDanobase(int d) {
        this.danoBase = d;
    }

}
