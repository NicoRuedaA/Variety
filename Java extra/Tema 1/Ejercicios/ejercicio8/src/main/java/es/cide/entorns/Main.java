package es.cide.entorns;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String valoresIntroducidos = " ";
        boolean parar = false;
        int y = 0;
        int x = 0;

        while(!parar){
            valoresIntroducidos = sc.nextLine();
            for (int i = 0; i < valoresIntroducidos.length(); i++) {
                if(!parar){
                    if(valoresIntroducidos.charAt(i)=='.') {
                        parar=true;
                    }
                    else if (valoresIntroducidos.charAt(i)=='n') y-=1;
                    else if (valoresIntroducidos.charAt(i)=='s') y+=1;
                    else if (valoresIntroducidos.charAt(i)=='w') x-=1;
                    else if (valoresIntroducidos.charAt(i)=='e') x+=1;
                }
            }
        }

        System.out.println("(" + x + "," + y +")");
        sc.close();

    }
}