package fundamentos;

public class PrimitivosVsObjeto {
	public static void main(String[] args) {
		
		String s = "Higor"; // Ou String s = new String("Texto"); jeito pouco usado
		s.toUpperCase();
		
		// Wappers são a versão objeto dos tipos primitivos!
		int a = 123; 
		System.out.println(a);
	}

}
