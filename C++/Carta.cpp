//
// Created by Nico on 14/05/2021.
//

#include "Carta.h"


            //CONSTRUCTORES
Carta::Carta() {
    m_tipus = 'c';
}

Carta::Carta(char a) {
    m_tipus = a;
}


            //CONSULTORES
void Carta::Mostrar() const {
    cout << "[" << m_tipus << "]";
}

char Carta::Tipo() const {
    return m_tipus;
}

bool Carta::EsCamell() const {
    return m_tipus=='C';
}


            //OPERADORES
bool Carta::operator==(const Carta &b) const {
    return m_tipus==b.m_tipus;
}

bool Carta::operator==(char &b) const {
    return m_tipus==b;
}

Carta &Carta::operator=(const Carta &c) {
    m_tipus=c.m_tipus;
}

