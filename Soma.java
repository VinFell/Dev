//Desenvolvido por Vinicius Fellipe Silva
import java.util.Scanner;
public class Soma {
  public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
    int a;
    int b;
    int soma;
        System.out.print("Entre com o primeiro número: "); a = in.nextInt();
        System.out.print("Entre com o segundo número: "); b = in.nextInt();
        soma = a + b;
        System.out.printf("%d + %d = %d", a, b, soma);
      in.close();}}
  
