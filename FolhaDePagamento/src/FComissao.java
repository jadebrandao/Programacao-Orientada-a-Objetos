public class FComissao {

    private int percentual;
    private double vendas;

    public FComissao(int percentual, double vendas) {
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public int getPercentual() {
        return percentual;
    }

    public void setPercentual(int percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas() {
        this.vendas = vendas;
    }

    public double CalcularProventos() {
        double proventos;
        proventos = percentual*vendas/100;

        return proventos;
    }

}
