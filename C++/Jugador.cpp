//
// Created by Nico on 24/05/2021.
//

#include "Jugador.h"

Jugador::Jugador() {
    m_nom=" ";
    m_Ma =  Ma();
    m_puntuacio=0;

}

Jugador::Jugador(const string& n) {
    m_nom = n;
    m_Ma =  Ma();
    m_puntuacio=0;
}

string Jugador::Nom() {
    return m_nom;
}

void Jugador::MostrarMa() {
    cout << "MA:" << endl;
    m_Ma.Mostrar();
}

void Jugador::MostrarPilaBonificacions() {

}

void Jugador::AfegirCarta(Carta c) {
    m_Ma.AfegirCarta(c);
}

int Jugador::Puntuacio() const{
        return m_puntuacio;
}

int Jugador::NumeroDeCamells() {
    return m_Ma.NumeroDeCamells();
}

void Jugador::AfegirCamell() {
    m_Ma.AfegirCamell();
}

int Jugador::NumeroDeCartes() {
    return m_Ma.NumeroDeCartes();
}

int Jugador::NumeroDeCartes(char c) {
    return m_Ma.NumeroDeProductes(c);
}

void Jugador::EliminarCartasTipo(int n, char c) {
    for (int i = 0 ; i < n; ++i) {
        m_Ma.RobarCarta(c);
    }
}

int Jugador::AfegirFitxes(int n, char c) {
    return 0
}

void Jugador::AfegirPuntuacio(int n) {
    m_puntuacio+=n;
}

void Jugador::MoverCartasAlaIzqueirda() {

}

void Jugador::RellenarMano() {

}

