package br.com.newton;
import javax.swing.*;
public class VIP extends Ingresso {

    public static void main(String[] args) {

    }

    public double ingressoVIP;
    public double valor= 100;
    public int taxaDeAcrescimoVIP = 100;

    public VIP(double valor) {
        super(valor);

    }

    public void dopositar(double valor) {
        valor = valor + taxaDeAcrescimoVIP;

    }


}
