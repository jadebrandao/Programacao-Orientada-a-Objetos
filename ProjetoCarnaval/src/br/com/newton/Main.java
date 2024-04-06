package br.com.newton;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        double Ingresso = 0;
        double ingressoCamarote = 0;
        double ingressoVip = 0;

        Pista a = new Pista (Ingresso);
        Camarote b = new Camarote(ingressoCamarote);
        VIP c = new VIP(ingressoVip);

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de ingresso: \n1- Ingresso Pista \n2- Ingresso VIP  \n3- Ingresso Camarote. "));

        if (opcao == 1) {
            JOptionPane.showInputDialog("Ingresso Pista, o valor do ingresso é de " + a.TaxaDeAcrescimoPista);

        } else if (opcao == 2) {
            JOptionPane.showInputDialog("Ingresso Vip, o valor do Vip é de " + c.taxaDeAcrescimoVIP);
        } else if (opcao == 3) {
            JOptionPane.showInputDialog("Ingresso Camarote, o valor do Camarote é de " + b.TaxaDeAcrescimoCamarote);
        } else {
            JOptionPane.showInputDialog("Opção invalida");
        }
    }
}