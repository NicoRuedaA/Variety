//
// Created by Nico on 19/05/2021.
//
#ifndef EJERCICIO_PILABONIFICACIONS_H
#define EJERCICIO_PILABONIFICACIONS_H
#include "Fitxa.h"

class PilaBonificacions {
public:
    PilaBonificacions();
    PilaBonificacions(const PilaBonificacions &o);

    bool Existeix(Fitxa e) const;
    bool Buida() const;
    void Mostrar() const;

    void Tipus(char c);

    void Empilar(const Fitxa& e);
    void Eliminar(Fitxa e);
    void Desempilar();
    ~PilaBonificacions();

    int Mida() const;
    Fitxa Cim() const;

    PilaBonificacions& operator=(const PilaBonificacions &o);

private:

    struct Node {
        Fitxa m_Fitxa;
        Node *seg;
    };

    Node *m_Inici, *m_Final;
    int m_numeroDeFitxes;
    char m_tipus;


    void Allibera();
    void Copia(const PilaBonificacions &t);
};


#endif //EJERCICIO_PILABONIFICACIONS_H