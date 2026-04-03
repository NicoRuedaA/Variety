package es.cide.programacio;

public class Main {
    public static void main(String[] args) {
        CotxeCombustio cotxe_combustio = new CotxeCombustio("123456", "Yuntai", 5, 200, 100);
        CotxeElectric cotxe_electric = new CotxeElectric("54321", "Tosla", 3, 150, 75);
        Patinet patinet = new Patinet("00000", "Shiaomi", 10);

        int dies_alquiler = 10;
        System.out.println("Metodes cotxe combustio:");
        System.out.println("Preu per " + dies_alquiler + " dies " + cotxe_combustio.calcularPreuLloguer(dies_alquiler));
        System.out.println("Velocidad maxima: " + cotxe_combustio.getVelocidadMaxima());
        cotxe_combustio.mostrarInfo();
        System.out.println();

        dies_alquiler = 5;
        System.out.println("Metodes cotxe electric:");
        System.out.println("Preu per " + dies_alquiler + " dies " + cotxe_electric.calcularPreuLloguer(dies_alquiler));
        System.out.println("Velocidad maxima: " + cotxe_electric.getVelocidadMaxima());
        cotxe_electric.mostrarInfo();
        System.out.println();

        dies_alquiler = 7;
        System.out.println("Metodes patinet:");
        System.out.println("Preu per " + dies_alquiler + " dies " + patinet.calcularPreuLloguer(dies_alquiler));
        patinet.setNivellBateria(0);
        System.out.println("Nivell de bateria: " + patinet.getNivellBateria());
        System.out.println("Carregam bateria");
        patinet.carregarBateria();
        System.out.println("Nivell de bateria: " + patinet.getNivellBateria());
        patinet.mostrarInfo();
    }
}