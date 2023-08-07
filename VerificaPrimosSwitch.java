package Controle;

import java.util.Scanner;

public class VerificaPrimosSwitch {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o valor desejado: ");
		int valor = entrada.nextInt();
		
		int i, cont = 0;
		
		for(i = 2; i < valor; i++)
		{
			if(valor % i == 0)
			{
				cont++;
			}
		}
		
		switch(cont) {
		
		case 0: 
			System.out.println("valor e' primo!");
			break;
			
			default: 
				System.out.println("Valor nao primo!");
		}
		
		entrada.close();
	}
}
