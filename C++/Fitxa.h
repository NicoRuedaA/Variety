//
// Created by Nico on 19/05/2021.
//

#ifndef EJERCICIO_FITXA_H
#define EJERCICIO_FITXA_H
#include <iostream>

using namespace std;

class Fitxa {
public:
    Fitxa();
    Fitxa(char d, int n);

    void Mostrar() const ;
    int Valor() const ;
    char Tipus() const ;

    bool operator >=(const Fitxa &b) const;
    bool operator ==(const Fitxa &b) const;
    friend ostream &operator<<( ostream &output,const Fitxa &elem );
    //friend istream &operator>>( istream  &input, const Fitxa &elem );
    Fitxa& operator =(const Fitxa &b);


private:
    int m_valor;
    char m_tipus;

};


#endif //EJERCICIO_FITXA_H
