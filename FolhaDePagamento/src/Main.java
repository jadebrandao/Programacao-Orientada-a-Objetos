import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        double SalarioFixo,vendas;
        int percentual,producao,valor;

        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Folha de Pagamento \nSelecione o tipo desejado:\n1- Salario Padrão\n2- Produtividade\n3- Comissao"));

        switch(opcao){
            case 1:
                SalarioFixo = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Salrio"));


                FPadrao a = new FPadrao(SalarioFixo);

                JOptionPane.showInputDialog(null,"Salario do Funcionario"+a.getSalarioFixo()+JOptionPane.INFORMATION_MESSAGE);

                break;

            case 2:


                producao = Integer.parseInt((JOptionPane.showInputDialog("Informe a quantidade produzida")));

                valor = Integer.parseInt((JOptionPane.showInputDialog("Informe o valor por produdução")));



                FProdutividade b = new FProdutividade(producao,valor);
                b.CalcularProventos() ;

                JOptionPane.showInputDialog(null,"Valor por Produção "+ b.getProducao()+"\nProdução: "+ b.getValor()+ "\nValor total a receber: " +b.CalcularProventos(),JOptionPane.INFORMATION_MESSAGE);

                break;
            case 3:
                percentual = Integer.parseInt((JOptionPane.showInputDialog("Informe o percentual de comissão")));
                vendas = Integer.parseInt((JOptionPane.showInputDialog("Informe o valor de Venda")));
                FComissao c = new FComissao(percentual,vendas);
                c.CalcularProventos();

                JOptionPane.showInputDialog(null,"Valor total de vendas "+ c.getVendas()+"\nPercentual de Comissão"+ c.getPercentual()+ "\nValor total a receber: " + c.CalcularProventos(),JOptionPane.INFORMATION_MESSAGE);

                break;
            default:
        }
    }}