package EstudoUdemy;

import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Higor Nascimento";
		u1.email = "higordevjs@";
		
		Usuario u2 = new Usuario();
		u2.nome = "Higor Nascimento";
		u2.email = "higordevjs@";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Date()));
	}

}
