//
// Created by Nico on 14/05/2021.
//

#ifndef EJERCICIO_2_CARTA_H
#define EJERCICIO_2_CARTA_H

#include <iostream>
using namespace std;

class Carta{
public:
    Carta();
    //que coño es explicit
    Carta(char a);

    char Tipo() const;
    void Mostrar() const;
    bool EsCamell() const;

    bool operator ==(const Carta &b) const;
    bool operator ==(char &b) const;
    Carta& operator =(const Carta&c);

private:
    char m_tipus;
};


#endif //EJERCICIO_2_CARTA_H
