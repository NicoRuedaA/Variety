//42313237e
//Nicolás Daniel Rueda Araque
//13/01/26

package es.cide.programacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // creacio de l'objecte scanner
        // variables booleanes
        boolean carnFet = false, botifarroFet = false, sobrassadaFet = false;
        // variables String per la creacio dels objectes
        String festivitat, any;

        // unicament per determinar el any i la festivitat
        System.out.print("Introdueix l'any: ");
        any = sc.next();
        System.out.print("Introdueix la festivitat: ");
        // para limpiar el buffer
        sc.nextLine();
        festivitat = sc.nextLine();

        // cream una torrada, botifarra i sobrassada amb els parametres definits
        // anteriorement
        torrada torrada1 = new torrada(festivitat, any);
        botifarro botifarro1 = new botifarro(festivitat, any);
        sobrassada sobrassada1 = new sobrassada(festivitat, any);

        // possam la carn a la graella
        botifarro1.posarCarnAGraella();
        sobrassada1.posarCarnAGraella();

        System.out.println("Vaig a mirar si estan fets:");

        // mentres que la car no feta
        while (!carnFet) {
            // miram si la botifatrra esta feta
            botifarroFet = botifarro1.estaFet();
            // miram si la sobrassada esta feta
            sobrassadaFet = sobrassada1.estaFet();
            // si les dues estan fetes
            if (botifarroFet && sobrassadaFet) {
                // podem anar a sopar, carn feta = true
                System.out.println("Ja puc anar a sopar.");
                // aqui hauriem de llevar la carn de la graella pero al pdf nomes indica
                // assaborir
                carnFet = true;

            } else {
                // sino hem de seguir esperam
                System.out.println("He d'esperar");
                // tornam a indicar que les carnes no estan fetes (indicacions del pdf)
                botifarroFet = false;
                sobrassadaFet = false;
            }
        }

        // assaborim la carn
        botifarro1.assaborir();
        sobrassada1.assaborir();

        // finalitzam el programa amb una "despedida"
        System.out.println("Au, ja està tot fet! Visca " + torrada1.getFestivitat() + ".");

        sc.close(); // tancam l'objecte scanner
    }
}