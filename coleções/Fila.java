package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		//Offer e Add adicionam um elemento na fila
		//Diferença é o comportamento quando a fila está cheia
		
		fila.add("Higor"); // lança uma exceção
		fila.offer("Pamela"); // retorna falso
		fila.add("Davi");
		fila.offer("Maria");
		fila.add("Paloma");
		fila.offer("Disse");
		
		//Diferença de comportamento ocorre quando a fila está vazia
		System.out.println(fila.peek()); // retorna falso	
		System.out.println(fila.element()); // lança uma exceção
		
		System.out.println(fila.poll()); // retorna o elemento e em seguida remove / estando vazia retorna false
		System.out.println(fila.remove()); // retorna uma exceção caso lista esteja vazia
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains();
	}

}
