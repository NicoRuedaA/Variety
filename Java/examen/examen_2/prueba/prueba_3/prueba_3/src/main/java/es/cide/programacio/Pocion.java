package es.cide.programacio;

public class Pocion {

    private static String[] nombresPociones = { "pequena, mediana, grande" };
    private static int PUNTOS_MIN = 1;
    private static int PUNTOS_MAX = 30;

    private String nombre;
    private int puntosRecuperacion;

    public Pocion() {
        nombre = "";
        puntosRecuperacion = 0;
    }

    public Pocion(String n, int p) {
        this.nombre = n;
        this.puntosRecuperacion = p;
    }

    public void setPuntosRecuperacion(int x) {
        this.puntosRecuperacion = x;
    }

    public void setNombre(String n) {
        this.nombre = n;
    }

    public int getPuntosRecuperacion() {
        return this.puntosRecuperacion;
    }

    public String getNombre() {
        return this.nombre;
    }

}
