public class hanoi {
    public static void main(String[] args) {
        int discos = 3;
        hanoiNico(discos, 'A', 'C', 'B');
    }

    static void hanoiNico(int n, char origen, char destino, char auxiliar) {
        int x = 1;

        System.out.println("Torre " + origen);
        imprimirTorre(n, x, origen);

        if (n >= 0) {

            n--;
            hanoiNico(n, origen, destino, auxiliar);
        }
    }

    static void imprimirTorre(int n, int x, char origen) {
        if (x == n) {
            System.out.print(x + " ");
            return;
        }

        else {
            imprimirTorre(n, x + 1, origen);
            System.out.print(x + " ");
        }
    }
}
