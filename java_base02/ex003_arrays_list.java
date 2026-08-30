import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex003_arrays_list {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        List<String> nomes = new ArrayList<>(List.of("João","Maria","Dérick"));

        System.out.println("Digite o nome de uma pessoa: ");
        nomes.add(input.next());

        System.out.println(nomes);
    }
}
