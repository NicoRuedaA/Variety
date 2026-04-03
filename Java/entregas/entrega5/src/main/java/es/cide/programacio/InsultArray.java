/*
 * Nicolás Daniel Rueda Araque
 * 42313237e
 * 05/11/2025
 */
package es.cide.programacio;

//clease creada unicamente para almacenar lista de insultos-respuesta. Movido desde el Main para "limpiarlo"
public class InsultArray {

        // array que contiene objeto de tipo insulto. Cada objeto de tipo insulto
        // contiene su string respuesta y string insulto
        private static final Insult[] arrayInsultos = {
                        new Insult("¡Luchas como un granjero!",
                                        "Qué apropiado, tú peleas como una vaca."),

                        new Insult("¡No hay palabras para describir lo asqueroso que eres!",
                                        "Sí que las hay, sólo que nunca las has aprendido."),

                        new Insult("¡He hablado con simios más educados que tú!",
                                        "Me alegra que asistieras a tu reunión familiar diaria."),

                        new Insult("¡No pienso aguantar tu insolencia aquí sentado!",
                                        "Ya te están fastidiando otra vez las almorranas, ¿Eh?"),

                        new Insult("¡Mi pañuelo limpiará tu sangre!",
                                        "Ah, ¿Ya has obtenido ese trabajo de barrendero?"),

                        new Insult("¡Ha llegado tu HORA, palurdo de ocho patas!",
                                        "Y yo tengo un SALUDO para ti, ¿Te enteras?"),

                        new Insult("¿Has dejado ya de usar pañales?",
                                        "¿Por qué? ¿Acaso querías pedir uno prestado?"),

                        new Insult("¡Una vez tuve un perro más listo que tú!",
                                        "Te habrá enseñado todo lo que sabes."),

                        new Insult("¡Nadie me ha sacado sangre jamás, y nadie lo hará!",
                                        "¿TAN rápido corres?"),

                        new Insult("¡Me das ganas de vomitar!",
                                        "Me haces pensar que alguien ya lo ha hecho."),

                        // insulto esclusivo LeChuck
                        new Insult("¡Llevas tantos años pudriéndote que hasta los gusanos de tu barba han pedido el traslado a un cadáver con más futuro!",
                                        "¡Qué curioso, dijeron que se mudaban a tu cerebro porque allí hay mucho más espacio libre!")
        };

        // lanzamos un error si instanciamos un objeto tipo "insultArray"
        private InsultArray() {
                throw new IllegalStateException("no instanciar");
        }

        // get de nuestro array de insultos
        public static Insult[] getInsults() {
                Insult[] arrayAuxiliar = new Insult[arrayInsultos.length]; // nueva array del tamaño de nuestra
                                                                           // lista -1
                for (int i = 0; i < arrayAuxiliar.length; i++) {
                        arrayAuxiliar[i] = arrayInsultos[i]; // igualamos cada valor del array a devolver a la array que
                                                             // contiene todos los insultos
                }
                return arrayAuxiliar;
        }

        public Insult getInsultLeChuck() {
                // det del ultimo insulto que no compartimos en getInsults(). Reservado para
                // Lechuck
                return arrayInsultos[arrayInsultos.length - 1];
        }

}
