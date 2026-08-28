import java.util.Scanner;
public class ex012_cadastro {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("1 - Cadastro \n2 - Sair\nR: ");
        int cadastro = input.nextInt();
        if (cadastro == 1) {
            boolean i = true;
            while (i == true) {
                System.out.println("Digite seu nome: ");
                String nome = input.next();
                System.out.println("Digite sua idade: ");
                int idade = input.nextInt();
                System.out.println("Digite sua cidade: ");
                String cidade = input.next();

                System.out.println("Cadastro: \nNome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade);
                System.out.println("Deseja continuar (s/n)");
                String continuar = input.next();
                if(continuar.equals("n") || continuar.equals("N")){
                    break;
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}
