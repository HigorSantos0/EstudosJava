package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		// Poderia ser feito
		
		/*
		 * boolean comprarTV50 = trabalho1 && trabalho2;
		 * 
		 * depois printar 
		 * 
		 * System.out.printLn("Comprou a tv de 50? " + comprarTV50);
		 */
		
		System.out.println((trabalho1 && trabalho2) + " Compraremos a tv de 50P e tomaremos sorvete");
		
		System.out.println((trabalho1 ^ trabalho2) + " Compraremos a tv de 32P e tomaremos sorvete");
		
		System.out.println((trabalho1 || trabalho2) + " Compraremos o sorvete ");
		
		System.out.println((!trabalho1) + " O trabalho nao deu certo"); 
		
		
	}
}
