package Controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String palavra = "";
		
		while(!palavra.equalsIgnoreCase("sair"))
		{
			System.out.println("Entre com a palavra. Caso queira sair, digite sair: ");
			palavra = entrada.nextLine();
		}
		System.out.println("Fim");
		
		
		entrada.close();
	}
}
