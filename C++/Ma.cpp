//
// Created by Nico on 24/05/2021.
//

#include "Ma.h"
Ma::Ma() {
    m_Ma[MAX];
    m_numeroDeCartes=0;
    m_numeroDeCamells=0;
}
void Ma::Mostrar() {
    for (int i = 0; i < m_numeroDeCartes; i++) {
        if(!m_Ma[i].EsCamell()){
            cout << i << ":";
            m_Ma[i].Mostrar();
            cout << " ";
        }
        else m_numeroDeCamells++;

    }

    cout << endl << "CAMELLS:" << endl << "7:";

    if(m_numeroDeCamells>0) {
        for (int i = 0; i < m_numeroDeCamells; i++) {
            cout << "[C]";
        }
        cout << endl;
    } else cout << "NO HI HA CAP CARTA" << endl;
}

void Ma::AfegirCarta(Carta c) {
    if(m_numeroDeCartes<=7){
        m_Ma[m_numeroDeCartes]=c;
        m_numeroDeCartes++;
    }
    else cout << "tengo muchas cartas compadre" << endl;
}

bool Ma::MaPlena() {
    return m_numeroDeCartes==7;
}

bool Ma::MaBuida() {
    return m_numeroDeCartes==0;
}

int Ma::NumeroDeCartes() {
    return m_numeroDeCartes;
}

int Ma::NumeroDeProductes(char c) {
    int n=0;
    for (int i = 0; i < m_numeroDeCartes; ++i) {
        if(m_Ma[i].Tipo() == c) n++;
    }
    return n;
}

int Ma::NumeroDeCamells() {
    return m_numeroDeCamells;
}

void Ma::AfegirCamell() {
    m_numeroDeCamells++;
}
