//Desenvolvido por Vinicius Fellipe Silva
import javax.swing.JOptionPane;

public class CaixasDialogo {
    
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Qual o seu nome?");
        String mensagem;
        mensagem = String.format("Olá %s, seja bem Vindo!",nome);

        JOptionPane.showMessageDialog(null, mensagem);
    }
}
