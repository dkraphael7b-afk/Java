import java.util.Scanner;
public class ex008_nota_aluno {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a nota do aluno: ");
        double nota1 = input.nextDouble();

        if (nota1 >= 7){
            System.out.println("Aluno aprovado!!");
        }

        else if (nota1 >= 5 && nota1 < 7){
            System.out.println("Aluno na média!!");
        }
        else {
            System.out.println("Aluno reprovado!!");
        }
    }
}
