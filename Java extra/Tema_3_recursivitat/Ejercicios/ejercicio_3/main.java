public class main {
    private static boolean esCreciente(int x) {
        if (x < 10) {
            return true;
        } else {
            int y = x % 10, z = (x / 10) % 10;
            if (y > z) {
                return esCreciente(x / 10) && true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println(esCreciente(x));
    }
}
/*
 * if (x < 10) {
 * return true;
 * } else {
 * // obtenemos el valor de la izquierda
 * int a = x % 10;
 * System.out.println(a);
 * if (a < y) {
 * //System.out.println(a + " es menor que " + y);
 * // pasamos a como el valor de la izquierda anterior, "y"
 * return esCreciente(x / 10, a) && true;
 * } else {
 * // System.out.println(a + " es mayor que " + y);
 * // return esCreciente(x / 10, a) && false;
 * return false;
 * }
 * }
 */
