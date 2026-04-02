//42313237e
//Nicolás Daniel Rueda Araque
//13/01/26

package es.cide.programacio;

import java.util.Random;

public class botifarro extends torrada implements graella, menjar {
    static Random random = new Random();

    // variable per determinar si el botifarro es coent
    private boolean coent;

    // ***CONSTRUCOTRS***/
    public botifarro() {
        // contructor buit
        super();

    }

    public botifarro(String f, String a) {
        // constructor amb els parametres del pare i fill
        super(f, a);
        // feim el coent de la butifarra aleatoria
        boolean c;
        int resultat = random.nextInt(2);
        if (resultat == 1) {
            // si el resultat es 0-6
            c = false;
        } else
            // sino, el resultat sera 7, 8 o 9
            c = true;
        this.coent = c;

    }

    public botifarro(boolean c, String f, String a) {
        // construcotr amb els parametres del pare i fill
        super(f, a);
        this.coent = c;
    }

    // ***METODES***/
    // metodes de graella
    public void posarCarnAGraella() {
        // posam el botifarro a la graella
        System.out.println("He posat el botifarró a la graella.");

    }

    public void llevarCarnDeGraella() {
        // llevam la carn de la graella
        System.out.println("He llevat el botifarró de la graella.");
    }

    public boolean estaFet() {
        // revisam si esta la carn feta o no
        // retornar true o false en 30-70%%
        boolean fet;
        // generam un nombre aleatori entre 0 i 9
        int resultat = random.nextInt(10);
        if (resultat < 7) {
            // si el resultat es 0-6 (70%)
            fet = false;
            System.out.print("El botifarró està cru i ");
        } else {
            // sino, el resultat sera 7, 8 o 9 (30%)
            fet = true;
            System.out.print("El botifarró està fet i ");
        }

        return fet;
    }

    // metodes de menjar
    public void assaborir() {
        // assaborim el botifarro mirant si es coent
        if (this.coent) {
            // si es coent
            System.out.println("Estic assaborint el botifarró i es coent.");
        } else
            // si no es coent
            System.out.println("Estic assaborint el botifarró i no es coent.");
    }

    public boolean crema() {
        // revisam si la butifarra crema
        // retornar true o false en 50-50%%
        boolean cremant;
        // generam un nombre aleatori entre 0 i 1
        int resultat = random.nextInt(2);
        if (resultat == 1) {
            System.out.println("La botifarra no crema.");
            // si el resultat es 1
            cremant = false;
        } else
            // sino, el resultat 0
            System.out.println("La botifarra crema.");
        cremant = true;
        return cremant;

    }

    // ***GETTERS ***/
    public boolean getCoent() {
        return this.coent;
    }

    // ***SETTERS***/
    public void setCoent(boolean c) {
        this.coent = c;
    }
}
