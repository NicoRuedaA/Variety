package es.cide.programacio;

public class CotxeElectric extends Cotxe implements Recarregable {
    int bateria_maxima;
    int bateria_actual;

    public CotxeElectric(String matri, String mod, int plac, int vel_max, int bateria) {
        super(matri, mod, plac, vel_max);
        this.bateria_actual = bateria;
        this.bateria_maxima = bateria;
    }

    @Override
    public void carregarBateria() {
        // TODO Auto-generated method stub
        bateria_actual = bateria_maxima;
    }

    @Override
    public int getNivellBateria() {
        // TODO Auto-generated method stub
        return bateria_actual;
    }

    @Override
    public double calcularPreuLloguer(int dies) {
        // TODO Auto-generated method stub
        return dies * 10;
    }

}
