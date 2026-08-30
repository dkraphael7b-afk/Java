import java.util.Scanner;
public class ex002_tabuada {
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = imput.nextInt();

        for ( int i = 1; i <= 10; i ++){
            int tabuada = i * num;
            System.out.println(num + " X "+ i + " = "+tabuada+ "\n");
        }
    }
}
