package Controle;

import java.util.Scanner;

public class VerificaPares {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor entre 0 e 10: ");
		double valor = entrada.nextDouble();
		

		if(valor < 0 || valor > 10) 
		{
			System.out.print("Valor invalido");
		}
		else if(valor % 2 == 0) {
			
			System.out.printf("O valor %.2f e' (par)", valor);
		}
		else
		{
			System.out.print("O valor e' (impar)");
		}
		
		entrada.close();
	}

}
