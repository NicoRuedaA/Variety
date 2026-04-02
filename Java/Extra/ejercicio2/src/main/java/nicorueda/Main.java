package nicorueda;

public class Main {
    public static void main(String[] args) {
        int primero = 1;
        int segundo = 2;
        int tercero = primero + segundo;
        int suma = 2;

        while (tercero < 4000000) {
            if (tercero % 2 == 0)
                suma += tercero;

            primero = segundo;
            segundo = tercero;
            tercero = (primero + segundo);

        }

        System.out.println("suma: " + suma);
    }
}