
package es.cide.programacio;

public class Elaine extends Heroi {
    // vida (inicial) constante
    private static final int VIDA_INICIAL = 10;

    // ***CONSTRUCTORES***
    public Elaine(Insult[] arrResp) {
        super("Elaine", VIDA_INICIAL, arrResp);
        sayHello();
    }

    // ***METODOS VOIDS***
    @Override
    public void sayHello() {
        String saludo = UI.ROSA
                + "Vaya... Por fin alguien con sentido común al mando. Soy la Gobernadora Elaine Marley.\n" + //
                "\n" + //
                "Gracias por elegirme. Si hubiera tenido que esperar a que Guybrush resolviera esto, seguiríamos aquí en el año 2090. Tengo un barco, tengo un plan y no necesito preguntar a tres piratas borrachos cómo escupir para avanzar.\n"
                + //
                "\n" + //
                "Vamos. Demostremos cómo se hace una aventura gráfica de verdad";
        UI.escribirLento(saludo, 7);
        UI.pausa(1000);
        System.out.println();
    }

}
