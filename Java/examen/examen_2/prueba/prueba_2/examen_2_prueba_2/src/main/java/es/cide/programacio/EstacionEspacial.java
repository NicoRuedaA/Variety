package es.cide.programacio;

public class EstacionEspacial {
    private String nombre;
    private int energia;
    private int integridadEscudo;
    private int integridadEscudoMax;

    public EstacionEspacial() {
    }

    public EstacionEspacial(String n, int e, int i) {
        this.nombre = n;
        this.energia = e;
        this.integridadEscudo = i;
        this.integridadEscudoMax = i;
    }

    public void recargarEnergia() {
        if (this.integridadEscudo > this.integridadEscudoMax / 2) {
            System.out.println("Energia recargada");
            energia += 20;
        } else
            System.out.println("No se pudo recargar la energia. Escudo demasiado bajo");
    }

    public boolean interceptar(Asteroide a) {
        boolean asteroideVivo = true;
        boolean estacionConEn = true;
        while (estacionConEn && asteroideVivo) {
            disparar(a);
            estacionConEn = estacionConEnergia();
            asteroideVivo = a.estadoAsteroide();
        }

        if (asteroideVivo) {
            System.out.println("Asteroide impacta");
            asteroideImpacta(a);
        } else
            System.out.println("Asteroide destruido");

        this.toString();
        return estacionOperativa();
    }

    private void asteroideImpacta(Asteroide a) {
        this.integridadEscudo -= a.getMasa();
    }

    @Override
    public String toString() {
        return ("Estacion " + this.nombre + " tiene " + this.energia + " de energia y " + this.integridadEscudo
                + " de escudo.");
    }

    private boolean estacionOperativa() {
        return this.integridadEscudo > 0;
    }

    public boolean estacionConEnergia() {
        return this.energia > 0;
    }

    public void disparar(Asteroide a) {
        if (this.energia >= 5) {
            this.energia -= 5;
            a.recibeDisparo();
        } else
            System.out.println("Sin energia suficiente, restante : " + energia);

    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public void setEnergia(int e) {
        this.energia = e;
    }

    public void setIntegridadEscudo(int i) {
        this.integridadEscudo = i;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getIntegridadEscudo() {
        return this.integridadEscudo;
    }

}
