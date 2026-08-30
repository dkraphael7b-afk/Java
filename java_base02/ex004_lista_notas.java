import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex004_lista_notas {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        List<Integer>notas = new ArrayList<>();
        boolean i = true;
        while (i == true){
            System.out.println("Digite uma nota: ");
            int nota = input.nextInt();

            if (nota <= -1){
                System.out.println("Sequencia dos valores: ");
                int maior_nota = notas.get(0);
                int menor_nota = notas.get(0);
                int total = 0;

                for(int n: notas){
                    total += n;
                    if (n >= maior_nota){
                        maior_nota = n;
                    }
                    if (n <= menor_nota){
                        menor_nota = n;
                    }
                }

                int quantidade = notas.size();
                int media = total/quantidade;
                System.out.println("A quantidade total de notas: "+quantidade);
                System.out.println("A maior nota: "+maior_nota);
                System.out.println("A menor nota: "+menor_nota);
                System.out.println("A média: "+media);
                break;
                    }
            else{
                notas.add(nota);
            }
        }
    }
}
