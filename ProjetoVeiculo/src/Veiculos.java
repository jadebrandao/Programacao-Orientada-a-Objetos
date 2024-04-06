import javax.swing.*;

public class Veiculos {
    private String placa;
    private int ano;

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

    public Veiculos(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }
    public void exibirdados(){

    JOptionPane.showMessageDialog(null,"Dados do vaiculo: "+ this.placa + "Ano: "+ this.ano, "titulo",JOptionPane.INFORMATION_MESSAGE);


    }
}
