//42313237e
//Nicolás Daniel Rueda Araque
//13/01/26

package es.cide.programacio;

import java.util.Random;

public class torrada {

    static Random random = new Random();

    protected String festivitat, any;

    // ***CONSTRUCTORS***
    public torrada() {
        // constructor buit
        missatgeConstructor();
    }

    public torrada(String f, String a) {
        // constructor amb parametres
        this.festivitat = f;
        this.any = a;

        missatgeConstructor();
    }

    // ***METODES***/
    private void missatgeConstructor() {
        // missatge per deixar constancia de la creacio del objecte

        if (this instanceof sobrassada) {
            // si es una sobrassada
            System.out.println("He comprat una sobrassada.");
        } else if (this instanceof botifarro) {
            // si es un botifarro
            System.out.println("He comprat un botifarró.");
        } else {
            // si no (sera torrada)
            System.out.println("Benvingut a la torrada de " + this.festivitat + " " + this.any + ".");
        }

    }

    // ***GETS***//
    public String getFestivitat() {
        return this.festivitat;
    }

    public String getAny() {
        return this.any;
    }

    // ***SETS***
    public void setFestivitat(String s) {
        this.festivitat = s;
    }

    public void setAny(String s) {
        this.any = s;
    }

}
