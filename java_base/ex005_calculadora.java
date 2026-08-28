import java.util.Scanner;
public class ex005_calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite a operação:\n+ <- Adição\n- <- Subtração\n* <- Multiplicação\n/ <- Divisão\nR: ");
        String operador = input.next();

        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double total = 0;
        switch (operador){
            case "+" -> total = num1 + num2;
            case "-" -> total = num1 - num2;
            case "*" -> total = num1 * num2;
            case "/" -> total = num1 / num2;
        }

        System.out.println("Total = "+total);


    }
}
