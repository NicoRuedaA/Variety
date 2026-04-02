//
// Created by Nico on 24/05/2021.
//

#ifndef EJERCICIO_JUGADOR_H
#define EJERCICIO_JUGADOR_H

#include "PilaCartes.h"
#include "Ma.h"


class Jugador {
public:
    Jugador();
    Jugador(const string& n);
    //operador ==

    void MostrarMa();
    string Nom();
    void MostrarPilaBonificacions();

    void AfegirCarta(Carta c);
    void AfegirCamell();
    int AfegirFitxes(int n, char c);
    void AfegirPuntuacio(int n);

    void MoverCartasAlaIzqueirda();
    void RellenarMano();


    int Puntuacio() const;
    int NumeroDeCamells();
    int NumeroDeCartes();
    int NumeroDeCartes(char c);

    void EliminarCartasTipo(int n, char c);





private:
    string m_nom;
    Ma m_Ma;
    int m_puntuacio;
    //pila de bonificaciones
};


#endif //EJERCICIO_JUGADOR_H
