package br.com.newton;
import javax.swing.*;
public class Camarote extends Ingresso{

    public double ingressoCamarote;
    public double valor= 100;
    public int TaxaDeAcrescimoCamarote = 250;

    public Camarote(double valor) {
        super(valor);
    }
    public void dopositar(double valor) {
        valor = valor + TaxaDeAcrescimoCamarote;
}
}
