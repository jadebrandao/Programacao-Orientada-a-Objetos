package br.com.redesocial;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String dataCriacao, nomeUsuario, dataNascimento,senha;
        String dataPublicacao, textoPublicacao,linkMidia;

        dataCriacao = JOptionPane.showInputDialog("Digite a data da Criacao da Rede Social");
        nomeUsuario = JOptionPane.showInputDialog("Digite o nome do usuario");
        dataNascimento = JOptionPane.showInputDialog("Digite a data de Nascimento");
        senha = JOptionPane.showInputDialog("Digite a senha");

        RedeSocial redeSocial = new RedeSocial(dataCriacao,nomeUsuario,dataNascimento,senha);
        Publicacao publi1;
        ArrayList<Publicacao> publi = new ArrayList<>();
        for(int i=0; i<3; i++){
            dataPublicacao = JOptionPane.showInputDialog("Digite a data da publicacao");
            textoPublicacao = JOptionPane.showInputDialog("Digite o texto");
            linkMidia = JOptionPane.showInputDialog("Digite o link");
            publi1 = new Publicacao(dataPublicacao,textoPublicacao,linkMidia);

            publi.add(publi1); //adiciona objeto no arraylist.
            redeSocial.inserePublicacao(publi1);
            redeSocial.imprimirPublicacoes();



        }

    }
}
