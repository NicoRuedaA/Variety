package es.cide.programacio;

public class LeChuck extends Pirata {
    static final int NUMERO_INSULTS = 4;

    // strings para saludo y despedida
    String saludoLeChuck = UI.ROJO
            + "¡MUA JA JA JA! ¿Creías que podrías escapar de mí?\n"
            + "He cruzado los siete infiernos y he vuelto de entre los muertos solo para una cosa...\n"
            + "¡VENGANZA! ¡Despídete de tu miserable vida, porque tu alma ahora me pertenece!"
            + UI.RESET;

    String despedidaLeChuck = UI.ROJO
            + "¡NOOOO! ¡IMPOSIBLE! ¡Siento cómo mi ectoplasma se desvanece!\n"
            + "¡Maldito seas! ¡No creas que has ganado! ¡Volveré!\n"
            + "¡Siempre vuelvo! ¡Nos veremos en el infierrnooooo...!"
            + UI.RESET;

    // ***CONSTRUCOTRES***
    public LeChuck(Insult[] arrIns, int v) {
        // constructor
        super(arrIns, v);
        this.nom = "Pirata LeChuck";
        this.vidaMax = vida;

        // creamos una nueva array de tamaño 4
        Insult[] nuevosInsultos = new Insult[NUMERO_INSULTS];

        // igualamos los insultos 1, 2 y 3 del array que se creó en el constructor
        for (int i = 0; i < this.arrayInsults.length; i++) {
            nuevosInsultos[i] = this.arrayInsults[i];
        }

        // el ultimo insulto = al reservado para LeChuck
        nuevosInsultos[3] = arrIns[arrIns.length - 1];
        setArrayInsults(nuevosInsultos);
    }

    // ***METODOS PUBLICOS***
    @Override
    public void sayHello() {

        UI.escribirLento(saludoLeChuck, 15);

    }

    @Override
    public void sayGoodBye() {
        UI.escribirLento(despedidaLeChuck, 15);
    }

}
