//2/12/25
//Nicolas Daniel Rueda Araque
//42313237e

package es.cide.programacio;

import java.util.Random;

public class Main {

    // *********** CONSTANTS ***********

    private static final int MIN_OBS = 5;
    private static final int MAX_OBS = 7;

    public static void main(String[] args) {

        // *********** VARIABLES ***********
        // cream i inicialitzam el objecte random
        Random random = new Random();
        // cream el nombre dobstacles
        int nombreObstacles = random.nextInt(MIN_OBS, MAX_OBS + 1);
        // bools per aturar el bucles
        boolean fi = false, ponyViu = true;

        // iterador i nombre d'obstacles superats
        int i = 0, obstaclesSuperats = 0;

        // cream una array del tamany obtingut. inicialitzam cada obstacle del array
        // creat
        Obstacle arrayObstacle[] = new Obstacle[nombreObstacles];
        for (int j = 0; j < arrayObstacle.length; j++) {
            arrayObstacle[j] = new Obstacle();

        }

        // cream un pony amb un nom, energia determinats i forca aleatoria
        Pony myLittlePony = new Pony("Barbara", 17);
        // mostram la info inicial del pony
        myLittlePony.mostrar();
        // mostram el nombre d'obstacles al que s'ha d'entrentar
        System.out.println("Hi ha " + nombreObstacles + " obstacles");

        while (!fi && ponyViu) {

            System.out.println("Obstacle " + (i + 1));
            // mostram la info de l'obstacles
            arrayObstacle[i].mostrar();
            // el pony intenta superar el obstacle
            if (myLittlePony.compararObstacle(arrayObstacle[i])) {
                // si supera l'obstacle, el afegim a la llista
                obstaclesSuperats++;
            } else
                fi = true;
            // miram si el pony estaria viu despres d'intentar superar l'obstacle
            ponyViu = myLittlePony.superarObstacle(arrayObstacle[i]);
            // mostam la energia restant del pony ( ja restada anteriorment)
            myLittlePony.mostrarEnergia();

            i++;

            // si hem arribat al darrer obstacle
            if (i >= nombreObstacles)
                fi = true;

        }

        // el pony supera la proba si esta viu i arriba al final
        boolean victoria = (obstaclesSuperats >= arrayObstacle.length) && ponyViu;

        // mostram missatge segons si el pony ha superat la proba
        if (victoria)
            System.out.println("El pony ha superat tots els obstacles, el pots dur a competir!");

        else
            System.out.println("El pony no ha aconseguit superar la prova, només serveix per fer hamburgueses.");

    }
}