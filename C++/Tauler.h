//
// Created by Nico on 19/05/2021.
//

#ifndef EJERCICIO_TAULER_H
#define EJERCICIO_TAULER_H

#include "Carta.h"

class Tauler{
public:
    Tauler();
    void Mostrar();
    void Afegir(const Carta& c);
    Carta Treure();
    Carta Treure(int n);

    //pasar puntero de nuestra baraja, sacar 3 y ponerlos
    void AfegirCamells(int n);
    void MoverALaIzquierda(int posicio);


    bool Ple();
    int Mida();
    int NumeroDeCamells();

    Carta TreureCamell();

private:
    static const int MAX=5;
    int m_numeroDeCamells, m_numeroDeCartes;
    typedef Carta Mercat[MAX];
    Mercat m_Mercat;

};

#endif //EJERCICIO_TAULER_H
