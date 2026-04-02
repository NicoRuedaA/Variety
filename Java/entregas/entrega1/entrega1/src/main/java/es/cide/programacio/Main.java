/*Nicolás Daniel Rueda Araque
* 42313237e    
*25/9/25 */

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        System.out.println("*** 1: Indica els identificadors correctes (als comentaris)" );
        // CORRECTAS

        int registro1;
        int archivo_3;
        int primer_apellido;
        int primerApellido;
        int Weight;
        int high;
        int Precio___;

        // Correcta pero caracteres no anglosajones (no recomendado).
        int $impuesto;
        int PesoMáximo;
        int $$precioMínimo;
        int _$Único;
        int tamaño_màximo;
        int cuántoVale;
        int piragüista;
        int barça;
        int año;

        // Correctas pero poco descriptivas.
        int B_011;
        int X012AB;
        int C3PO;

     
        /*
                * INCORRECTAS
                        * variable iniciada con número
         * int 1registro;
         * int 0X1A;
         * int 70libro;
         * int 123#;
         * 
                        * uso de palabras reservadas
         * int while;
         * int else;
         * 
                        * uso de caracter no soportado/reservado
         * int primer apellido;
         * int primer-apellido;
         * int Tom’s;
         * int matrícula?;
         * int %descuento;
         * int peso.maximo;
         */



        System.out.println('\n' + "*** 2: Define que tipo de variable es mejor para cada literal ***");

        /*
         * Erroneo
         *      Variable comenzada por . en vez de 0.
         * .5
         * .01011
         * .00.8E2
         * .3e3f
         * 
         *      Uso de más de un .
         * 1.34.5
         * 
         *      Exponente mal formado
         * 0.8E+0.8
         * 
         * Uso de caracter reservado para nombres, no literales
         * _234
         * 12345678_L
         * 1_2_3
         * 3_e12
         * -3E-1_2
         * 1_234.2E-2
         * 1_1.2e_2
         * 12_234L
         * 05_15
         * 0_B11
         * 0_557
         * 0.8E 8
         * 
         * Hexadecimal incorrecto. Debe comenzar por 0x
         * 0.8E+0.8
         * abcd
         * 12.3E4F
         * 0.8E
         * 018CDF
         * 0bABCDL
         * 
         * Binario incorrecto. Usa más de 1 o 0
         * 0B1212. Usa 2 en binario
         * 
         * 0X12AG
     
         * 0xabcEL
         * 

         * 0X12AL;


         * 
         * El binario se decalra al principio no al final. Con 0B
         * 1010B
         * B1101
         * 
         *      Sufijo EF no existe
         *          1234.2EF
         *          1234.2E3F (sin la e seria correcto)
         */


         //Correctos

        // Numero en octal
        int entero1 = 0125;
        //podria ser Long, L al final
        int entero2 = 12345678;
        // Numero en octal
        int entero3 = 010101;

        double decimal1 = 0.5;
        double decimal2 = 9.3e12;
        double decimal3 = 9.3e-12;

        int hexadecimal1 = 0XBC5DA;
        int hexadecimal2 = 0x87e3a;
        int hexadecimal3 = 0x1010B;
        int hexadecimal4 = 0X1A;
        int hexadecimal5 = 0XBE2;
        int hexadecimal6 = 0Xabcd;
        int hexadecimal7 = 0xedad;

        double exponente1 = 3e12;
        double exponente2 = 101e2;

        long long1 = 234567L;

        double binario1 = 0b111;


        System.out.println(entero1);
        System.out.println(entero2);
        System.out.println(entero3);

        System.out.println(decimal1);
        System.out.println(decimal2);
        System.out.println(decimal3);

        System.out.println(hexadecimal1);
        System.out.println(hexadecimal2);
        System.out.println(hexadecimal3);
        System.out.println(hexadecimal4);
        System.out.println(hexadecimal5);
        System.out.println(hexadecimal6);
        System.out.println(hexadecimal7);

        System.out.println(exponente1);
        System.out.println(exponente2);

        System.out.println(long1);

        System.out.println(binario1);

                // ***Define que tipo de variable es mejor para cada literal ***
                System.out.println('\n' + "*** 3: Exercicis de literals del tipus “char” ***. Decidir quins son correctes i quins no. \r\n");
                char caracter1 = 'a';
                char caracter2 = '$';
                char caracter3 = '\n';
                // char caracter4 = '/n'; dos caracteres
                // char caracter5 = '\\'; lo correcto es \\\\
                // char caracter6 = '\ñ'; \ñ no existe como valor especial
                // char caracter7 = "T"; uso incorrecto de ''
                char caracter8 = 'ñ';
                // char caracter9 = 'xyz'; 3 caracteres
                char caracter10 = '\u0066';
                // char caracter11 = "XYZ"; 3 caracteres
                char caracter12 = '4';
                char caracter13 = '\t';
                char caracter14 = '\b';
                // char caracter15 = k; no usa ""
                // char caracter16 = +; no usa ""
                char caracter17 = '+';
                char caracter18 = '?';
                char caracter19 = 'â';
                char caracter20 = ':';

        System.out.println("Correctos:");
        System.out.println(caracter1);
        System.out.println(caracter2);
        System.out.println(caracter3);
        System.out.println(caracter8);
        System.out.println(caracter10);
        System.out.println(caracter12);
        System.out.println(caracter13);
        System.out.println(caracter14);
        System.out.println(caracter17);
        System.out.println(caracter18);
        System.out.println(caracter19);
        System.out.println(caracter20);

        // ***Decir que strings son correctos y cuales no***
        System.out.println('\n' + "***4:Exercicis sobre string***");

        // String cadenacaString1 = '8:15 P.M.'; no usa " "
        String cadenacaString2 = "Rojo, Blanco y Azul";
        // String cadenacaString1 = "Nombre: ; falta cerrar " "
        // String cadenacaString3 = "Capítulo \’3\’"; caracter especial no existente
        String cadenacaString4 = "1.3e-1-2";
        String cadenacaString5 = "";
        String cadenacaString6 = " ";
        String cadenacaString7 = "A";
        // String cadenacaString1 = "FP'; no cierra con
        String cadenacaString8 = " programación ";
        // String cadenacaString9 = "programación "Java""; estas decalrando dos strings
        // no 1. Cierras el primero
        // String cadenacaString10 = programación; no usa " "
        // String cadenacaString11 = 'W'; no usa " "
        String cadenacaString12 = "\n";
        String cadenacaString13 = "4 + 5 * 2";

        System.out.println(cadenacaString2);
        System.out.println(cadenacaString4);
        System.out.println(cadenacaString5);
        System.out.println(cadenacaString6);
        System.out.println(cadenacaString7);
        System.out.println(cadenacaString8);
        System.out.println(cadenacaString12);
        System.out.println(cadenacaString13);

        // ***Ejercicio 5 ***
        System.out.println('\n' + "***5: Declara les següents variable***");
        int p = 1, q = 1;
        System.out.println("p = " + 1 + " q = " + q);
        float x = 0.1F, y = 0.2F, z = 0.3F;
        System.out.println("x = " + x + " y = " + y + " z = " + z);
        char a2 = 'A', b2 = 'B', c2 = 'C';
        System.out.println("a = " + a2 + " b = " + b2 + " c = " + c2);
        double raiz1 = 0.01, raiz2 = 0.02;
        System.out.println("raiz1 = " + raiz1 + " raiz 2 = " + raiz2);
        int indice = 3;
        System.out.println("indice" + indice);
        double precio = 1, precioFinal = 1.21;
        System.out.println("precio = " + precio + "precioFinal = " + precioFinal);
        char car1 = 'y', car2 = 'z';
        System.out.println("car1 = " + car1 + "car2 = " + car2);
        byte byte1 = 0B10;
        System.out.println("byte1 = " + byte1);
        String nombre = "patata";
        System.out.println("nombre = " + nombre);

        // ***Ejercicio 6 ***
        System.out.println('\n' + "*** 6: Declara les variables, inicialitzales i imprimeix-les per consol·la***"); 
        int edad = 15;
        System.out.println(edad);
        int codigoPostal = 07500;
        System.out.println(codigoPostal);
        double altura = 1.92;
        System.out.println(altura);
        char genero = 'H';
        System.out.println(genero);
        nombre = "Nico";
        System.out.println(nombre);;
        int numeroDeHijos = 0;
        System.out.println(numeroDeHijos);
        double iva = 0.21;
        System.out.println(iva);
        int tallaCamisa = 42;
        System.out.println(tallaCamisa);
        double peso = 65.5;
        System.out.println(peso);
        String alumnoRepetidor = "Si";
        System.out.println(alumnoRepetidor);
        String mensaje = "Hola";
        System.out.println(mensaje);
        char letra = 'C';
        System.out.println(letra);                                                       
        boolean mayorEdad = true;         
        System.out.println(mayorEdad);                                  
        int minutos = 4;        
        System.out.println(minutos);                                                    
        int dias = 7;
        System.out.println(dias);
        String matriculaCoche = "XB6788"   ; 
        System.out.println(matriculaCoche);                                   
        double contador = 56.56;
        System.out.println(contador);
        boolean mayorDeEdad = true;
        System.out.println(mayorDeEdad);
        char tallaCamiseta = 'M';
        System.out.println(tallaCamiseta);
        


        // ***Ejercicio 7 ***
        System.out.println('\n' + "*** 7: Declara les variables. Inicialitza les variables. Calcula l'expressió. Imprimeix el resultat ***");
        double resultado = -1;
        // a)
        //declaramos los enteros como double para no perder información
        double a = 1, b = 2, c = 3, d=4;
        resultado =(b / 2) - (4 * a * c);
        System.out.println("a)");
        System.out.println(resultado);
        // b) 
        x = 2;
        y = 3;
        z = 4;
        p = 6;
        q = 7;

        System.out.println("b)");
        resultado = 3 * x * y - 5 * x + 12 * x - 17;
        System.out.println(resultado);
        // c)
        double h = 4;
        resultado =(b + h) / (c + 4);
        System.out.println("c)");
        System.out.println(resultado);
        // d)
        resultado =((x * y) / y) + 2;
        System.out.println("d)");
        System.out.println(resultado);
        // e)
        resultado = (1 / y) + ((3 * x) / z) + 1;
        System.out.println("e)");
        System.out.println(resultado);
        // f)
        // System.out.println((1/(y+3))+(x/y)+); Error. Ecuación no cerrada
        System.out.println("f) Error. Ecuación no finalizada, no puede acabar con un '+'");
        // g)
        resultado =(1 / y) + ((3 + x) / (y + 1));
        System.out.println("g)");
        System.out.println(resultado);

        // ***Ejercicio 8 ***
        System.out.println('\n' + "*** 8: Convertir les expressions algebràiques a algotímiques***");
        double m=0.05, n=0.07, r=6, s=7, g=2, e=1, f=2, j=7;
        h=3;

        //  a)
        double expresion1 = ((3/2)+(4/3));
        //  b)
        double expresion2 = ((1/(x-5))-((3*x*y)/4));
        // c)
        double expresion3 = ((1/2)+7);
        //  d)
        double expresion4 = (7+(1/2));
        // e)
        double expresion5 = (((a * a)/(b2-c2))+((d-e)/(f-((g*h)/j))));
        // f)
        double expresion6 = ((m/n)+p);
        //  g)
        double expresion7 = (m+(n/(p-q)));
        //  h)
        double expresion8 = (((a*a)/(b2*b2))+((c2*c2)/(d*d)));
        //  i)
        double expresion9 = ((m+(n/p))/(q-(r/s)));
        //  j)
        double expresion10 = ((3*a+b)/(c-((d+5*a)/(b2+(c2/2*h)))));
        //  k)
        double expresion11 = (a*a+2*a*b+b)/((1/(x*x))+2);

        System.out.println(expresion1);
        System.out.println(expresion2);
        System.out.println(expresion3);
        System.out.println(expresion4);
        System.out.println(expresion5); 
        System.out.println(expresion6);
        System.out.println(expresion7);
        System.out.println(expresion8);
        System.out.println(expresion9);
        System.out.println(expresion10);
        System.out.println(expresion11);

        // ***Ejercicio 9 ***
        System.out.println('\n' + "*** 9: Calcula totes les expressions. Imprimeix els resultats***");
        a=8; b=3; c=-5;
        //a)
        System.out.println("a)");
        System.out.println(a + b + c);
        //b
        System.out.println("b)");
        System.out.println(2 * b + 3 * (a - c));
        //c
        System.out.println("c)");
        System.out.println(a / b);
        //d
        System.out.println("d)");
        System.out.println(a % b);
        //e
        System.out.println("e)");
        System.out.println(a / c);
        //f
        System.out.println("f)");
        System.out.println(a % c);
        //g
        System.out.println("g)");
        System.out.println(a * b / c);
        //h
        System.out.println("h)");
        System.out.println (a * (b / c));
        //i
        System.out.println("i)");
        System.out.println((a * c) % b); 
        //j
        System.out.println("j)");
        System.out.println(a * (c % b)); 
        //k
        System.out.println("k)");
        System.out.println((3 * a - 2 * b) % (2 * a - c));
        //l
        System.out.println("l)");
        System.out.println(2 * ( a / 5 + (4 - b * 3)) % (a + c - 2));
        //m
        System.out.println("m)");
        System.out.println((a - 3 * b) % (c + 2 * a) / (a - c));
        //n
        System.out.println("n)");
        System.out.println(a - b - c * 2);

        System.out.println("Si usamos int para almazenar el resultado perderiamos información en los apartados c, e, g, h, i, l, m");

        // ***Ejercicio 10 ***
        System.out.println('\n' + "*** 10: Calcula totes les expressions. Imprimeix els resultats***");
        x= 88f; y = 3.5f; z = -5.2f;
        //a) 
                System.out.println("a)");
        System.out.println(x + y + z);                                  
        //b) 
                System.out.println("b)");
        System.out.println(2 * y + 3 * (x - z));                                           
        //c) 
                System.out.println("c)");
        System.out.println(x / y);
        //d) 
                System.out.println("d)");
        System.out.println(x % y);
        //e) 
                System.out.println("e)");
        System.out.println(x / (y + z)  );                               
        //f) 
                System.out.println("f)");
        System.out.println((x / y) + z);
        //g) 
                System.out.println("g)");
        System.out.println(2 * x / 3 * y  );                            
        //h) 
                System.out.println("h)");
        System.out.println(2 * x / (3 * y));
        //i) 
                System.out.println("i)");
        System.out.println(x * y % z     );                              
        //j) 
                System.out.println("j)");
        System.out.println(x * (y % z));
        //k) 
                System.out.println("k)");
        System.out.println(3 * x - z - 2 * x  );                      
        //l) 
                System.out.println("l)");
        System.out.println(2 * x / 5 % y);
        //m) 
                System.out.println("m)");
        System.out.println(x - 100 % y % z   );                   
        //n) 
                System.out.println("n)");
        System.out.println(x - y - z * 2);

                // ***Ejercicio 11 ***
        System.out.println('\n' + "*** 11: Declara una variable que sigui capaç d'emmagatzemar el resultat de l'expressió***" );

        byte b1=0B01;
        short s1=1;
        long ln1=2;
        int i1=1, j1=2;
        float f1=0.5f;
        double d1=0.3;
        char c1='F';

        //a)

        //int + char = int
        System.out.println(i1+c1);
        //float - char = float
        System.out.println(f1-c1);
        //double + float = double
        System.out.println(d1+f1);
        //double + int = int
        System.out.println(d1+i1);
        //int/float = float
        System.out.println(i1/f1);
        //short + int = int
        System.out.println(s1+j1);
        //double + int = double
        System.out.println(d1+j1);
        //short * char = int
        System.out.println(s1*c1);
        //double + char = double
        System.out.println(d1+c1);
        //byte * char = int
        System.out.println(b1+c1);
        // byte / char = int + short = int
        System.out.println(b1/c1+s1);
        // char + char = int
        System.out.println(c1+c1);
        //int + long + double = double
        System.out.println(i1+ln1+d1);
        //long + char = long
        System.out.println(ln1+c1);
        //int / int = int
        System.out.println(51/j1);
        //double / int = double
        System.out.println(5.2/j1);
        // int * float * int * int
        System.out.println(i1*f1*2*5);
        // long * float * float = float
        System.out.println(ln1*f1*2.5F);

        //Ejercicio 12
        System.out.println('\n' + "*** 12: Calcula totes les expressions. Imprimeix els resultats***");
        boolean X = true, Y= false, Z=true;
        System.out.println((X && Y)||(X && Z));
        System.out.println((X || !Y)&& (!X || Z));
        System.out.println(X || Y && Z);
        System.out.println( !(X || Y) && Z);
        System.out.println( X || Y || X && !Z && !Y);
        System.out.println(!X || !Y || Z && X && !Y);
        
        //Ejercicio 13
                System.out.println('\n' + "*** 13: Calcula totes les expressions. Imprimeix els resultats***");
        boolean W= false; X=true ; Y= true; Z=false;
        System.out.println(W || Y && X && W || Z);
        System.out.println(X && !Y && !X || !W && Y);
        System.out.println(!(W || !Y) && X || Z);
        System.out.println(X && Y && W || Z || X);
        System.out.println(Y || !(Y || Z && W));
        System.out.println(!X && Y && (!Z || !X));

        
        //Ejercicio 14
                System.out.println('\n' +  "*** 14: Calcula totes les expressions. Imprimeix els resultats***");
        int i3 = 8, j3 = 5;
        float x3 = 0.005F, y3 = -0.01F;
        char c3 = 'c', d3 = 'd';

        System.out.println(i3 <= j3);                                                                        	
        System.out.println(c3 > d3);                     
        System.out.println(x3 >= 0); 
        System.out.println(j3 != 6);           
        System.out.println(!(i3 <= j3));    
        System.out.println(!(x3 > 0)); 
        System.out.println(++x3 > 0         ); 
        System.out.println(c3 > d3 || c3 > 0  ); 
        System.out.println(2 * x3 + y3 == 0  ); 
        System.out.println(x3 + y3  >= 0     ); 
        System.out.println(- (i3+ j3) != -i3 + j3); 
        System.out.println(i3 > 0 && j3 < 5  ); 
        System.out.println(x3 > y3 && i3 > 0 || j3 < 5); 
        System.out.println(2 * ((i3 / 5) + (4 * (j3 - 3)) % (i3 + j3 - 2)) >= 10); 
        System.out.println(((i3 - 3 * j3) % (c3 + 2 * d3) / (x3 - y3)) >= 0);

    }
}