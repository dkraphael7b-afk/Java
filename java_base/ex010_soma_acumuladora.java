import java.util.Scanner;
public class ex010_soma_acumuladora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int acomulador = 0;
        boolean i = true;
        while (i == true){
            System.out.println("Digite o numero: ");
            int num = input.nextInt();
            acomulador = acomulador + num;
            System.out.println("Deseja sair(s/n)");
            String continuar = input.next();
            if (continuar.equals("s") || continuar.equals("S")){
                break;
            }
        }
        System.out.println("A soma total é "+acomulador);
    }
}
