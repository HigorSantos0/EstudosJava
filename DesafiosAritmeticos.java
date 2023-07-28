package fundamentos.operadores;

public class DesafiosAritmeticos {

	public static void main(String[] args) {
		
		/*
		 * Exemplo

		/*
		int a = (3 * 4) - 10;
		int b = (int) Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		*/
		
		int soma1 = (6 * (3 + 2));
		int denominador1 = 3 * 2;
		
		int resultado1 = (int)Math.pow(soma1, 2);
		
		int total1 = resultado1 / denominador1;
		
		// Segunda parte
		
		int soma2 = (1 - 5) * (2 - 7);
		int denominador2 = 2;
		int operando = soma2 / denominador2;
		
		int resulSoma2 = (int)Math.pow(operando, 2);
		
		int resultadoFinal = total1 - resulSoma2;
		int denominadorFinal = 10;
		
		resultadoFinal = (int)Math.pow(resultadoFinal, 3);
		
		denominadorFinal = (int)Math.pow(denominadorFinal, 3);
		
		int fim = resultadoFinal / denominadorFinal;
		
		System.out.println(fim);
		
	}
}
