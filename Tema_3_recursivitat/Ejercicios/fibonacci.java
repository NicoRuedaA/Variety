public class fibonacci {

    static int calcular(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return calcular(n - 1) + calcular(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(calcular(7));

    }

}
