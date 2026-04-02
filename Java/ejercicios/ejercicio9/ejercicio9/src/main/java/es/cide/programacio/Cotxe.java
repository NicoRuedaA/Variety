package es.cide.programacio;

public abstract class Cotxe extends Vehicle {
    protected int places;
    protected int velocidad_maxima;

    public Cotxe(String matri, String mod, int plac, int vel_max) {
        super(matri, mod);
        this.places = plac;
        this.velocidad_maxima = vel_max;
    }

    public int getVelocidadMaxima() {
        return velocidad_maxima;
    }

}
