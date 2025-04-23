package aula03;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("------- Faça Seu Pedido ---------------------------------");
		System.out.println("---    Produto Disponível  ---    --- Valor Unitário  ---");
		System.out.println("--- 1) Cachorro Quente     ---    ---    R$10,00      ---");
		System.out.println("--- 2) X-Salada            ---    ---    R$15,00      ---");
		System.out.println("--- 3) X-Bacon             ---    ---    R$18,00      ---");
		System.out.println("--- 4) Bauru               ---    ---    R$12,00      ---");
		System.out.println("--- 5) Refrigerante        ---    ---    R$8,00       ---");
		System.out.println("--- 6) Suco de Laranja     ---    ---    R$13,00      ---");
		System.out.println("---------------------------------------------------------");
		int CodigoProduto = read.nextInt();
		
		switch(CodigoProduto) {
			
		case 1:
			System.out.println("----------------------------");
			System.out.println("---   Cachorro Quente    ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("---  Quantidade:");
			int Quantidade = read.nextInt();
			int ValorTotal = (Quantidade * 10);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotal + "  ---");
			break;
			
		case 2:	
			System.out.println("----------------------------");
			System.out.println("---     X-Salada         ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("--- Quantidade:");
			int QuantidadeXSalada = read.nextInt();
			int ValorTotalXSalada = (QuantidadeXSalada * 15);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotalXSalada + "  ---");
			break;
			
		case 3:
			System.out.println("----------------------------");
			System.out.println("---      X-Bacon         ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("--- Quantidade:");
			int QuantidadeXBacon = read.nextInt();
			int ValorTotalXBacon = (QuantidadeXBacon * 18);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotalXBacon + "  ---");
			break;
			
		case 4:
			System.out.println("----------------------------");
			System.out.println("---       Bauru          ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("--- Quantidade:");
			int QuantidadeBauru = read.nextInt();
			int ValorTotalBauru = (QuantidadeBauru * 12);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotalBauru + "  ---");
			break;
			
		case 5:
			System.out.println("----------------------------");
			System.out.println("---   Cachorro Quente    ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("--- Quantidade:");
			int QuantidadeRefri = read.nextInt();
			int ValorTotalRefri = (QuantidadeRefri * 8);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotalRefri + "  ---");
			break;
		
		case 6:
			System.out.println("----------------------------");
			System.out.println("---   Cachorro Quente    ---");
			System.out.println("--- Quantidade desejada? ---");
			System.out.println("--- Ex: 5");
			System.out.print  ("--- Quantidade:");
			int QuantidadeSuco = read.nextInt();
			int ValorTotalSuco = (QuantidadeSuco * 13);
			System.out.println("----------------------------");
			System.out.println("--- Valor Total da Compra --");
			System.out.println("--- R$" + ValorTotalSuco + "  ---");
			break;
		}

		
	}
}
