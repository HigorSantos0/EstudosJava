package Controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		String texto = ""; 
		
		do{
			
			System.out.println("Voce precisa falar as palavras magicas: ");
			System.out.print("Quer sair? ");
			texto = entrada.nextLine();
			
		}while(!texto.equalsIgnoreCase("Por favor"));
		
		
		System.out.println("Fim");
		entrada.close();
    }
}
