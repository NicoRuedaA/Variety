public class invertir {
    public static void main(String[] args) {
        String palabra = "Java";
        System.out.print(invertir(palabra, 0));
    }

    static String invertir(String palabra, int n) {
        if (n == palabra.length() - 1)
            return String.valueOf(palabra.charAt(n));
        else
            return invertir(palabra, n + 1) + String.valueOf(palabra.charAt(n));
    }
}
