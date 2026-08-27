import java.util.Scanner;
public class ex007_positivo_negativo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número");
        int num = input.nextInt();

        if (num > 0){

            System.out.println("O número "+num+" é positivo");
        }
        else if (num<0) {
            System.out.println("O número "+num+" é negativo");
        }
        else {
            System.out.println("O número é zero");
        }
    }
}
