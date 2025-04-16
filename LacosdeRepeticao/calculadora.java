package aula03;
import  java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		System.out.println("-------           Escolha o operador              -------");
		System.out.println("---                                                   ---");
		System.out.println("---                 1) Adição                         ---");
		System.out.println("---                 2) Subtração                      ---");
		System.out.println("---                 3) Multiplicação                  ---");
		System.out.println("---                 4) Divisão                        ---");
		System.out.println("---                                                   ---");
		System.out.println("---           Exemplo de Inserção:' 3 '               ---");
		System.out.println("---------------------------------------------------------");
		System.out.print  ("---Operador: ");
		int OperacaoNumerica = read.nextInt();
		
		System.out.println("---  Insira o primeiro valor a ser calculado a baixo  ---");
		System.out.println("---Exemplo: 1, 1.0, 10, 10.00                         ---");
		System.out.print  ("---Valor: ");
		float PrimeiroValor = read.nextFloat();
		
		System.out.println("---  Insira o segundo valor a ser calculado a baixo   ---");
		System.out.println("---Exemplo: 1, 1.0, 10, 10.00                         ---");
		System.out.print  ("---Valor: ");
		float SegundoValor  = read.nextFloat();
		
		switch (OperacaoNumerica) {
		
		case 1:			
			float ResultadoAdicao = (PrimeiroValor + SegundoValor);
			
			if  (ResultadoAdicao <= 4)
				System.out.println("----                Operação Inválida                 ---");	
			else 
				System.out.println(PrimeiroValor + " + " + SegundoValor + " = " + ResultadoAdicao);			
		break;	
			
		case 2:			
			float ResultadoSubtracao = (PrimeiroValor + SegundoValor);	
			
			if  (ResultadoSubtracao <= 4)
				System.out.println("----                Operação Inválida                 ---");
			else 
				System.out.println(PrimeiroValor + " + " + SegundoValor + " = " + ResultadoSubtracao);
		break;
		
		case 3:
			float ResultadoMultiplicacao = (PrimeiroValor + SegundoValor);
			
			if  (ResultadoMultiplicacao <= 4)
				System.out.println("----                Operação Inválida                 ---");
			else 
				System.out.println(PrimeiroValor + " + " + SegundoValor + " = " + ResultadoMultiplicacao);		
		break;
		
		case 4:
			
			float ResultadoDivisao = (PrimeiroValor + SegundoValor);
			
			if  (ResultadoDivisao <= 4)
				System.out.println("----                Operação Inválida                 ---");			
			else 
				System.out.println(PrimeiroValor + " + " + SegundoValor + " = " + ResultadoDivisao);
		break;	
		}
	}
}

