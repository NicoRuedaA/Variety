import java.math.*;

import java.util.Scanner;

public class main {

    public static int compta7(int x) {
        if (x < 10) {
            if (x == 7) {

                return 1;
            }

            else {

                return 0;
            }

        } else {
            if ((x % 10) == 7) {

                return (1 + compta7(x / 10));

            }

            else {

                return (compta7(x / 10));

            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(compta7(a));
        sc.close();
    }
}
