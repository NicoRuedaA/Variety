//
// Created by Nico on 19/05/2021.
//

const int limitDeCartes = 7, cartesInicials=5;

#ifndef EJERCICIO_JOC_H
#define EJERCICIO_JOC_H

#include "Baralla.h"
#include "Jugador.h"
#include "PilaBonificacions.h"
#include "Tauler.h"

class Joc{
public:
    Joc();
    void Inicialitzar();


    Joc(string j1, string j2, int llavor);

    void MostrarEstatDelJoc() ;
    bool ComprovarCondicionsFi();
    void AfegirCamells();

    //intercambio de cartas entre jugadores
    //intercambio de cartas entre jugador y mercado

    void IntercanviarProductes();
    void AgafarProducte();
    void AgafarCamells();
    void VendreCartes();
    void AbandonarPartida();


private:
    Baralla m_Baralla;
    Jugador m_J1, m_J2;
    int m_llavor,  m_tornActual;
    Tauler m_Mercat;
    PilaBonificacions m_tauladePiles[6];
    PilaBonificacions m_pilaJugador1, m_pilaJugador2;
    bool m_finalitzar, m_finalitzarTorn;

    void IncrementarTorn();
    void RellenarMercado();


    void PrepararMercat();
    void RepartirCartesInicials();
    void InicialitzarPilesDeBonificacions();
    void Finalitzar();

    Fitxa RobarFitxaPila(int &n);

    void EstatDelJugador(Jugador j, const PilaBonificacions& p);
    void RepartirCartesIncicials(Baralla& b, Ma &m1, Ma &m2, int n_c);
    void EmplenarMercar();
    void InicialitzarPilasDeBonificacion();
    bool ValidarAccion();
};

#endif //EJERCICIO_JOC_H
