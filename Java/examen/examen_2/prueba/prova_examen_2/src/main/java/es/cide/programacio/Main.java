package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        // crear un array de 5 obstacles. La dificultad s'assigna aleatoriament,
        Obstacle[] arrObstacles = { new Obstacle("Pedra"), new Obstacle("Forat"), new Obstacle("Mur"),
                new Obstacle("Barranc"), new Obstacle("Rampa") };
        // cream un robot anomenat robotito amb energia 50 i forca 3
        Robot robotPrincipal = new Robot("robotito", 50, 3);

        // contador que guarda el obstaclue actual
        int obstacleActual = 0;

        // boolean per no fer us de breaks
        boolean fi = false;

        // mentra no fi
        while (!fi) {
            // mostram quin obstacle ha de superar el robot
            System.out.println("Obstacle actual: " + (obstacleActual + 1));
            // mostrarm la energia que te el robot abans de l'obstacle
            System.out.print("Abans de l'obstacle ");
            robotPrincipal.mostrarEnergia();
            // mostram la informació de l'obstacle
            System.out.println(arrObstacles[obstacleActual].toString());
            // si no queda energia despres de l'obstacle
            if (!robotPrincipal.superarObstacle(arrObstacles[obstacleActual])) {
                // sortim des bucle
                fi = true;
            }
            // mostrarm la energia que te el robot despres de l'obstacle
            System.out.print("Despres de l'obstacle ");
            robotPrincipal.mostrarEnergia();
            // continuam al seguent obstacle
            if (!fi)
                obstacleActual++;
            // si hem arribat al final de l'Array
            if (obstacleActual >= arrObstacles.length)
                // sortim des bucle
                fi = true;
            System.out.println();
        }

        // si el robot ha superar els obstacle (esteim al final de l'array) mostram...
        if (obstacleActual >= arrObstacles.length)
            System.out.println("El robot ha superat tots els obstacles!");
        else
            // si no mostram...
            System.out.println("El robot no ha aconseguit superar la prova.");
    }
}