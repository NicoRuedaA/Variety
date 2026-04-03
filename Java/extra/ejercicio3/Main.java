public class Main {
    public static void main(String[] args) {
        long aBuscar = 600851475143L;
        long numPrimo = 3L;
        while (numPrimo * numPrimo < aBuscar) {
            System.out.println(numPrimo);
            numPrimo += 2;
        }
    }
}