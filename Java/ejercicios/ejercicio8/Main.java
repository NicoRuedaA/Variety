public class Main {
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
    }

    public static void ejercicio1() {
        //1. Declarar 4 variables tipo String
        String enterPositiu = "45", decimal = "3.5", boolea = "true", caracter = "A";

        //2. Utilizar Wrappers correspondientes
        try {
            int num = Integer.parseInt(enterPositiu);
        } catch (NumberFormatException e) {
            System.out.println("Error parse int");
        }
        try {
            double dec = Double.parseDouble(decimal);
        } catch (NumberFormatException e) {
            System.out.println("Error parse double");
        }
        boolean bl;
        if ((boolea == "true") || (boolea == "false")) {
            bl = Boolean.parseBoolean(boolea);
        } else
            System.out.println("Error parse boolean");
        char charac;
        if (charact == null)
            System.out.println("Error parse char");
        else
            charac = caracter.charAt(0);

        //3.
            //Sumar entero y decimal y guardarlo en double
        double resultat = num + dec;
            //mostrar por pantalle si el boolean es true o false
        System.out.println("boolean convertido " + bl);
            //convertir caracter a valor ASCII
        System.out.println("caracter en ascii " + (int) charact);

        //4. Mostrar por pantalla
            //valores originales
        System.out.println("Valores originales");
        System.out.println(enterPositiu + " " + decimal + " " + boolea + " " + caracter);
            //valores convertidos
        System.out.println("Valores convertidos");
        System.out.println(num + " " + dec + " " + bl + " " + charac);
            //resultados de la operacion
        System.out.println("Resultados operaciones");
        System.out.print(resultat);

        //5. Implementado en el ejercicio 2
    }

    public static void ejercicio2() {
        // 1. declara 8 variables
        byte byteNum;
        short shortNum;
        int intNum;
        long longNum;
        float floatNum;
        double doubleNum;
        char caracter;
        boolean bool;

        // 2. Inicialitza bariables
        byteNum = 2;
        shortNum = 2;
        intNum = 3;
        longNum = 4L;
        floatNum = 5f;
        doubleNum = 6;
        caracter = 'A';
        bool = false;

        // 3. Realitza les seguents conversions
        // variables numriques a sring
        String stringByte = Byte.toString(byteNum);
        String stringShort = Short.toString(shortNum);
        String stringInt = Integer.toString(intNum);
        String stringLong = Long.toString(longNum);
        String stringFloat = Float.toString(floatNum);
        String stringDouble = Double.toString(doubleNum);

        // char a string
        String stringCaracter = Character.toString(caracter);

        // boolean a string
        String stringBoolean = Boolean.toString(bool);

    }
}