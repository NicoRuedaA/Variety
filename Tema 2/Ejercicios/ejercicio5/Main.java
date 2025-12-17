import java.util.Scanner;

public class Main {

 

    String inputActual = "", inputAnterior = "";
int repeticionesMax = 1, repeticionesActual = 1;
        Scanner sc = new Scanner(System.in);

        while (!inputActual.equals(".")) {
            inputActual = sc.next();
            if (inputActual.equals(inputAnterior)) {
                repeticionesActual++;
                if (repeticionesActual > repeticionesMax)
                     repeticionesMax = repeticionesActual;
            } else
                repeticionesActual = 1;
            inputAnterior = inputActual;
        }

        System.out.println(repeticionesMax);

        sc.close();

    }
}
