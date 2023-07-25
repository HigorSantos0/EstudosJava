package fundamentos;

public class Wappers {
	public static void main(String[] args) {
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; //Integer.parseInt(entrada.next()); valor dado pelo usuário e tranformando em um inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue()); 
		System.out.println(s.toString()); // transformando o valor short para string
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 1234.345;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		
		System.out.println(bo.toString());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		
	}
}
