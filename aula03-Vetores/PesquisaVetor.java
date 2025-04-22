import java.util.Scanner;

public class PesquisaVetor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int[] ListagemNumerica = {1,2,3,4,5,6,7,8,9}; 
        System.out.print("Digite um número para buscar: ");
        int numeroBuscado = read.nextInt();
        boolean encontrado = false;

        for (int posicao = 0; posicao < ListagemNumerica.length; posicao++) 
        {
            if (ListagemNumerica[posicao] == numeroBuscado) 
            {
                System.out.println("Número encontrado na posição: " + posicao);
                encontrado = true;
                break;
            }
        }

        if (encontrado == false) {
            System.out.println("Não foi encontrado!");
        }
        read.close();}
}