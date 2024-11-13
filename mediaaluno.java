//Desenvolvido por
import java.util.Scanner;

public class mediaaluno {
    public static void main(String[] args){
        String nome = "";
        float n1 = 0;
        float n2 = 0;
        float n3 = 0;
        float n4 = 0;
        double total = 0;
        double media = 0;
        Scanner LerTeclado = new Scanner(System.in);
        System.out.println("Calcula a média de matemática");
        System.out.println("");
        System.out.print("Qual é o seu nome?:");
        nome = LerTeclado.nextLine();

        System.out.print("Informe a primeira nota: ");
        n1 = LerTeclado.nextFloat();

        System.out.print("Informe a segunda nota: ");
        n2 = LerTeclado.nextFloat();

        System.out.print("Informe a terceira nota: ");
        n3 = LerTeclado.nextFloat();
        
        System.out.print("Informe a quarta nota: ");
        n4 = LerTeclado.nextFloat();

        total = n1+n2+n3+n4;
        media = total/4;
        System.out.println(nome+" sua nota foi: "+media);
        String resultado = "";
        if(media>=7){
            resultado = "aprovado";
        }else{
            resultado = "reprovado";
        }
        System.out.println("O aluno "+nome+" está "+resultado);
        LerTeclado.close();
    }
}
