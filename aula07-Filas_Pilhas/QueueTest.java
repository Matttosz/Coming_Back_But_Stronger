package aula06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Kendrick");
		fila.add("Marvin Gaye");
		fila.add("mr.morale");
		fila.add("LaurynHill");
		fila.add("daniel Cesar");
		fila.add("Djonga");
		System.out.println(fila);
		
		fila.remove();
		System.out.println(fila);
		
		fila.add("Kodak Black");
		System.out.println(fila);
		
		System.out.println(fila.peek());
		System.out.println(fila.poll());
		
		System.out.println(fila);
		
		System.out.println(" Djonga está na fila ?" + fila.contains("djonga"));
		
		System.out.println("Tamanho da fila: " + fila.size());
		
		int Contador = 0;
		
		for (var pessoa : fila) 
		{
			Contador ++;
			if (pessoa.equalsIgnoreCase("mr.morale")) 
			{		
				System.out.printf("mr.morale está na posição, %d ", Contador);
			}
		}
	}

}
