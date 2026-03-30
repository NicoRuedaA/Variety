package es.cide.programacio;

import java.util.ArrayList;

public class GestioVols {

    // creamos un array list
    private ArrayList<String> llistaPassatgers = new ArrayList<String>();

    // constructor default
    public GestioVols() {

    }

    // registramos un pasajero
    void registrarPassatger(String nom) {
        llistaPassatgers.add(nom);
    }

    // modificamos una reserva segun el numero de indice
    void modificarReserva(int index, String nouNom) {
        llistaPassatgers.set(index, nouNom);
    }

    // cancelamos la reserva
    void cancellarReserva(String nom) {
        llistaPassatgers.remove(nom);
    }

    // obtenemos pasajero por indice
    String obtenirPassatger(int index) {
        return llistaPassatgers.get(index);
    }

    // imprimimos todos los pasajeros
    void llistarPassatgers() {
        for (String passatger : llistaPassatgers) {
            // por cada objeto tipo string en el array
            System.out.println(passatger);
        }
    }
}
