package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        // creamos objeto tipo GestioVols
        GestioVols meuVol = new GestioVols();

        // añadimos los avengers
        meuVol.registrarPassatger("Tony Stark");
        meuVol.registrarPassatger("Steve Rogers");
        meuVol.registrarPassatger("Thor Odinson");
        meuVol.registrarPassatger("Natasha Romanoff");

        System.out.println("Passatger a la fila 0: " + meuVol.obtenirPassatger(0));

        meuVol.modificarReserva(1, "Bruce Banner");
        meuVol.cancellarReserva("Thor Odinson");

        System.out.println("--- Llista Final d'Embarcament ---");
        meuVol.llistarPassatgers();
    }
}
