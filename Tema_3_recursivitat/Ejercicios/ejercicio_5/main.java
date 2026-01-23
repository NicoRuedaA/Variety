import java.math.*;

import java.util.Scanner;

public class main {

    public static int sumaConejos(int x) {
        if (x == 0)
            return 0;
        else if (x % 2 == 0) {
            return sumaConejos(x - 1) + 3;
        } else {
            return sumaConejos(x - 1) + 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(sumaConejos(a));
        sc.close();
    }
}
