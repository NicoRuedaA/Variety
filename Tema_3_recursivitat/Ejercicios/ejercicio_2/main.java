
public class main {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        // medir tiempo
        long startRec = System.nanoTime();
        //resultado recursivo
        System.out.println(sumOfDigits(x));
        //parar tiempo
        long endRec = System.nanoTime();

        System.out.println("tiempo: " + (endRec - startRec));

    }

    private static int sumOfDigits(int x) {
        if (x < 10)
            return x;

        else

            return sumOfDigits(x / 10 + x % 10);

    }

}
