//
// Created by Nico on 19/05/2021.
//

#include "Fitxa.h"


//CONSTRUCTORS
Fitxa::Fitxa() {
    m_valor=0;
    m_tipus='c';
}

Fitxa::Fitxa(char d, int n) {
    m_tipus=d;
    m_valor= n;
}

//CONSULTORS
void Fitxa::Mostrar() const  {
    cout << "(" << m_tipus << m_valor << ")";
}

int Fitxa::Valor() const {
    return m_valor;
}

char Fitxa::Tipus() const  {
    return m_tipus;
}


            //OPERADORES
bool Fitxa::operator>=(const Fitxa &b) const {
    return m_valor>=b.m_valor;
}

bool Fitxa::operator==(const Fitxa &b) const {
    return (m_valor>=b.m_valor)&&(m_tipus>=b.m_tipus);
}

ostream &operator<<(ostream &output, const Fitxa &elem) {
    output << elem.m_valor << " " << elem.m_tipus << endl;
}

Fitxa& Fitxa::operator=(const Fitxa &b) {
    m_valor=b.m_valor;
    m_tipus=b.m_tipus;
}


