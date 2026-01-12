public class hanoiCorregido {

    static int discos = 3;
    // aqui podría ahce torres[][] pero asi es mas legible
    static int[][] torres;

    static int[] cantidadDeDiscos = new int[discos];

    public static void main(String[] args) {
        // inicializamos las torres: 3 (origen, auxiliar, destino) con un numero maximo
        // de discos
        torres = new int[3][discos];
        // la primer atorre tiene el valor máximo de discos de nuestro problema (3 por
        // defecto). Las otras 2 tienen 0 discos, ya inicializadas por defecto
        cantidadDeDiscos[0] = discos;

        // llenamos la torre del origen
        for (int i = 0; i < discos; i++) {
            torres[0][i] = discos - i;
        }

        imprimirTorres();

        hanoiNico(discos, 'A', 'B', 'C');

    }

    static void hanoiNico(int n, char origen, char auxiliar, char destino) {
        if (n == 1) {
            // si n es 1, moveremos directamente el disco a la tercera torre, no pasaremos
            // por la auxiliar
            moverDisco(origen, destino);
            return;
        }
        // movemos todos los discos menos el del fondo desde origen hacia auxiliar,
        // usando destino como soporte
        hanoiNico(n - 1, origen, destino, auxiliar);
        // despues de mover n-1 discos, movemos el disco restante. De origen a destino
        moverDisco(origen, destino);
        // devolvemso los discos del soporte hacía la torre desitno usando origen como
        // soporte
        hanoiNico(n - 1, auxiliar, origen, destino);
    }

    static void moverDisco(char moverDesde, char moverA) {
        // estos dos valores nos indican el indice de las torres entre las que moveremos
        // los discos
        int iOrigen = indiceDe(moverDesde);
        int iDestino = indiceDe(moverA);

        // le quitamos un disco al "tope" de la torre
        // cantidadDeDiscos[iOrigen] nos da la cantidad de discos que tiene. Por ejemplo
        // la primera torre tendrá 3 discos al inicio. Le restamos 1 para obtener el
        // indice ya que el disco más alto estará en el indice 3
        int topeOrigen = cantidadDeDiscos[iOrigen] - 1;
        // obtenemos el valor de ese disco
        int pesoDisco = torres[iOrigen][topeOrigen];
        torres[iOrigen][topeOrigen] = 0;
        cantidadDeDiscos[iOrigen]--;

        // lo mismo que con int topeOrigen
        int topeDestino = cantidadDeDiscos[iDestino];
        // introducimos en la torre de destino, en su tope (sin restar 1, ya que sería
        // encima del tope, recordemos que comenzamos contando por 0), el disco que
        // hemos sacado de la torre origen
        torres[iDestino][topeDestino] = pesoDisco;
        // le añadimos 1 a la cantidad de discos que tiene esta torres
        cantidadDeDiscos[iDestino]++;

        imprimirTorres();

    }

    public static int indiceDe(char torre) {
        // le resta "A" al valor pasado. Si le pasamos A, A-A nos da 0. B-A nos da 1.
        // C-A 2.
        return torre - 'A';
    }

    static void imprimirTorres() {
        // imprime el estado de las 3 torres
        System.out.println("-------------------------");
        System.out.print("Torre A: ");
        imprimirTorre(torres[0]);
        System.out.print("Torre B: ");
        imprimirTorre(torres[1]);
        System.out.print("Torre C: ");
        imprimirTorre(torres[2]);
    }

    static void imprimirTorre(int[] torre) {
        // imprime el estado de una torre
        System.out.print("[ ");
        for (int i = 0; i < torre.length; i++) {
            System.out.print(torre[i] + " ");
        }
        System.out.println("]");

        System.out.println("-------------------------");
    }

}
