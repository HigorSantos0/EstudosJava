package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
	
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "Higor");
		usuarios.put(2, "Davi");
		usuarios.put(3, "Julia");
		usuarios.put(4, "Pamela");
		
		System.out.println(usuarios);
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Davi"));
		System.out.println(usuarios.get(4));
		
		for(int chave : usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor : usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());
		}
	

	}
	
}
