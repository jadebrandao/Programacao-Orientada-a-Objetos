public class ContaPoupanca extends  Conta{
    private double Saldo;

    public void   depositar (double valor){
        this.Saldo += valor;
    }
    public double getSaldo(){
        return this.Saldo;

    }

    public  void sacar (double valor){
        this.saldo -= valor;
    }
}
