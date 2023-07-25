package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Ola Java!";
		
		s = s.replace("Java", "Higor");
		s = s.toUpperCase();
		//s = s.toLowerCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String y = "Ola Java"
				.replace("Java", "Higor")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		// Tipos primitivos não tem o operador "."
		
		//int a = 3;
		//a.
	}

}
