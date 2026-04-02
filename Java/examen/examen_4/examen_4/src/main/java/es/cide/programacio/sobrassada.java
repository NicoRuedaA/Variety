//42313237e
//Nicolás Daniel Rueda Araque
//13/01/26

package es.cide.programacio;

import java.util.Random;

public class sobrassada extends torrada implements graella, menjar {
    static Random random = new Random();

    // ***CONSTRUCOTRS***/
    public sobrassada() {
        // constructor buit
        super();

    }

    public sobrassada(String f, String a) {
        // constructor amb els parametres del pare i del fill
        super(f, a);

    }

    // ***METODES***/
    // metodes de graella
    public void posarCarnAGraella() {
        // posam la sobrassada a la graella
        System.out.println("He posat la sobrassada a la graella.");

    }

    public void llevarCarnDeGraella() {
        // llevam la sobrassada de la graella
        System.out.println("He llevat la sobrassada de la graella.");
    }

    public boolean estaFet() {
        // retornar true o flase en 50-50%%
        boolean fet;
        // generam un nombre aleatori entre 0 i 1
        int resultat = random.nextInt(2);
        if (resultat == 1) {
            // si el resultat es 1
            fet = false;
            System.out.print("la sobrassada està cru. ");
        } else {
            fet = true;
            System.out.print("la sobrassada està fet. ");
        }
        // sino, el resultat 0

        return fet;
    }

    // metodes de menjar

    public void assaborir() {
        // assaborim la sobrassada
        System.out.println("Estic assaborint la sobrassada. ");
    }

    public boolean crema() {
        // revisam si la sobrassada crema
        // retornar true o false en 50-50%%
        boolean cremant;
        // generam un nombre aleatori entre 0 i 1
        int resultat = random.nextInt(2);
        if (resultat == 1) {
            // si el resultat es 1
            System.out.println("La sobrassada no crema.");
            cremant = false;
        } else
            // sino, el resultat 0
            System.out.println("La sobrassada crema.");
        cremant = true;
        return cremant;

    }

}
