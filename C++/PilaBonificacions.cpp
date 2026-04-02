//
// Created by Nico on 19/05/2021.
//

#include "PilaBonificacions.h"
#include "Fitxa.h"


        //CONSTRUCTORES
PilaBonificacions::PilaBonificacions() {
            m_Inici=m_Final=NULL;
            m_numeroDeFitxes=0;
            m_tipus=' ';
}
        //MODIFICADORES


PilaBonificacions::PilaBonificacions(const PilaBonificacions &o) {
    m_Inici=m_Final=NULL;
    Copia(o);
}


bool PilaBonificacions::Existeix(Fitxa e) const {
    Node *p = m_Final;
    bool fiCerca = false;
    bool trobat = false;
    while ((p!=NULL) && (!fiCerca)){
        //revisar
        if (p->m_Fitxa == e){
            fiCerca = true;
            trobat = p->m_Fitxa == e;
        }
        else
            p = p->seg;
    }
    return trobat;
}

bool PilaBonificacions::Buida() const {
    return m_Inici == NULL;
}


void PilaBonificacions::Mostrar() const {
    if(m_numeroDeFitxes>0) {

        /*switch (m_tipus) {
            case 'c':
                cout << "PILA DE CUIR:";
                break;
            case 'e':
                cout << "PILA DE ESPECIES";
                break;
            case 't':
                cout << "PILA DE TELES:";
                break;
            case 'p':
                cout << "PILA DE PLATA:";
                break;
            case 'o':
                cout << "PILA DE OR:";
                break;
            case 'd':
                cout << "PILA DE DIAMANTS:";
                break;
            default:
                break;
        }*/

    Node *p=m_Final;
         while(p!=NULL)
            {p->m_Fitxa.Mostrar();
                p=p->seg;
            }
         cout << endl;
        }

    else cout << "NO HI HA CAP FITXA DE BONIFICACIO" << endl;
}

void PilaBonificacions::Empilar(const Fitxa& s) {
    Node* nou= new Node;
    nou->m_Fitxa= s;
    nou->seg= NULL;
    if (Buida())
        m_Inici=m_Final=nou;
    else {
        m_Inici->seg= nou; m_Inici = nou;
    }
    m_numeroDeFitxes++;
}



/*void PilaBonificacions::Eliminar(Fitxa e) {
    Node *ant, *p;
    bool fiCerca = false;
    bool trobat = false;
    ant = NULL;
    p = m_Cim;

    while((p!=NULL) && (!fiCerca)) {
        if (p->m_Fitxa == e){
            fiCerca = true;
            trobat = true;
        }
        else{
            ant = p;
            p = p->seg;
        }
    }

    if (trobat) {
        if(ant!= NULL)
            ant->seg = p->seg;
        else m_Cim = p->seg;
        delete p;
    }
        m_numeroDeFitxes--;
}*/


void PilaBonificacions::Desempilar() {
    Node* aux= m_Inici;
    if (m_Inici==m_Final) // només hi ha un element
        m_Inici=m_Final=NULL;
    else m_Inici= m_Inici->seg;
    delete aux;
    m_numeroDeFitxes--;
}


PilaBonificacions::~PilaBonificacions() {
    Allibera();
}

void PilaBonificacions::Allibera() {
    while (!Buida()) {
        Node* aux = m_Final;
        m_Final = m_Final->seg;
        delete aux;
    }
    m_numeroDeFitxes=0;
}

void PilaBonificacions::Copia(const PilaBonificacions &o) {
    Node* p = o.m_Final;
    while(p!=NULL){ // recorrem cua o
        Empilar(p->m_Fitxa); // this->encua(p->valor)
        p=p->seg;
    }
    m_numeroDeFitxes=o.m_numeroDeFitxes;
}



Fitxa PilaBonificacions::Cim() const{
    return m_Inici->m_Fitxa;
}

int PilaBonificacions::Mida() const {
    return m_numeroDeFitxes;
}

PilaBonificacions& PilaBonificacions::operator=(const PilaBonificacions &o) {
    if (this != &o){
        Allibera();
        Copia(o);
    }
    return *this;
}

void PilaBonificacions::Tipus(char c) {
    m_tipus=c;
}

//podemos implementar esto si da tiempo
/*bool PilaBonificacions::Cercar(Fitxa e) {
    bool trobat=true;

    return trobat;
}*/






