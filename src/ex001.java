import java.util.Scanner;
public class ex001 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero aleatório: ");
        int num = input.nextInt();

        if (num % 2 == 0){
            System.out.print("O número "+num+" é par!!!");
        }
        else {
            System.out.print("O número "+num+" é impar!!!");
        }

    }
}
