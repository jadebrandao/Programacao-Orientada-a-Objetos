import javax.swing.*;

public class Caminhao {
    private String placa;
    private int ano;
    private int eixos;

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

    public int getEixos() {

        return eixos;
    }

    public void setEixos(int eixos) {

        this.eixos = eixos;
    }

    public Caminhao(String placa, int ano, int eixos) {
        this.placa = placa;
        this.ano = ano;
        this.eixos = eixos;
    }

    public void exibirdados() {
        JOptionPane.showMessageDialog(null, "Dados do vaiculo: " + this.placa + "Ano: " + this.ano, this.eixos +"Eixos:",JOptionPane.INFORMATION_MESSAGE);
    }
}
