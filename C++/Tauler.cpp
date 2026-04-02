//
// Created by Nico on 19/05/2021.
//

#include "Tauler.h"

Tauler::Tauler() {
    m_numeroDeCamells=0;
    m_numeroDeCartes=0;
    m_Mercat[MAX];
}

void Tauler::Afegir(const Carta& c) {
    //cout << "anadida: ";
    //c.Mostrar();
    //cout << "En el deck : ";
    m_Mercat[m_numeroDeCartes]=c;

    //m_Mercat[m_numeroDeCartes].Mostrar();
    m_numeroDeCartes++;
    //cout << endl;
}

void Tauler::AfegirCamells(int n) {
    for(int i=0; i<n; i++){
        m_numeroDeCamells++;
        m_Mercat[m_numeroDeCartes]=Carta('C');
        m_numeroDeCartes++;
    }
}

void Tauler::Mostrar() {
    if(m_numeroDeCartes==0){
        cout << "NO HI HA CAP CARTA" << endl;
    }
    else{
        for(int i=0; i<m_numeroDeCartes; i++){
            cout << i << ":" ;
            m_Mercat[i].Mostrar();
        }
        cout << endl;
    }
}

Carta Tauler::Treure() {
    if(m_numeroDeCartes==0){
        cout << "NO HI HA CAP CARTA" << endl;
        return Carta(' ');
    } else{
        Carta aux = m_Mercat[m_numeroDeCartes];
        m_numeroDeCartes--;
        return aux;
    }
}

Carta Tauler::Treure(int n) {
    if(m_numeroDeCartes==0){
        cout << "NO HI HA CAP CARTA" << endl;
        return Carta(' ');
    } else{
        Carta aux = m_Mercat[n];
        for (int i = n; i < m_numeroDeCartes-1 ; i++) {
            m_Mercat[i]=m_Mercat[i+1];
        }
        m_numeroDeCartes--;
        return aux;
    }
}

bool Tauler::Ple() {
    return m_numeroDeCartes==5;
}

int Tauler::Mida() {
    return m_numeroDeCartes;
}

int Tauler::NumeroDeCamells() {
    return m_numeroDeCamells;
}

Carta Tauler::TreureCamell() {
    if(m_numeroDeCamells==0){
        cout << "NO HI HA CAP Camell" << endl;
        return Carta(' ');
    } else{
        bool trobat= false;
        int i=m_numeroDeCartes;
        while (!trobat&&i!=0){
            if (m_Mercat[i]=='C'){
                trobat=true;
            }
            i--;
        }
        //no hace falta if trobat porque hay mínimo un camello
        for (int j = i; j < m_numeroDeCartes-1; ++j) {
            m_Mercat[i]=m_Mercat[i+1];
        }
        m_numeroDeCamells--;
        m_numeroDeCartes--;
        return Carta('C');
    }
}


