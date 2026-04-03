package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

try {

num1 = 0;

num2 = 62 / num1;

System.out.println("Final Try");

} catch (ArithmeticException e) {

//Imprimeix per consola el missatge de l’exepció

e.printStackTrace();

System.out.println("Error: No es pot dividir entre 0");

} finally {

System.out.println("Bloc finally");

}
    }
}   