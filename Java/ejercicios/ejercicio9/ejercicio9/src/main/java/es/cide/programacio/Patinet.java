package es.cide.programacio;

public class Patinet extends Vehicle implements Recarregable {
    int bateria_actual, bateria_maxima;

    public Patinet(String matricula, String marca, int bateria) {
        super(matricula, marca);
        this.bateria_actual = bateria;
        this.bateria_maxima = bateria;
    }

    @Override
    public void carregarBateria() {
        bateria_actual = bateria_maxima;
    }

    @Override
    public int getNivellBateria() {
        // TODO Auto-generated method stub
        return bateria_actual;
    }

    @Override
    public double calcularPreuLloguer(int dies) {
        return dies * 5;
    }

    public void setNivellBateria(int x) {
        if (x > bateria_maxima)
            x = bateria_maxima;
        this.bateria_actual = x;
    }
}
