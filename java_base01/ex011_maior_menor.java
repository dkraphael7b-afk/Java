import java.util.Scanner;
public class ex011_maior_menor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int i = 0;

        i += 1;
        System.out.println("Digite o "+i+"º número: ");
        int num = input.nextInt();
        int maior_num = num;
        int menor_num = num;
        while (i <= 6){
            i += 1;
            System.out.println("Digite o " + i + "º número: ");
            num = input.nextInt();
            if (num > maior_num) {
                maior_num = num;
            }
            if (num < menor_num) {
                menor_num = num;
            }
        }

        System.out.println("O maior número: "+maior_num);
        System.out.println("O menor número: "+menor_num);
    }
}
