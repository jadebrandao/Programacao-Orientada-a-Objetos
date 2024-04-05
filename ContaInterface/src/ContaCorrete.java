public class ContaCorrete extends Conta {
    private double Saldo;
    private double TaxaOperacao=0.45;

    public  void depositar (double valor){
        this.Saldo +=valor-TaxaOperacao;
    }
    public double getSaldo(){
        return this.Saldo;

    }
    public void sacar (double valor){
        this.Saldo -= valor+ TaxaOperacao;
    }
}
