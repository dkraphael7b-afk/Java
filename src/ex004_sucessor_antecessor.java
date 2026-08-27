import java.util.Scanner;
public class ex004_sucessor_antecessor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = input.nextInt();

        System.out.println("O sucessor do número "+num+" é o numero: "+(num+1));
        System.out.println("O antecessor do número "+num+" é o número: "+(num-1));
    }
}
