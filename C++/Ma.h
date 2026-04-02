//
// Created by Nico on 24/05/2021.
//

#ifndef EJERCICIO_MA_H
#define EJERCICIO_MA_H

#include "Carta.h"

class Ma {
public:
    Ma();
    void Mostrar();
    void AfegirCarta(Carta c);
    bool MaPlena();
    bool MaBuida();
    int NumeroDeCartes();
    int NumeroDeProductes(char c);
    int NumeroDeCamells();

    void MoverAlaIzquierda(int n);

    void AfegirCamell();
    void RobatCarta();
    void RobarCarta(char c);

private:
    static const int MAX=7;
    int m_numeroDeCamells, m_numeroDeCartes;
    typedef Carta MaTaula[MAX];
    MaTaula m_Ma;
};


#endif //EJERCICIO_MA_H
