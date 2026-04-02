#include <iostream>

#include "Joc.h"

using namespace std;



void IntercanviarProductes(const Joc& j){
    j.IntercanviarProductes();
}

void AgafarProducte(const Joc& j){
    j.AgafarProducte();
}

void AgafarCamells(const Joc& j){
    j.AgafarCamells();

}

void VendreCartes(const Joc& j){
    j.VendreCartes();
}

void AbandonarPartida(const Joc& j){
    j.AbandonarPartida();
}


void Menu(const Joc &j){
    bool opcioValida = false;
    char opcio;
    cout << "OPCIONS:" << endl;
    cout << "(I) INTERCANVIAR PRODUCTES" << endl << "(P) AGAFAR UN UNIC PRODUCTE" << endl<< "(C) AGAFAR ELS CAMELLS" << endl
    << "(V) VENDRE CARTES DE LA MA" << endl << "(F) ABANDONAR LA PARTIDA" << endl << "ENTRAR OPCIO:" << endl;
    cin >> opcio;

    do{
    switch (opcio) {
        case 'I' :
            IntercanviarProductes(j);
            opcioValida = true;
            break;
        case 'P' :
            AgafarProducte(j);
            opcioValida = true;
            break;
        case 'C' :
            AgafarCamells(j);
            opcioValida = true;
            break;
        case 'V' :
            VendreCartes(j);
            opcioValida = true;
            break;
        case 'F' :
            AbandonarPartida(j);
            opcioValida = true;
            break;
        default:
            cout << "OPCIO NO VALIDA" << endl;
    }} while (!opcioValida);
}

void InteraccioUsuari(string& j1, string& j2, int& n){
    cout << "ENTRA EL NOM DEL JUGADOR 1:" << endl;
    getline(cin, j1);
    cout << "ENTRA EL NOM DEL JUGADOR 2:" << endl;
    getline(cin, j2);
    cout	<<	"ENTRA LA LLAVOR:"	<<	endl;
    cin	>>	n;
    cout << endl;
}

int	main()	{
    //Preguntas oscar : pilas de bonificaciones jugadores
    //parches : ma repartir cartes, afegir const num cartes

    string m_jugador1, m_jugador2;
    int m_llavor;

    InteraccioUsuari(m_jugador1, m_jugador2, m_llavor);
    Joc m_Joc(m_jugador1, m_jugador2, m_llavor);

    m_Joc.MostrarEstatDelJoc();

    do {
        Menu(m_Joc);
    } while (!m_Joc.ComprovarCondicionsFi());

    return	0;
}
