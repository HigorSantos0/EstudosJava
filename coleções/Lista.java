package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Higor");
		lista.add(u1);
		
		lista.add(new Usuario("Pâmela"));
		lista.add(new Usuario("Davi Lucca"));
		lista.add(new Usuario("Maria Julia"));
		lista.add(new Usuario("Paloma"));
		lista.add(new Usuario("Renan"));
		
		System.out.println(lista.get(2).nome); // Acessando pelo índice
		System.out.println(lista.get(3).nome);
		
		//lista.remove(0);
		System.out.println("Objeto removido ->>> " + lista.remove(0));
		//lista.remove(new Usuario("Renan"));
		System.out.println(lista.remove(new Usuario("Renan")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Maria Julia")));
		
		for(Usuario u : lista) {
			System.out.println(u.nome);
		}
		
		System.out.println(lista.toString());
	}

}
