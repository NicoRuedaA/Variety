
package es.cide.programacio;

import java.util.ArrayList;

public interface IGestioPassatgers {
    void registrarPassatger(String nom);

    void modificarReserva(int index, String nouNom);

    void cancellarReserva(String nom);

    String obtenirPassatger(int index);

    void llistarPassatgers();
}
