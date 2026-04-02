//
// Created by Nico on 14/05/2021.
//

#ifndef EJERCICIO_2_BARALLA_H

#include "Carta.h"


#define EJERCICIO_2_BARALLA_H


class Baralla {
public:
    Baralla();
    Baralla(int n);
    Baralla(const Baralla& elem);
    void Barrejar();
    void Afegir(Carta c);
    Carta Robar();
    void Robar(int n);
    void Mostrar();
    int Random(int n);
    int CartesRestants() const;
    //operator ==
    Carta CartaAPosicio(int i);

private:
    void Liberar();
    void Reservar();
    void Copiar(const Baralla & elem);
    void Expandir();
    void Inicializar();
    void Intercambiar(Carta& c1, Carta& c2);

    int m_llavor;
    int m_numDeCartes;
    Carta *m_Baralla;
    int m_tamanyTaula;
};


#endif //EJERCICIO_2_BARALLA_H
