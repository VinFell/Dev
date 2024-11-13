//Desevolvido por Vinícius Fellipe Silva
import java.util.Scanner;

public class alomundo2{
    public static void main(String[] args) {
        String nome = "";
        Scanner Lerteclado = new Scanner(System.in);

        System.out.println("Programa de boas vindas!!!!!");
        System.out.print("Qual o seu nome? ");
        nome = Lerteclado.nextLine();
        System.out.print("Olá "+nome );
        Lerteclado.close();
    }
}