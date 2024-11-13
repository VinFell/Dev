//Desenvolvido por Vinicius Fellipe Silva
import java.util.Scanner;
public class trocadevalores {
    public static void main(String[] args){
    String nome1;
    String nome2;
    String aux;
    Scanner LerTeclado = new Scanner(System.in);
    nome1 = " é o mestre do universo";
    nome2 = "";
    System.out.println("Troca de valores entre variaveis");
    System.out.println("Qual é o seu nome?: ");
    nome2 = LerTeclado.nextLine();
    aux = nome2;
    nome2 = nome1;
    nome1 = aux;
    System.out.print(nome1+nome2);
    LerTeclado.close();    
    }
}
