import java.util.Scanner;
public class ex003_maior_idade {
    public static boolean maior_idade(int idade){
        if (idade >= 18){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();
        System.out.print(maior_idade(idade));
    }
}
