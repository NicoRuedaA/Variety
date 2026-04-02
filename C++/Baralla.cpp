//
// Created by Nico on 14/05/2021.
//

#include "Baralla.h"

const int a=1103515245, 	c	=	12345, m = 32768;

int Baralla::Random(int max) {
    unsigned int x = (a*m_llavor+c);
    m_llavor = x;
    return unsigned((x/32%m)%max);
}

Baralla::Baralla(int n) {
    m_numDeCartes =0;
    m_tamanyTaula = 5;
    m_llavor=n;
    Reservar();
    Inicializar();
}

Baralla::Baralla() {
    m_numDeCartes =0;
    m_tamanyTaula = 5;
    m_llavor=1;
    Reservar();
    Inicializar();
}

Baralla::Baralla(const Baralla &elem) {
    Copiar(elem);
}

/*for (int i = a_n - 1; i > 0; i--) {
        int pos = aleatori(i + 1);
        intercanvi(a_t[pos], a_t[i]);
    }*/


void Baralla::Barrejar(){
    for(int i =m_numDeCartes-1; i>0; i--){

        int pos = Random(i+1);

        Intercambiar(m_Baralla[pos], m_Baralla[i]);
    }
}


void Baralla::Intercambiar(Carta& c1, Carta& c2) {
    Carta aux;
    aux = c1;
    c1 = c2;
    c2 = aux;
}


void Baralla::Inicializar() {
    for(int i =0; i<10;i++){
        Carta('c');
        Afegir(Carta('c'));
    }
    for(int i =0; i<8;i++){
        Afegir(Carta('e'));
    }
    for(int i =0; i<8;i++){
        Afegir(Carta('t'));
    }
    for(int i =0; i<6;i++){
        Afegir(Carta('p'));
    }
    for(int i =0; i<6;i++){
        Afegir(Carta('o'));
    }
    for(int i =0; i<6;i++){
        Afegir(Carta('d'));
    }
    for(int i =0; i<11;i++){
        Afegir(Carta('C'));
    }
}


void Baralla::Afegir(Carta d) {
    if(m_numDeCartes==m_tamanyTaula) Expandir();
    m_Baralla[m_numDeCartes] = d;
    m_numDeCartes++;

}

Carta Baralla::Robar() {
    Carta aux = m_Baralla[m_numDeCartes-1];
    m_Baralla[m_numDeCartes-1]=' ';
    m_numDeCartes--;
    return aux;
}

void Baralla::Robar(int pos) {
        for(int i=pos; i<m_numDeCartes-1;i++) {
            m_Baralla[i]=m_Baralla[i+1];
            m_numDeCartes--;
        }
}


void Baralla::Mostrar() {
    for(int i =0; i<m_numDeCartes;i++){

        m_Baralla[i].Mostrar();
    }
    cout << endl;
}

void Baralla::Reservar() {
    m_Baralla = new Carta[m_tamanyTaula];
}

void Baralla::Expandir(){
    Carta *aux = m_Baralla;
    m_tamanyTaula*=2;
    Reservar();
    for(int i = 0; i<m_numDeCartes; i++){
        m_Baralla[i] = aux[i];
    }
    delete[] aux;
}

void Baralla::Liberar() {
    delete [] m_Baralla;
}


void Baralla::Copiar(const Baralla & elem) {
    m_numDeCartes=elem.m_numDeCartes;
    m_tamanyTaula=elem.m_tamanyTaula;
    Reservar();
    for(int i=0; i<m_numDeCartes; i++){
        m_Baralla[i] = elem.m_Baralla[i];
    }
}

int Baralla::CartesRestants() const {
    return m_numDeCartes;
}

Carta Baralla::CartaAPosicio(int i) {
    return m_Baralla[i];
}


