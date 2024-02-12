package colecoes;

import java.util.LinkedHashSet;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>();
		//SortedSet<String> lista = new TreeSet<>(); // Garante a ordem alfabética
		Set<String> lista = new LinkedHashSet<>();
		lista.add("Higor");
		lista.add("Pâmela");
		lista.add("Deise");
		lista.add("Valter");
		lista.add("Davi Lucca");
		lista.add("Paloma");
		
		for(String candidato : lista) {
			System.out.println(candidato);
		}
		System.out.println();
		
		Set<Integer> lista2 = new HashSet<>();
		lista2.add(1);
		lista2.add(10);
		lista2.add(5);
		lista2.add(15);
		lista2.add(200);
		lista2.add(2);
		
		//nums.get(1); Não é possível acessar pelo índice
		
		for(Integer n : lista2) {
			System.out.println(n);
		}
	}
}
