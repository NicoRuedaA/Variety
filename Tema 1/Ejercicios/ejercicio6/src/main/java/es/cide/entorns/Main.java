package es.cide.entorns;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;

        while(n<=0){
            System.out.print("Introduce un valor mayor que 0 ");
            n = sc.nextInt();
        }
        
        for(int i = 0; i<=n; i++){
            for(int j = 0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}