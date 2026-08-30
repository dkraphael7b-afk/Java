import java.util.Scanner;

public class ex002_contador_de_vogais {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = input.next();

        int contador_de_vogais = 0;
        for(char letra: palavra.toLowerCase().toCharArray()){
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                contador_de_vogais += 1;
            }
        }

        System.out.println("O total de vogais: "+contador_de_vogais);
    }
}