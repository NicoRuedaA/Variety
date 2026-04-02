//
// Created by Nico on 19/05/2021.
//

#ifndef EJERCICIO_PILACARTES_H
#define EJERCICIO_PILACARTES_H
#include "Carta.h"

class PilaCartes {
public:
    PilaCartes();
    PilaCartes(const PilaCartes &o);

    bool Existeix(Carta c) const;
    bool Buida() const;
    void Mostrar() const;

    void Empilar(Carta c);
    void Eliminar(Carta c);
    void Desempilar();
    ~PilaCartes();

    int Mida() const;
    Carta Cim();

    PilaCartes& operator=(const PilaCartes &o);


private:
    struct Node {
        Carta m_Carta;
        Node *seg;
    };

    Node *m_Cim, *m_Final;
    int m_numeroDeCartes;
    //m_numeroDeCamells;

    void Allibera();
    void Copia(const PilaCartes &p);
};


#endif //EJERCICIO_PILACARTES_H

