public abstract class Conta {
    private double saldo;

    public double getsaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public abstract void imprimeExtrato();
}
