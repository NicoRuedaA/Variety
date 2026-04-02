
/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */

package es.cide.programacio;

//clase totalmente opcional. Solo para hacer el output bonito jijijiji
public class UI {

    // Colores para cambiar el color del texto por consola
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\033[31m";
    public static final String CYAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String VERDE = "\u001b[32m";
    public static final String ROSA = "\u001B[35m";

    // Extras para modificar la apariencia del texto por consola
    private static final String NEGRITA = "\u001B[1m";
    private static final String FONDO_ROJO = "\u001B[41m";
    private static final String FONDO_VERDE = "\u001B[42m";

    // milisegundos entre cada sprite
    private static final int delayAnimacion = 350;

    // **************************************************************************************************************************/
    // Info unicamente visual, no contiene lógica de la práctica

    // metodo para escribir un string texto con un delay determinado
    public static void escribirLento(String texto, int delay) {
        // 1. Instanciamos nuestra nueva clase y arrancamos el sonido
        Sound efectoEscritura = new Sound();
        efectoEscritura.reproducirEnBucle("sonido.wav");

        // 2. Bucle de escritura (Lógica limpia sin código de audio mezclado)
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 3. Al terminar el texto, detenemos el sonido
        efectoEscritura.detener();

        System.out.println(); // Salto de línea final
    }

    // mostramos las barras de vida del pirata actual y el protagonista
    public static void mostrarUI(int vidaJugador, int maxVidaJugador, String nombrePirata,
            int vidaPirata, int maxVidaPirata, String nombreJugador, int numPiratas) {

        // longitud de las barras
        int ancho = 20;
        // -calculos vida jugador
        int vidaJ = Math.max(0, vidaJugador); // Evitar negativos
        int rellenosJ = (int) (((double) vidaJ / maxVidaJugador) * ancho);
        rellenosJ = Math.min(rellenosJ, ancho); // Evitar que se salga
        String barraJ = "[" + "█".repeat(rellenosJ) + "░".repeat(ancho - rellenosJ) + "]";

        // calculos vida pirata
        int vidaP = Math.max(0, vidaPirata);
        int rellenosP = (int) (((double) vidaP / maxVidaPirata) * ancho);
        rellenosP = Math.min(rellenosP, ancho);
        String barraP = "[" + "█".repeat(rellenosP) + "░".repeat(ancho - rellenosP) + "]";

        // imprimimos la tabla
        System.out.println(AMARILLO);
        System.out.println("╔══════════════════════════════════════════════╗");
        // string.format para rellenar hasta 44 caracteres
        System.out.println(String.format("║ %-44s ║", "        BATALLA DE INSULTOS"));
        System.out.println("╠══════════════════════════════════════════════╣");
        System.out.println(String.format("║ %-44s ║", " JUGADOR: " + nombreJugador));
        System.out.println(String.format("║ %-44s ║", "   Vida: " + barraJ + " " + vidaJ + "/" + maxVidaJugador));
        System.out.println(String.format("║ %-44s ║", "                                            "));
        System.out.println(String.format("║ %-44s ║", " PIRATA: " + nombrePirata + "/" + numPiratas));
        System.out.println(String.format("║ %-44s ║", "   Vida: " + barraP + " " + vidaP + "/" + maxVidaPirata));
        System.out.println(String.format("║ %-44s ║", "                                            "));
        System.out.println(String.format("║ %-44s ║", "                                            "));
        System.out.println("╚══════════════════════════════════════════════╝");
        System.out.println(RESET);
    }

    // puro texto visual
    public static void titulo(Illa i) {
        String titulo = "___  ___            _                _____    _                 _   _____            \n" +
                "|  \\/  |           | |              |_   _|  | |               | | / __  \\ _         \n" +
                "| .  . | ___  _ __ | | _____ _   _    | | ___| | __ _ _ __   __| | `' / /'(_)        \n" +
                "| |\\/| |/ _ \\| '_ \\| |/ / _ \\ | | |   | |/ __| |/ _` | '_ \\ / _` |   / /             \n" +
                "| |  | | (_) | | | |   <  __/ |_| |  _| |\\__ \\ | (_| | | | | (_| | ./ /___ _         \n" +
                "\\_|  |_/\\___/|_| |_|_|\\_\\___|\\__, |  \\___/___/_|\\__,_|_| |_|\\__,_| \\_____/(_)        \n" +
                "                              __/ |                                                  \n" +
                "                             |___/                                                   \n" +
                " _          _____ _                _    _      ______                                \n" +
                "| |        /  __ \\ |              | |  ( )     | ___ \\                               \n" +
                "| |     ___| /  \\/ |__  _   _  ___| | _|/ ___  | |_/ /_____   _____ _ __   __ _  ___ \n" +
                "| |    / _ \\ |   | '_ \\| | | |/ __| |/ / / __| |    // _ \\ \\ / / _ \\ '_ \\ / _` |/ _ \\\n" +
                "| |___|  __/ \\__/\\ | | | |_| | (__|   <  \\__ \\ | |\\ \\  __/\\ V /  __/ | | | (_| |  __/\n" +
                "\\_____/\\___|\\____/_| |_|\\__,_|\\___|_|\\_\\ |___/ \\_| \\_\\___| \\_/ \\___|_| |_|\\__, |\\___|\n"
                +
                "                                                                           __/ |     \n" +
                "                                                                          |___/      ";

        System.out.print(CYAN);
        escribirLento("\r\n" + titulo, 3);
        System.out.println();
        escribirLento(
                "Bienvenido a " + i.getNom()
                        + ". Prefieres jugar con el experimentado Guybrush o con a la nueva heroin Elaine? (1-2)\" ",
                15);
        System.out.print(RESET);
    }

    public static void finDelJuego(boolean victoria) {
        // limpiamos consola
        limpiarConsola();
        // si el jugador gana, el texto se imprime con fondo verde
        if (victoria)
            System.out.println(FONDO_VERDE + NEGRITA + BLANCO);
        // sino, el texto se imprime con fondo rojo
        else
            System.out.println(FONDO_ROJO + NEGRITA + BLANCO);
        System.out.println("                                        ");
        // si ganamos
        if (victoria)
            // imprimimos "victoria"
            escribirLento("                VICTORIA                ", 10);
        // sino, "derrota"
        else
            escribirLento("                 DERROTA                ", 10);
        System.out.println("                                        ");
        // reset "resetea" el formato del texto
        System.out.println(RESET);
    }

    // simulamos que limpiamos consola imprimiendo muchas lineas vacías
    public static void limpiarConsola() {
        for (int k = 0; k < 60; k++)
            System.out.println();
    }

    // parecido al escribir lengo. Unicamente pausamos el programa unos
    // milisegundos. Lo usamos para la "animacion" de los sprites
    public static void pausa(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void animarGolpe() {
        // limpiamos consola
        limpiarConsola();
        // imprimimos el sprite 1
        imprimirSprite(1);
        // esperamos
        pausa(delayAnimacion);

        // limpiamos consola
        limpiarConsola();
        // imprimimos el sprite 12
        imprimirSprite(2);
        // esperamos
        pausa(delayAnimacion);

        // limpiamos consola
        limpiarConsola();
        // imprimimo sprite 1
        imprimirSprite(1);
        // esperamos
        pausa(delayAnimacion);

    }

    public static void imprimirLeChuck() {
        for (String trozo : Sprite.LECHUCK) {
            // imprimimos ese trozo
            System.out.println(trozo);
        }
    }

    // metodo para imprimir los sprites que tenemos guardados
    private static void imprimirSprite(int x) {
        String[] spriteSeleccionado;

        // segun si "x" es 1 o otro
        // seleccionamos el sprite de lado
        if (x == 1) {
            spriteSeleccionado = Sprite.GUYBRUSH_FRONT;
            // o el de en frente
        } else {
            spriteSeleccionado = Sprite.GUYBRUSH_SIDE;
        }
        // por cada string en el array
        for (String trozo : spriteSeleccionado) {
            // imprimimos ese trozo
            System.out.println(trozo);
        }
    }
}
