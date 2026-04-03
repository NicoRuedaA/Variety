import java.math.*;

import java.util.Scanner;

public class main {

    public static int compta8(int x) {
        if (x < 10) {
            if (x == 8) {
                return 1;
            }

            else {
                return 0;
            }

        } else {
            if ((x % 10) == 8) {
                if ((x / 10) % 10 == 8) {
                    return (2 + compta8(x / 10));
                } else
                    return (1 + compta8(x / 10));

            }

            else {
                return (compta8(x / 10));
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(compta8(a));
        sc.close();
    }
}
