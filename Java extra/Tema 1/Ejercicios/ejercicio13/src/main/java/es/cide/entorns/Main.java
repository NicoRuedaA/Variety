package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        String text = " ";
        boolean fi = false;

        while (!fi) {
            text = sc.nextLine();
            String[] paraules = text.split(" ");
            if (paraules[0].equals("f") || paraules[1].equals("f")) {
                fi = true;
                break;
            }

            a = Integer.parseInt(paraules[0]);
            b = Integer.parseInt(paraules[1]);
            int c = a + b;
            System.out.println(c);
        }
        sc.close();
    }
}