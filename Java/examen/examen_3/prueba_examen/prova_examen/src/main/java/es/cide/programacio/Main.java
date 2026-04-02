package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        // declaramos los objetos
        Vehicle vehicleGeneric = new Vehicle("Nico", "1");
        Cotxe cotxe = new Cotxe("Nico", "2", false);
        Moto moto = new Moto("Nico", "3");

        // variables booleanas
        boolean motoLlesta = false;
        boolean cotxeLlest = false;
        boolean fi = false;

        System.out.println("Benvingut al taller de reparacions de Pep 2026");

        // inicializamos la reparación del coche
        cotxe.carregarBateria();
        moto.carregarBateria();

        System.out.println("Estat de la reparació:");

        // mientras que no sean motollesta i cotxolleste true
        while (!fi) {
            // miramos si cada uno esta listo
            cotxeLlest = cotxe.estaLlest();
            motoLlesta = moto.estaLlest();

            // si ambos estan listos
            if (motoLlesta && cotxeLlest) {
                // salimos
                fi = true;
                System.out.println(" Vehicles entregats!");
                // acabamos el mantenimiento
                cotxe.finalitzarManteniment();
                moto.finalitzarManteniment();

            }
            // si no
            else {
                System.out.println(" Cal esperar.");
                // ambos vuelven a false
                motoLlesta = false;
                cotxeLlest = false;
            }

        }

    }
}