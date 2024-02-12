package colecoes;

import java.util.HashSet;

public class Hash {
	
	public static void main(String[] args) {
		
		HashSet<Usuario> usuario = new HashSet<Usuario>();
		
		usuario.add(new Usuario("Higor"));
		usuario.add(new Usuario("Pamela"));
		usuario.add(new Usuario("Paloma"));
		
		System.out.println(usuario.contains(new Usuario("Pamela")));
	}

}
