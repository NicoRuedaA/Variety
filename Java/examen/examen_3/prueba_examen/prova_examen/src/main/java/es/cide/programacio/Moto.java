package es.cide.programacio;

import java.util.Random;

public class Moto extends Vehicle implements Manteniment, Energia {
    Random random = new Random();

    // ***CONSTRUCTORS***/

    public Moto() {

    }

    public Moto(String a, String b) {
        super(a, b);
    }

    // ***METODES***/
    // metodo para registrar el vehiculo
    public void revisarVehicle() {
        System.out.println("Vehicle registrat: Cotxe de " + this.propietari);

    }

    // metodo para iniciar la revision
    public void carregarBateria() {
        System.out.println("Iniciant revisió de la moto...");
    }

    // comprobamos si esta listo
    public boolean estaLlest() {
        int x = random.nextInt(101);
        if (x >= 40) {
            System.out.print("la moto està llesta.");
        } else {
            System.out.print("la moto encara està al taller.");
        }
        return x >= 40;
    }

    // miramos si tiene corriente
    public boolean teCorrent() {
        int x = random.nextInt(101);
        if (x >= 50) {
            System.out.println("la moto té corrent");
        } else
            System.out.println("la moto no té corrent");
        return x >= 50;
    }

    // acabamos el mantenimiento
    public void finalitzarManteniment() {
        System.out.println("Manteniment finalitzat de la moto");
    }

}
