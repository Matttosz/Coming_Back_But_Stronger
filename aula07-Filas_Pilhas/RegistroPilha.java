package aula06;
import java.util.Scanner;
import java.util.Stack;
public class RegistroPilha {

	public static void main(String[] args) 
	{
		Scanner read = new Scanner(System.in);
	    Stack<String> ClientesNaFila = new Stack<String>();
	    
	    int EscolhaUsuario ;
	    	   				
		 do {
			  ExibirMenu();
			  System.out.print("Digite sua opção: ");
			  EscolhaUsuario = read.nextInt();
			  read.nextLine();
			            
			  processarEscolha(EscolhaUsuario, ClientesNaFila, read);
			            
			 } while (EscolhaUsuario != 0);
	}
	
	private static void processarEscolha(int Escolha, Stack<String> ClientesNaFila, Scanner read) 
	{ 
		switch(Escolha) 
		{
			case 1:
				System.out.println("=================================================");
				System.out.println(" Insira a baixo o nome do cliente a ser inserido: ");
				System.out.println("=================================================");
				System.out.println(" Nome Completo: \n");			
				String ClienteInserido = read.nextLine();
				ClientesNaFila.add(ClienteInserido.toLowerCase());						
			break;
					
			case 2:
				if (ClientesNaFila.isEmpty())
				{
					System.out.println("=====================================");
					System.out.println("          A fila está vázia!         ");
					System.out.println("=====================================");
				}					
				else 
				{
					System.out.println("===================================================");
					System.out.println(" Aqui estão todos os clientes esperando atendimento:");
					System.out.println("===================================================");
					System.out.println(ClientesNaFila);
					System.out.println("===================================================");
				}
			break;
					
			case 3:		
				if (ClientesNaFila.isEmpty())
				{
					System.out.println("=====================================");
					System.out.println("          A fila está vázia!         ");
					System.out.println("=====================================");
				} else {					
				ClientesNaFila.pop();
				System.out.println("=====================================");
				System.out.println("    Cliente Removido com sucesso     ");
				System.out.println("=====================================");
				}
					
			 break;
					
			 case 0:
				System.out.println("=================================================");
				System.out.println("Encerrando Programa");
				System.out.println("Obrigado Por Usar o Software");
				System.out.println("=================================================");
				System.exit(0);
			 break;
					
			 default:
						System.out.println("Inserção Inválida");
			break;	
		}	
				
	}
	private static void ExibirMenu()
		{
        System.out.println("=====================================");
        System.out.println("          MENU DE ATENDIMENTO       ");
        System.out.println("=====================================");
        System.out.println("1 - Adicionar cliente à fila");
        System.out.println("2 - Listar todos os clientes");
        System.out.println("3 - Retirar cliente da fila");
        System.out.println("0 - Encerrar");
        System.out.println("=====================================");
    	}
	}
				