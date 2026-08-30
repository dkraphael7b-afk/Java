import java.util.Scanner;

public class ex001_limpeza_de_strings {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.next();

        System.out.println("Nome: "+nome.toUpperCase());
        System.out.println("Minúsculo: "+nome.toLowerCase());
        System.out.println("Quantidade de caractér: "+nome.length());
        System.out.println("Possui a letra 'd': "+nome.contains("d"));
    }
}
