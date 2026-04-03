package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        EstacionEspacial estacionAegis = new EstacionEspacial("Aegis", 100, 100);
        Asteroide[] arrAsteroides = { new Asteroide("Rocoso"), new Asteroide("Rocoso"), new Asteroide("Rocoso"),
                new Asteroide("Helado"), new Asteroide("Metalico"), };

        boolean estacionEnPie = true;
        int i = 0;

        while (estacionEnPie && i < arrAsteroides.length) {

            System.out.println(arrAsteroides[i].toString());
            System.out.println(estacionAegis.toString());

            estacionEnPie = estacionAegis.interceptar(arrAsteroides[i]);

            if (estacionEnPie && estacionAegis.getEnergia() < 20) {
                estacionAegis.recargarEnergia();
            }

            i++;
        }

        if (estacionEnPie)
            System.out.println("Exito");
        else
            System.out.println("Fracaso");

    }
}