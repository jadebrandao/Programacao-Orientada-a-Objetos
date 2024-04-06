package br.com.newton;
import javax.swing.*;


public class Pista extends Ingresso {


    public double ingressoPista;
    public double valor = 100;
    public int TaxaDeAcrescimoPista = 50;

    public Pista(double valor) {
        super(valor);

    }

    public void dopositar(double valor) {
        valor = valor + TaxaDeAcrescimoPista;
    }
}

