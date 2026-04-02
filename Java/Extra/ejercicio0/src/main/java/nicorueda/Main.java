package nicorueda;

public class Main {
    public static void main(String[] args) {
        int tope = 5;
        int suma = 0;
        int contador = 0;

        for(int i = 1; i<=957000; i++){
            if((i*i)%2!=0) {
                //System.out.println(i*i);  
                suma+=(i*i);
            }
            contador++;
            
        }

        System.out.println(suma);

    }
}