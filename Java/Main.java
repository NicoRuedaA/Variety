/*Nicolás Daniel Rueda Araque
* 42313237e    
*25/9/25 */

package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        //***IDENTIFICA LOS IDENTIFICADORES CORRECTOS***
        //CORRECTAS

            int Precio___;
            int archivo_3;          
            int primer_apellido;
            int primerApellido;
            int Weight;
            int high;

            //Correcta pero caracteres no anglosajones (no recomendado).
            int $impuesto; 
            int PesoMáximo;
            int $$precioMínimo;
            int _$Único;             
            int tamaño_màximo;
            int cuántoVale;
            int piragüista;
            int barça;
            int año;               

            //Correctas pero poco descriptivas. No recomendable usar numero hexadecimal
            int B_011;               
            int X012AB;
            int C3PO;

        int registro1;
        /*INCORRECTAS
            variable iniciada con número    
            int 1registro; 
            int 0X1A;
            int 70libro;     
            int 123#;

            uso de palabras reservadas
            int while;
            int else;

            uso de caracter no soportado/reservado
            int primer apellido;
            int primer-apellido;
            int Tom’s;
            int matrícula?;
            int %descuento;
            int peso.maximo;
        */
        

//***Define que tipo de variable es mejor para cada literal ***

/*Erroneo
*Variable comenzada por . en vez de 0.
    .5
    .01011 
    .00.8E2
    .3e3f

*Uso de más de un .
    1.34.5
    0.8E+0.8

*Uso de caracter reservado para nombres, no literales
    _234
    12345678_L
    1_2_3
    3_e12
    -3E-1_2
    1_234.2E-2
    1_1.2e_2
    12_234L
    05_15
    0_B11
    0_557
    0.8E 8

*Hexadecimal incorrecto. Debe comenzar por 0x
    0.8E+0.8
    abcd
    12.3E4F
    0.8E
    018CDF
    0bABCDL
    
Binario incorrecto. Usa más de 1 o 0
    0B1212
    0X12AG
    0Xabcd
    0xabcEL
    0xedad
    0X12AL;
    1234.2EF
    1234.2E3F
    234567L
    0b111

*El binario se decalra al principio no al final. Con 0B
    1010B
    B1101
*/

//Numero en octal
int entero1 = 0125;
int entero2 = 12345678;
//Numero en octal
int entero3= 010101;

double decimal1 = 0.5;
double decimal2 = 9.3e12;
double decimal3 = 9.3e-12;


int hexadecimal1 = 0XBC5DA;
int hexadecimal2 = 0x87e3a;
int hexadecimal3 = 0x1010B;
int hexadecimal4 = 0X1A;
int hexadecimal5 = 0XBE2;


double exponente1 = 3e12;
double exponente2 = 101e2;

//Imprimir variables correctas para comprobar
System.out.println("Ejercicio 2");

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

System.out.println(exponente1);
System.out.println(exponente2);

//***Define que tipo de variable es mejor para cada literal ***
System.out.println('\n' + "Ejercicio 3");
char caracter1 = 'a';
char caracter2 = '$';
char caracter3 = '\n';
// char caracter4 = '/n'; dos caracteres
// char caracter5 = '\\'; lo correcto es \\\\
//char caracter6 = '\ñ'; \ñ no existe como valor especial
//char caracter7 = "T"; uso incorrecto de ''
char caracter8 = 'ñ';
//char caracter9 = 'xyz'; 3 caracteres
char caracter10 = '\u0066';
//char caracter11 = "XYZ"; 3 caracteres
char caracter12 = '4';
char caracter13 = '\t';
char caracter14 = '\b';
//char caracter15 = k; no usa ""
//char caracter16 = +; no usa ""
char caracter17 = '+';
char caracter18 = '?';
char caracter19 = 'â';
char caracter20 = ':';

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

//***Decir que strings son correctos y cuales no***
System.out.println('\n' + "Ejercicio 4");

//String cadenacaString1 = '8:15 P.M.'; no usa " "
String cadenacaString2 = "Rojo, Blanco y Azul";
//String cadenacaString1 = "Nombre: ; falta cerrar " "
//String cadenacaString3 = "Capítulo \’3\’"; caracter especial no existente
String cadenacaString4 = "1.3e-1-2";
String cadenacaString5 = "";
String cadenacaString6 = " ";
String cadenacaString7 = "A";
//String cadenacaString1 = "FP'; no cierra con 
String cadenacaString8 = " programación ";
//String cadenacaString9 = "programación "Java""; estas decalrando dos strings no 1. Cierras el primero
//String cadenacaString10 = programación; no usa " "
//String cadenacaString11 = 'W'; no usa " "
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

//***Ejercicio 5 ***
int p = 1, q = 1;
System.out.println('\n' + "Ejercicio 5");
System.out.println("p = " + 1 + " q = " + q);
float x=0.1F, y=0.2F, z=0.3F;
System.out.println("x = " + x + " y = " + y + " z = " + z);
char a = 'A', b='B', c='C';
System.out.println("a = " + a + " b = " + b + " c = " + c);
double raiz1 = 0.01, raiz2= 0.02;
System.out.println("raiz1 = " + raiz1 + " raiz 2 = " + raiz2);
int indice = 3;
System.out.println("indice" + 3);
double precio = 1, precioFinal = 1.21;
System.out.println("precio = " + precio + "precioFinal = " + precioFinal);
char car1 = 'y', car2 = 'z';
System.out.println("car1 = " + y + "car2 = " + z);
byte byte1 = 0B10;
System.out.println("byte1 = " + byte1);
String nombre = "patata";
System.out.println("nombre = " + nombre);
    }
}