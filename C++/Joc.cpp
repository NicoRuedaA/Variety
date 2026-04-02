//
// Created by Nico on 19/05/2021.
//


#include "Joc.h"

            //CONSTRUCTORS
Joc::Joc() {
    m_llavor=1;
    m_J1=Jugador();
    m_J2=Jugador();
    m_tornActual=0;
    m_finalitzarTorn = false;
    m_Baralla=Baralla();
    m_Mercat=Tauler();
    m_pilaJugador1 = PilaBonificacions();
    m_pilaJugador2 = PilaBonificacions();

                for (int i = 0; i < 6; ++i) {
                    m_tauladePiles[i]=PilaBonificacions();
                }

    //piladebonificacions
    m_finalitzar=false;
    Inicialitzar();
}

Joc::Joc(string j1, string j2, int llavor) {
    m_llavor=llavor;
    m_J1=Jugador(j1);
    m_J2=Jugador(j2);
    m_tornActual=1;
    m_Baralla=Baralla(llavor);
    m_Mercat=Tauler();
    m_finalitzarTorn = false;
    m_pilaJugador1 = PilaBonificacions();
    m_pilaJugador2 = PilaBonificacions();
    for (int i = 0; i < 6; ++i) {
        m_tauladePiles[i]=PilaBonificacions();
    }
    m_finalitzar=false;
    Inicialitzar();
}

void Joc::IncrementarTorn() {
    m_tornActual++;
}




void Joc::EmplenarMercar() {

}

void Joc::InicialitzarPilasDeBonificacion() {

}

bool Joc::ValidarAccion() {
    return false;
}

bool Joc::ComprovarCondicionsFi() {
    return m_finalitzar;
}

//CONSTRUCTOREs

//MODIFICADORES

//CONSULTORES
void Joc::MostrarEstatDelJoc() {
    //eso se puede hacer global? aparece en agafar producte
    string tornDe;
    ((m_tornActual%2)!=0) ? tornDe = m_J1.Nom(): tornDe = m_J2.Nom();

    cout << "TORN DE " << tornDe << endl << "====================" << endl << endl
         << "ESTAT DEL JOC" << endl << endl;

    ((m_tornActual%2)!=0) ? EstatDelJugador(m_J1, m_pilaJugador1):EstatDelJugador(m_J2, m_pilaJugador2);
    //mostrar taula
    //m_tauladePiles.Mostrar();

    //pila de bonificacions
    //no hi ha cap fitxa de bonificacio
    //puntuacio actual

    //RECURSIVIDAD MUY FACILMENTE
    cout << "BONIFICACIONS" << endl;
    cout << "PILA DE CUIR:"; m_tauladePiles[5].Mostrar(); //cout << endl;
    cout << "PILA DE ESPECIES:"; m_tauladePiles[4].Mostrar();//cout << endl;
    cout << "PILA DE TELES:"; m_tauladePiles[3].Mostrar();//cout << endl;
    cout << "PILA DE PLATA:"; m_tauladePiles[2].Mostrar();//cout << endl;
    cout << "PILA DE OR:"; m_tauladePiles[1].Mostrar();//cout << endl;
    cout << "PILA DE DIAMANTS:"; m_tauladePiles[0].Mostrar();//cout << endl;



    cout << endl;
    cout << "QUEDEN " << m_Baralla.CartesRestants() <<  " CARTES A LA BARALLA" << endl << endl;
    m_finalitzarTorn = false;
}

    void Joc::EstatDelJugador(Jugador j, const PilaBonificacions& p){

    cout << j.Nom() << endl;
    j.MostrarMa();
    j.MostrarPilaBonificacions();

    cout << "PILA DE BONIFICACIONS:" << endl;
    p.Mostrar();
    cout << "PUNTUACIO ACTUAL:" << j.Puntuacio()  << endl << endl;

    if(!m_finalitzarTorn) {
        m_finalitzarTorn = true;
        cout << "MERCAT" << endl;
        m_Mercat.Mostrar();
        cout << endl;
        ((m_tornActual%2)!=0) ?  EstatDelJugador(m_J2, m_pilaJugador2): EstatDelJugador(m_J1, m_pilaJugador1);
    }
}


void Joc::RepartirCartesInicials() {
    //m_Baralla.Mostrar();
    //cout << endl;


    for (int j = 0; j < cartesInicials * 2; j++) {
        if (j % 2) {
            m_J2.AfegirCarta(m_Baralla.Robar());
        } else {
            m_J1.AfegirCarta(m_Baralla.Robar());
        }
    }
}


void Joc::Inicialitzar() {
    //hacer operador igual en clase baraja

    PrepararMercat();
    RepartirCartesInicials();
    //m_Baralla.Mostrar();
    InicialitzarPilesDeBonificacions();

    //CREAR PILA DE CAMELLOS
}



//ESTO SE PUEDE MEJORAR MUCHO
void Joc::InicialitzarPilesDeBonificacions() {
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[0].Empilar(Fitxa('d', 7));
    }
    //m_tauladePiles[0].Mostrar();

    for (int i = 0; i < 3; ++i) {
        m_tauladePiles[0].Empilar(Fitxa('d', 5));
    }

    //m_tauladePiles[0].Mostrar();

    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[1].Empilar(Fitxa('o', 6));
    }
    for (int i = 0; i < 3; ++i) {
        m_tauladePiles[1].Empilar(Fitxa('o', 5));
    }

    for (int i = 0; i < 5; ++i) {
        m_tauladePiles[2].Empilar(Fitxa('p', 5));
    }

    m_tauladePiles[3].Empilar(Fitxa('t', 5));
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[3].Empilar(Fitxa('t', 3));
    }
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[3].Empilar(Fitxa('t', 2));
    }
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[3].Empilar(Fitxa('t', 1));
    }

    m_tauladePiles[4].Empilar(Fitxa('e', 5));
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[4].Empilar(Fitxa('e', 3));
    }
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[4].Empilar(Fitxa('e', 2));
    }
    for (int i = 0; i < 2; ++i) {
        m_tauladePiles[4].Empilar(Fitxa('e', 1));
    }

    m_tauladePiles[5].Empilar(Fitxa('c', 4));
    //AQUI
    m_tauladePiles[5].Empilar(Fitxa('c', 3));
    m_tauladePiles[5].Empilar(Fitxa('c', 2));

    for (int i = 0; i < 6; ++i) {
        m_tauladePiles[5].Empilar(Fitxa('c', 1));
    }
}





void Joc::PrepararMercat() {


    //CONSTANTes de 3 y 2


    //robamos las 3 últimas cartas de la baraja ya que siempre serán camellos. Es lo ultimo que añadimos al inicializarla
    for (int i = 0; i < 3; ++i) {
        m_Mercat.Afegir(m_Baralla.Robar());
    }

    m_Baralla.Barrejar();

    //se puede crear una funcion con esto
    for (int i = 0; i < 2; ++i) {
        m_Mercat.Afegir(m_Baralla.Robar());
    }

    //m_Baralla.Mostrar();
    //cout << endl;




//Es col·loquen les dues següents cartes de la baralla al mercat, junt amb els camells que ja hi ha. El mercat ja està preparat.

}

void Joc::AfegirCamells() {
    int camellsTrobats = 0;
    int i = 0;

    while (camellsTrobats<0) {
        //crear operador
        if(m_Baralla.CartaAPosicio(i)=='C'){
            camellsTrobats++;
            m_Mercat.AfegirCamells(3);
            m_Baralla.Robar(i);
        }
        i++;
    }
    //rellenar mercado
    RellenarMercado();
}

void Joc::IntercanviarProductes() {
    int posicio;
    do{
        cin >> posicio;
    } while (posicio!=-1);
}

void Joc::AbandonarPartida() {

}

void Joc::VendreCartes() {
    char c;
    cin >> c;
    Jugador* jugadorActual = NULL;
    ((m_tornActual%2)!=0) ? jugadorActual = &m_J1: jugadorActual = &m_J2;
    //obetenemos cuantas cartas vamosa a eliminar
    int fitxesArebre = jugadorActual->NumeroDeCartes(c);
    //eliminamos las cartas
    jugadorActual->EliminarCartasTipo(fitxesArebre, c);
    //añadimos las fichas a nuestra pila
    PilaBonificacions* pilaDeJugadorActual = NULL;
    ((m_tornActual%2)!=0) ? pilaDeJugadorActual = &m_pilaJugador1: pilaDeJugadorActual = &m_pilaJugador2;


    int puntuacio=0;
    for (int i = 0; i < fitxesArebre; ++i) {
        //no se por que se pasa puntuacio por aqui
        RobarFitxaPila(puntuacio);
        pilaDeJugadorActual->Empilar(Fitxa(c, puntuacio));
    }



    //añadimos la puntuacion
    jugadorActual->MoverCartasAlaIzqueirda();
    jugadorActual.RellenarMa();

}

void Joc::AgafarCamells() {
    if (m_Mercat.NumeroDeCamells()==0){
        cout << "no hay camellos"<< endl;
    } else{
        Jugador* jugadorActual = NULL;
        ((m_tornActual%2)!=0) ? jugadorActual = &m_J1: jugadorActual = &m_J2;
        //el 5 se puede hacer constante
        while (jugadorActual->NumeroDeCamells()<5){
            jugadorActual->AfegirCamell();
            m_Mercat.TreureCamell();
            m_Mercat.Afegir(m_Baralla.Robar());
        }
    }
}

void Joc::AgafarProducte() {
    int posicio;
    cin >> posicio;
    string tornDe;
    ((m_tornActual%2)!=0) ? m_J1.AfegirCarta(m_Mercat.Treure(posicio)): m_J2.AfegirCarta(m_Mercat.Treure(posicio));
    m_Mercat.MoverALaIzquierda(posicio);
    m_Mercat.Afegir(m_Baralla.Robar());

}

Fitxa Joc::RobarFitxaPila(int &n) {

}



//DESTRUCTORES