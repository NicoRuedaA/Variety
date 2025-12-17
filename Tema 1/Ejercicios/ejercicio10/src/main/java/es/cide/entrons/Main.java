package es.cide.entrons;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0, b=0;
        a = sc.nextInt();
        b = sc.nextInt();

        if(a<b){
            for (int i = a; i <= b; i++) {
                System.out.print(i + ", ");
            }
        }
        else if (a==b) System.out.print(a);

        sc.close();

    }
}