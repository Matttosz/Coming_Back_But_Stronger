package aula06;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
	
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Comunicação não violenta");
		pilha.add("Sertões");
		pilha.add("Coraline");
		pilha.add("Capitães de Areia");
		pilha.add("Assim Falava Zaratustra");
		pilha.add("O Pequeno Principe");
		pilha.add("One Piece");
		
		System.out.println("DIgite um título: ");
		pilha.add(read.nextLine());
		
		System.out.println(pilha);
		
		pilha.pop();
		
		System.out.println(pilha);
		
		pilha.push("Overlord");
		
		System.out.println(pilha);
		System.out.println(pilha.peek());
		System.out.println("Existe o livro : " + pilha.contains("Capitães de Areia"));
	}

}
