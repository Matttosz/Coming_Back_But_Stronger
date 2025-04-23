import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
       
        ArrayList<String> cores = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        System.out.println("Digite 5 cores:");

        for (int PerguntasCores = 0; PerguntasCores < 5; PerguntasCores++)
        {
            System.out.print("Cor " + (PerguntasCores + 1) + ": ");
            String CoresInseridas = read.nextLine();
            cores.add(CoresInseridas); 
        }

        System.out.println("\nCores adicionadas:");
        for (String CoresAdicionadas : cores) 
        {
            System.out.println(CoresAdicionadas);
        }
        
        Collections.sort(cores);
        System.out.println("\nCores ordenadas em ordem crescente:");
        for (String CoresOrganizadas : cores) 
        {
            System.out.println(CoresOrganizadas);
        }

        
        read.close();
    }
}