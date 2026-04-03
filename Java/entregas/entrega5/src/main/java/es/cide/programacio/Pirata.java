/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

import java.util.Random;

//objeto pirata
public class Pirata extends Personatge implements Speak, Fight {
    // constantes para crear el pirata
    private static final int NUM_INSULTS = 3; // numero de insultos que tendrá el pirata

    private Insult insultActual; // usaremos como ""puntero"" del insulto actual
    protected Insult[] arrayInsults; // array donde guardaremos nuestros insultos
    private static int numeroPirata = 1; // variable para indicar el numero del pirata, lo usaremos para el nombre
    protected int vidaMax; // variable vida max

    // ***CONSTRUCTORES***
    public Pirata(Insult[] arrIns, int n) {
        // creamos el pirata a través de herencia
        super("Pirata " + numeroPirata, n);
        // Le asignamos su vida como vida maxima (uso para barra gráfica)
        this.vidaMax = this.vida;
        numeroPirata++;
        // generamos los insultos
        generarInsults(arrIns);
    }

    // ***METODOS PRIVADOS***
    protected void generarInsults(Insult[] arrIns) {
        Random random = new Random();
        // arrayinsults es igual a una nueva array de insultos de tamaño NUM_INSULTS
        this.arrayInsults = new Insult[NUM_INSULTS];
        // creamos 3 int para obtener 3 insultos aleatorios del array "arrIns"
        int x, y, z;
        // x es un random entre el tamaño del array y 0
        x = random.nextInt(arrIns.length);
        // lo mismo con y pero sin que sea igual a x
        do {
            y = random.nextInt(arrIns.length);
        } while (y == x);
        // lo mismo con z pero sin que sea igual a x e y
        do {
            z = random.nextInt(arrIns.length);
        } while ((z == x) || (z == y));

        // insertamos los insultos en la lista
        this.arrayInsults[0] = arrIns[x];
        this.arrayInsults[1] = arrIns[y];
        this.arrayInsults[2] = arrIns[z];
        this.insultActual = arrayInsults[random.nextInt(NUM_INSULTS)];
    }

    private Insult nouInsult() {
        Random random = new Random();
        return arrayInsults[random.nextInt(arrayInsults.length)];
    }

    // ***METODOS PUBLICOS***
    public boolean replica(String s) {
        // devolvemos false o true
        // según la comparación entre el String pasado "s" y la respuesta de nuestro
        // insulto actual

        // comparamos "s" con la respuesta del insulto actual
        boolean coincide = insultActual.getTextoRespuesta().equals(s);
        // actualizamos el insulto actual
        this.insultActual = nouInsult();
        // imprimimos el resultado
        if (coincide)
            UI.escribirLento("RESPUESTA CORRECTA", 50);
        else
            UI.escribirLento("RESPUESTA INCORRECTA", 50);
        System.out.println();
        // devolvemos el resultado
        return coincide;
    }

    public Insult getInsultoActual() {
        // devolvemos el objeto tipo Insult del "Insult actual"
        return insultActual;
    }

    public Insult getInsulto(int x) {
        // devolvemos un objeto insulto concreto por índice X
        if (x >= NUM_INSULTS) {
            // si x es mayor que el numero de insultos, devuelve un error en forma de
            // mensaje
            UI.escribirLento("X fuera de rango", 10);
            return this.arrayInsults[0];
        }
        return this.arrayInsults[x];

    }

    public void sayHello() {
        // imprimimos el nombre del pirata actual + el saludo
        String saludoDesagradable = UI.ROJO
                + "¡Arr! ¿Qué quieres, tú? Tienes cara de ser un aspirante a pirata... o de vender chaquetas de cuero usadas. ¡Habla rápido antes de que mi grog se caliente o decida usarte para limpiar la cubierta!"
                + UI.RESET;

        UI.escribirLento(this.getNom() + ": " + saludoDesagradable, 15);
    }

    public void sayGoodBye() {
        // imprimimos el nombre del pirata actual + el saludo
        String saludoDesagradable = UI.ROJO
                + "¡Largo de aquí, grumete, me estás dando dolor de cabeza! Y ten cuidado al salir... ¡MIRA DETRÁS DE TI! ¡Un mono de tres cabezas!"
                + UI.RESET;
        UI.escribirLento(this.getNom() + ": " + saludoDesagradable, 20);
        UI.limpiarConsola();
    }

    public void defensar() {
        // el pirata no se defiende. Tiene que existir por herencia
    }

    public void insultar() {
        // devolvemos el String del "insulto actual"
        // imprimimos el nombre del pirata actual + el"insulto"
        UI.escribirLento(this.getNom() + ": " + this.insultActual.getTextoInsulto(), 15);

        Sound insult = new Sound();
        insult.reproducirUnaVez("pirate.wav");

    }

    @Override
    public boolean vida() {
        this.vida--;
        return vida > 0;
    }

    // ***GETS***

    public int getVida() {
        return this.vida;
    }

    public int getVidaMax() {
        return this.vidaMax;
    }

    public String getNom() {
        return this.nom;
    }

    public Insult[] getArrayiInsults() {
        return this.arrayInsults;
    }

    public Insult getInsultActual() {
        return this.insultActual;
    }

    // ***SETS***

    public void setVida(int v) {
        this.vida = v;
    }

    public void setNom(String n) {
        this.nom = n;
    }

    public void setArrayInsults(Insult[] ar) {
        this.arrayInsults = ar;
    }

    public void setInsultActual(Insult x) {
        this.insultActual = x;
    }

}
