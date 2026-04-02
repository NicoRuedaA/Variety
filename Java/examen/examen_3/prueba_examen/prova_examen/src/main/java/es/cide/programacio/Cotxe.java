package es.cide.programacio;

import java.util.Random;

public class Cotxe extends Vehicle implements Manteniment, Energia {
    boolean esTesla;
    Random random = new Random();

    // ***CONSTRUCTORS***/

    public Cotxe() {

    }

    public Cotxe(String a, String b, boolean t) {
        super(a, b);
        esTesla = t;
    }

    // ***METODES***/
    // registramos el vehiculo
    public void revisarVehicle() {
        System.out.println("Vehicle registrat: Cotxe de " + this.propietari);

    }

    // cargamos la bateria
    public void carregarBateria() {
        System.out.println("Iniciant revisió del cotxe...");
    }

    // miramos si el coche esta listo
    public boolean estaLlest() {
        Random random = new Random();
        int x = random.nextInt(101);
        if (x >= 80) {
            System.out.print("El cotxe està llest i ");
        } else
            System.out.print("El cotxe encara està al taller i ");
        return x >= 80;
    }

    // acabamos el mantenimiento
    public void finalitzarManteniment() {
        if (this.getEsTesla())
            System.out.println("Manteniment finalitzat del cotxe. És un Tesla.");

        else
            System.out.println("Manteniment finalitzat del cotxe. No és un Tesla.");

    }

    // comprobamos si tiene corriente
    public boolean teCorrent() {
        int x = random.nextInt(101);
        if (x >= 50) {
            System.out.println("la moto té corrent");
        } else
            System.out.println("la moto no té corrent");
        return x >= 50;
    }

    // ***SETS***/
    public void setEsTesla(boolean esTesla) {
        this.esTesla = esTesla;
    }

    // ***GETS***/
    public boolean getEsTesla() {
        return esTesla;
    }

}
