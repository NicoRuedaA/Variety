import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean encontrado = false, fin = false;

        //introducimos el valor a buscar
        int primerInput = sc.nextInt(), secuenciaInput;
        //introducimos la secuencia en orden ascendente
        String outputFinal = "";

        while (!fin){
        //introducimos un valor de la secuencia
            secuenciaInput = sc.nextInt();
            //si no hemos introducido el valor a buscar en la secuencia
            if(!encontrado) {
                //si el valor a buscar es menor que el ultimo valor de la secuencia
                if(secuenciaInput>primerInput){
                    //indicamos que lo hemos metido en la secuencia
                    encontrado = true;
                    //lo metemos en la secuencia
                    outputFinal = outputFinal + (" ") + primerInput;
                }
            }
            //habria que añadir un condicional para no poner un espacio en el primer caso
            //añadimos en la secuencia el ultimo valor introducido
            outputFinal = outputFinal + (" ") + secuenciaInput;
        fin=!sc.hasNextInt();
        }
        System.out.println(outputFinal);

    sc.close();

    /*    RESPUESTA LUCAS
    Scaner sc = new Scanner(System.in=;
    int p = sc.nextInt();

    boolean insertado = false;
    boolean fiSeq=false;
    while((fiseq && sc.hasnextint())){
        if(sc.hasNextInt()) {
            s = sc.nextInt;
            if(!insertado && s>= p) {
                System.out.print(p + " ");
                insertado = true;
            }
            System.out.println(s + " ");
        }
        else{
                String token = sc.next();
            if (token.equals(".")){
                if(!insertado)
                    System.out.print(p);
                    insertado = true;
                fiseq=true;
                }
            }
        }
    }
    sc.close);*/
    }
}

