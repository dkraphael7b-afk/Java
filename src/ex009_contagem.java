import java.util.Scanner;
public class ex009_contagem {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int num = input.nextInt();

        for ( int i = 0; i <= num; i++){
            System.out.println(i);
        }
        System.out.println("\n----------\nContagem regressiva\n----------");
        int regressivo = num;
        for (int i = 0; i <= num; i++){
            regressivo = regressivo - 1;
            System.out.println(regressivo+1);
        }
    }
}
