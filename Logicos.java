package fundamentos.operadores;

public class Logicos {

	public static void main(String[] args) {
		
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		System.out.print("\n");
		
		System.out.println("Tabela verdade 'E' (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		//System.out.println(false && true);
		//System.out.println(false && false);
		System.out.print("\n");
		
		System.out.println("Tabela verdade 'OU' (OR)");
		//System.out.println(true || true);
		//System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		System.out.print("\n");
		
		System.out.println("Tabela verdade 'Ou Exclusivo / (XOR)', '^' ");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		System.out.print("\n");
		
		System.out.println("Tabela verdade 'NOT' '!' ");
		System.out.println(!true);
		System.out.println(!false);
		System.out.print("\n");
	}
}
