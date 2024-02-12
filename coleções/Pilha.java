package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("Biblia sagrada");
		livros.push("Jesus o nazareno");
		livros.push("Jesus");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
	
//		livros.size();
//		livros.clear();
//		livros.contains();
		
	}

}
