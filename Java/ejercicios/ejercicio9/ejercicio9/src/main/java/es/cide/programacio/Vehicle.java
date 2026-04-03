package es.cide.programacio;

// CLASSE ABSTRACTA: La base de tots els objectes
public abstract class Vehicle {
    protected String matricula;
    protected String marca;

    public Vehicle(String matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    // Mètode abstracte: obliguem als fills a programar-lo
    public abstract double calcularPreuLloguer(int dies);

    public void mostrarInfo() {
        System.out.println("--- FITXA VEHICLE ---");
        System.out.println("Marca: " + marca);
        System.out.println("Matrícula: " + matricula);
    }
}
