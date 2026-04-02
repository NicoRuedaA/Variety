package es.cide.programacio;

public class CotxeCombustio extends Cotxe {
    int capacitatDiposit;

    public CotxeCombustio(String a, String b, int c, int d, int cap) {
        super(a, b, c, d);
        this.capacitatDiposit = cap;
    }

    @Override
    public double calcularPreuLloguer(int dies) {
        return dies * 10;
    }

}
