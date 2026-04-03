import java.util.Arrays;

public class HanoiGenerado {

    static int[][] torres;
    static int[] cantidades; // Puntero para saber dónde está el tope de cada torre
    static int totalDiscos;

    public static void main(String[] args) {
        totalDiscos = 3; // Puedes cambiar esto a 4 o 5

        // Inicializamos las estructuras
        torres = new int[3][totalDiscos];
        cantidades = new int[3];

        // Llenamos la Torre A (índice 0) con los discos: 3, 2, 1...
        // El disco más grande (N) va en la base (índice 0 del array)
        for (int i = 0; i < totalDiscos; i++) {
            torres[0][i] = totalDiscos - i;
        }
        cantidades[0] = totalDiscos; // La torre A tiene N discos

        System.out.println("--- ESTADO INICIAL ---");
        imprimirEstado();
        System.out.println("\n--- COMIENZA LA RECURSIVIDAD ---");

        // Llamada recursiva
        resolverHanoi(totalDiscos, 'A', 'B', 'C');

        System.out.println("--- FIN DEL PROCESO ---");
    }

    /**
     * Algoritmo Recursivo Estándar
     */
    public static void resolverHanoi(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            moverDiscoFisico(origen, destino);
            return;
        }

        resolverHanoi(n - 1, origen, destino, auxiliar);
        moverDiscoFisico(origen, destino);
        resolverHanoi(n - 1, auxiliar, origen, destino);
    }

    /**
     * Método auxiliar para actualizar los arrays y pintar el cambio.
     * Simula el movimiento físico del disco.
     */
    public static void moverDiscoFisico(char origenChar, char destinoChar) {
        int iOrigen = indiceDe(origenChar);
        int iDestino = indiceDe(destinoChar);

        // LÓGICA DE MOVIMIENTO EN ARRAYS (Sin usar Stack/Queue)
        // 1. Tomar el disco de la cima de origen
        int topeOrigen = cantidades[iOrigen] - 1;
        int disco = torres[iOrigen][topeOrigen];
        torres[iOrigen][topeOrigen] = 0; // Borrar rastro visual
        cantidades[iOrigen]--;

        // 2. Colocar el disco en la cima d e destino
        int topeDestino = cantidades[iDestino];
        torres[iDestino][topeDestino] = disco;
        cantidades[iDestino]++;

        // 3. Imprimir el movimiento y el estado
        System.out.println("Moviendo disco " + disco + " de " + origenChar + " a " + destinoChar);
        imprimirEstado();
    }

    // Convierte 'A', 'B', 'C' en 0, 1, 2
    public static int indiceDe(char torre) {
        return torre - 'A';
    }

    // Imprime las torres
    public static void imprimirEstado() {
        for (int i = 0; i < 3; i++) {
            char nombreTorre = (char) ('A' + i);
            System.out.print(nombreTorre + ": [ ");
            for (int j = 0; j < cantidades[i]; j++) {
                System.out.print(torres[i][j] + " ");
            }
            System.out.println("]");
        }
        System.out.println("-------------------------");
    }
}