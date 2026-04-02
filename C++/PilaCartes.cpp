//
// Created by Nico on 19/05/2021.
//

#include "PilaBonificacions.h"
#include "Fitxa.h"
#include "PilaCartes.h"


PilaCartes::PilaCartes() {
    m_Cim=m_Final=NULL;
    m_numeroDeCartes=0;
    //m_numeroDeCamells=0;
}

PilaCartes::PilaCartes(const PilaCartes &o) {
    m_Cim=m_Final=NULL;
    Copia(o);
}

bool PilaCartes::Existeix(Carta c) const {
    Node *p = m_Final;
    bool fiCerca = false;
    bool trobat = false;
    while ((p!=NULL) && (!fiCerca)){
        //revisar
        if (p->m_Carta == c){
            fiCerca = true;
            trobat = p->m_Carta == c;
        }
        else
            p = p->seg;
    }
    return trobat;
}

bool PilaCartes::Buida() const {
    return  m_Cim==NULL;
}

void PilaCartes::Mostrar() const {
    if(m_numeroDeCartes>0) {
        Node *p = m_Final;
        while (p != NULL) {
            p->m_Carta.Mostrar();
            cout << " ";
            p = p->seg;
        }
    }
    cout << "NO HI HA CAP CARTA" << endl;
}

void PilaCartes::Empilar(Carta c) {
    Node* nou= new Node;
    nou->m_Carta= c;
    nou->seg= NULL;
    if (Buida())
        m_Cim=m_Final=nou;
    else {
        m_Cim->seg= nou; m_Cim = nou;
    }
    m_numeroDeCartes++;
}

void PilaCartes::Eliminar(Carta c) {
    Node *ant, *p;
    bool fiCerca = false;
    bool trobat = false;
    ant = NULL;
    p = m_Cim;

    while((p!=NULL) && (!fiCerca)) {
        if (p->m_Carta == c){
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
}

void PilaCartes::Desempilar() {
    Node* aux= m_Cim;
    if (m_Cim==m_Final) // només hi ha un element
        m_Cim=m_Final=NULL;
    else m_Cim= m_Cim->seg;
    delete aux;
    m_numeroDeCartes--;
}


PilaCartes::~PilaCartes() {
    Allibera();
}

void PilaCartes::Allibera() {
    while (!Buida()) {
        Node* aux = m_Final;
        m_Final = m_Final->seg;
        delete aux;
    }
    m_numeroDeCartes=0;
}

void PilaCartes::Copia(const PilaCartes &o) {
    Node* p = o.m_Final;
    while(p!=NULL){ // recorrem cua o
        Empilar(p->m_Carta); // this->encua(p->valor)
        p=p->seg;
    }
    m_numeroDeCartes=o.m_numeroDeCartes;
}

Carta PilaCartes::Cim() {
    return m_Cim->m_Carta;
}

int PilaCartes::Mida() const {
    return m_numeroDeCartes;
}

/*int PilaCartes::NumeroDeCamells() const {
    //return m_numeroDeCamells;
}*/

PilaCartes &PilaCartes::operator=(const PilaCartes &o) {
    if (this != &o){
        Allibera();
        Copia(o);
    }
    return *this;
}
