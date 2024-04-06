import javax.swing.*;

public class Onibus {
    private String placa;
    private int ano;
    private int assentos;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {

        this.placa = placa;
    }

    public int getAno() {

        return ano;
    }

    public void setAno(int ano) {

        this.ano = ano;
    }

    public int getAssentos() {

        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }

    public Onibus(String placa, int ano, int assentos) {
        this.placa = placa;
        this.ano = ano;
        this.assentos = assentos;
    }

    public void exibirdados() {

        JOptionPane.showMessageDialog(null, "Dados do vaiculo: " + this.placa + "Ano: " + this.ano, + this.assentos +"Assento:",JOptionPane.INFORMATION_MESSAGE);
    }
}
