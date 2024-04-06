public class FProdutividade   {

    private  double valor;
    private double producao;



    public FProdutividade(double valor, double producao) {
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getProducao() {
        return producao;
    }

    public void setProducao(double producao) {
        this.producao = producao;
    }

    public double CalcularProventos() {
        double proventos;

        proventos = valor * producao ;

        return proventos;
    }

}
