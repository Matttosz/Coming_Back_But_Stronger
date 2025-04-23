import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaOrdenada {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        List<Integer> NumerosInseridos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) 
        {
        	NumerosInseridos.add(i * 10); 
        }        
        
        System.out.print("Digite um número inteiro para buscar: ");
        int NumeroBuscado = scanner.nextInt();

        
        int PosicaoLista = NumerosInseridos.indexOf(NumeroBuscado); 

        if (PosicaoLista != -1)
        {
            System.out.println("O número " + NumeroBuscado + " foi encontrado na posição: " + PosicaoLista);
        } else {
            System.out.println("O número " + NumeroBuscado + " não foi encontrado!");
        }
        
        scanner.close();
    }
}