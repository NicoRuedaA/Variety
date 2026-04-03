/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

//clase totalmente opcional. Solo para hacer el output bonito jijijiji
public class UI {

    // Colores para cambiar el color del texto por consola
    private static final String RESET = "\u001B[0m";
    private static final String CYAN = "\u001B[36m";
    private static final String BLANCO = "\u001B[37m";
    private static final String AMARILLO = "\u001B[33m";

    // Extras para modificar la apariencia del texto por consola
    private static final String NEGRITA = "\u001B[1m";
    private static final String FONDO_ROJO = "\u001B[41m";
    private static final String FONDO_VERDE = "\u001B[42m";

    // milisegundos entre cada sprite
    private static final int delayAnimacion = 350;

    // Sprite 1
    private static final String[] GUYBRUSH_SIDE = new String[] {

            CYAN,
            "                          ████████████           ",
            "                        ████████████████         ",
            "                      ████████████████████       ",
            "                    ████████████░░░░████████     ",
            "                    ██████████░░░░██████         ",
            "                    ██████████░░░░  ░░░░         ",
            "                    ██████░░░░░░░░░░░░░░░░       ",
            "                    ██████░░░░░░░░░░████         ",
            "                  ██████████░░░░░░██████         ",
            "                ████████████████░░██░░░░         ",
            "                ████▒▒▒▒▒▒▒▒░░░░████████         ",
            "                ████▓▓▓▓████▒▒░░░░▒▒             ",
            "                ▓▓▓▓▓▓▓▓██████░░░░████           ",
            "              ▓▓▓▓▓▓▓▓▓▓▓▓████▒▒░░░░████         ",
            "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████▒▒░░▓▓██         ",
            "          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒░░▓▓██         ",
            "        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒░░▓▓██         ",
            "        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▓▓▓▓██▓▓       ",
            "        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓       ",
            "      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▒▒▓▓██▓▓       ",
            "      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▒▒▒▒▓▓██▓▓       ",
            "      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓       ",
            "      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████    ██▓▓       ",
            "      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓████  ████▓▓       ",
            "        ▓▓▒▒▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓████    ██▓▓░░     ",
            "        ▒▒██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓██████████▓▓░░     ",
            "        ██░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓░░   ",
            "        ░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓░░   ",
            "        ░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓     ",
            "        ░░  ░░▓▓░░▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓     ",
            "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██░░░░░░██▓▓▓▓     ",
            "            ▓▓▓▓▓▓▓▓▓▓▓▓░░▓▓▓▓██░░░░░░██▓▓▓▓     ",
            "            ▒▒▒▒▓▓░░▓▓▓▓░░▓▓▓▓██░░░░░░██▓▓▒▒     ",
            "            ████▒▒░░▒▒▒▒░░▓▓▓▓██░░░░░░░░▒▒██     ",
            "              ░░██░░████░░▒▒▒▒▒▒░░░░░░░░██       ",
            "              ░░░░░░░░░░░░██████░░░░░░░░         ",
            "              ▓▓▓▓▓▓▓▓▓▓      ▓▓▓▓▓▓▓▓           ",
            "            ██████████████    ████████████       ",
            "            ██████████████    ██████████▓▓       ",
            "            ██████████████    ████████████       ",
            "              ▓▓▓▓▓▓▓▓▓▓▓▓    ▓▓▓▓▓▓▓▓▓▓         ",
            "                ▓▓▓▓▓▓▓▓          ▓▓▓▓▓▓         ",
            "                ██████▓▓          ██▓▓██████     ",
            "              ██████████▓▓        ▓▓▓▓████████▓▓ ",
            "            ██████████▓▓          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ",
            "            ▓▓▓▓▓▓▓▓▓▓▓▓                         ", RESET
    };

    // sprite 2
    private static final String[] GUYBRUSH_FRONT = new String[] {
            CYAN,
            "                  ██▓▓▓▓▓▓██                     ",
            "                ██████▓▓▓▓████████               ",
            "              ████▓▓▓▓▓▓███████▓▓███             ",
            "              ███████████░░░░░░███████           ",
            "              ▓▓█████████▓▓███▓▓██▓▓             ",
            "            ██████▓▓  ░░░░░░  ▓▓██▓▓   ██        ",
            "            ██  ██░░░░░░░░░░░░▓▓██▓▓ ███         ",
            "          ██      ░░░░▓▓██▓▓░░▓▓                 ",
            "                  ██▓▓██████▓▓▓▓▓▓               ",
            "                  ██▓▓░░░░░░████▓▓▓▓             ",
            "                ████░░▓▓▓▓▓▓░░██████             ",
            "          ▓▓▓▓▓▓████░░░░░░░░▓▓████▓▓▓▓▓▓▓▓       ",
            "        ▓▓▓▓▓▓▓▓████▓▓░░░░░░▓▓████▓▓▓▓▓▓▓▓▓▓▓▓   ",
            "      ▓▓▓▓▓▓▓▓▓▓████▓▓▓▓░░▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓   ",
            "    ▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓░░▓▓▓▓████▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ",
            "    ▓▓▓▓▓▓▓▓▓▓▓▓▓▓████▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ",
            "  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓▓▓  ▓▓▓▓▓▓▓",
            "  ▓▓▓▓▓▓▓▓  ▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓▓▓  ▓▓▓▓▓▓▓",
            "  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓██▓▓▓▓██▓▓▓▓▓▓  ▓▓▓▓▓▓▓",
            "  ▒▒▒▒▓▓▓▓▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓",
            "  ████▒▒▒▒▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓██████▓▓▓▓▓▓▓▓▓▓▓▓▒▒▒",
            "    ██████▓▓▓▓▓▓▓▓██▓▓████████▓▓██▓▓▓▓▓▓▓▓▒▒▒▒███",
            "    ░░░░░░▓▓▓▓▓▓▓▓██  ██    ██  ██▓▓▓▓▓▓▓▓██████ ",
            "    ░░░░░░░░▓▓▓▓▓▓██  ████  ██  ██▓▓▓▓▓▓▓▓░░░░░░ ",
            "      ░░░░▓▓▓▓  ▓▓██  ██    ██  ██▓▓▓▓▓▓░░░░░░░░ ",
            "        ░░▓▓▓▓▓▓▓▓██░░████████░░██▓▓▓▓▓▓▓▓░░░░░░ ",
            "          ▓▓▓▓▓▓▓▓██░░░░░░░░░░░░██▓▓▓▓▓▓▓▓░░░░   ",
            "          ▓▓▓▓▓▓▓▓██░░░░░░░░░░░░████▓▓▓▓▓▓▓▓     ",
            "          ▓▓▓▓░░▓▓██░░░░░░░░░░░░██▓▓▓▓▓▓▓▓       ",
            "          ▓▓▓▓░░▓▓██░░░░░░░░░░░░██▓▓▓▓▓▓▓▓       ",
            "          ▓▓▓▓░░▓▓██░░░░░░░░░░░░██▓▓▓▓░░▓▓       ",
            "          ▓▓▓▓░░▓▓██░░░░░░  ░░░░░░██▓▓░░██       ",
            "          ████░░██░░░░░░░░  ░░░░░░░░██░░██       ",
            "          ████░░██░░░░░░░░  ░░░░░░░░░░░░░░       ",
            "              ░░░░░░░░░░░░    ░░░░░░░░░░░░       ",
            "              ▓▓▓▓▓▓▓▓▓▓        ▓▓▓▓▓▓▓▓▓▓▓▓     ",
            "              ▓▓▓▓▓▓▓▓▓▓▓▓      ▓▓▓▓▓▓▓▓▓▓▓▓     ",
            "            ██████████▓▓▓▓    ████████████████   ",
            "            ██████████▓▓▓▓    ████████████████   ",
            "            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓    ████████████████   ",
            "                ▓▓▓▓▓▓          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓   ",
            "                ▓▓████▓▓            ▓▓████▓▓     ",
            "            ▓▓▓▓████████            ██████████▓▓▓",
            "          ▓▓████████████            █████████████", RESET
    };

    // **************************************************************************************************************************/
    // Info unicamente visual, no contiene lógica de la práctica

    // metodo para escribir un string texto con un delay determinado
    public static void escribirLento(String texto, int delay) {
        // por cada caracter en el String "texto"
        for (char c : texto.toCharArray()) {
            // imprimimos el caracter
            System.out.print(c);
            try {
                // esperamos
                Thread.sleep(delay);
            } catch (InterruptedException e) {
            }
        }
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
        System.out.print(CYAN);
        escribirLento(("\r\n" + //
                "████████╗██╗░░██╗███████╗░░██████╗███████╗░█████╗░██████╗░███████╗████████╗░░█████╗░███████╗\r\n" + //
                "╚══██╔══╝██║░░██║██╔════╝░██╔════╝██╔════╝██╔══██╗██╔══██╗██╔════╝╚══██╔══╝░██╔══██╗██╔════╝\r\n" + //
                "░░░██║░░░███████║█████╗░░░╚█████╗░█████╗░░██║░░╚═╝██████╔╝█████╗░░░░░██║░░░░██║░░██║█████╗░░\r\n" + //
                "░░░██║░░░██╔══██║██╔══╝░░░░╚═══██╗██╔══╝░░██║░░██╗██╔══██╗██╔══╝░░░░░██║░░░░██║░░██║██╔══╝░░\r\n" + //
                "░░░██║░░░██║░░██║███████╗░██████╔╝███████╗╚█████╔╝██║░░██║███████╗░░░██║░░░░╚█████╔╝██║░░░░░\r\n" + //
                "░░░╚═╝░░░╚═╝░░╚═╝╚══════╚░═════╝░╚══════╝░╚════╝░╚═╝░░╚═╝╚══════╝░░░╚═╝░░░░░╚════╝░╚═╝░░░░░\r\n" + //
                "\r\n" + //
                "███╗░░░███╗░█████╗░███╗░░██╗██╗░░██╗███████╗██╗░░░██╗░██╗░██████╗██╗░░░░░░█████╗░███╗░░██╗██████╗░\r\n"
                + //
                "████╗░████║██╔══██╗████╗░██║██║░██╔╝██╔════╝╚██╗░██╔╝░██║██╔════╝██║░░░░░██╔══██╗████╗░██║██╔══██╗\r\n"
                + //
                "██╔████╔██║██║░░██║██╔██╗██║█████═╝░█████╗░░░╚████╔╝░░██║╚█████╗░██║░░░░░███████║██╔██╗██║██║░░██║\r\n"
                + //
                "██║╚██╔╝██║██║░░██║██║╚████║██╔═██╗░██╔══╝░░░░╚██╔╝░░░██║░╚═══██╗██║░░░░░██╔══██║██║╚████║██║░░██║\r\n"
                + //
                "██║░╚═╝░██║╚█████╔╝██║░╚███║██║░╚██╗███████╗░░░██║░░░░██║██████╔╝███████╗██║░░██║██║░╚███║██████╔╝\r\n"
                + //
                "╚═╝░░░░░╚═╝░╚════╝░╚═╝░░╚══╝╚═╝░░╚═╝╚══════╝░░░╚═╝░░░░╚═╝╚═════╝░╚══════╝╚═╝░░╚═╝╚═╝░░╚══╝╚═════╝░"),
                1);
        System.out.println();
        escribirLento("Bienvenido a " + i.getNom() + ", introduce tu nombre: ", 15);
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

    // metodo para imprimir los sprites que tenemos guardados
    private static void imprimirSprite(int x) {
        String[] spriteSeleccionado;

        // segun si "x" es 1 o otro
        // seleccionamos el sprite de lado
        if (x == 1) {
            spriteSeleccionado = GUYBRUSH_SIDE;
            // o el de en frente
        } else {
            spriteSeleccionado = GUYBRUSH_FRONT;
        }
        // por cada string en el array
        for (String trozo : spriteSeleccionado) {
            // imprimimos ese trozo
            System.out.println(trozo);
        }
    }
}
