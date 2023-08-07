package Controle;

import java.util.Scanner;

public class VerificaPrimos {
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
		if(cont == 0)
		{
			System.out.printf("O numero %d e' primo!", valor);
		}
		else
			{
				System.out.printf("O numero %d nao e' primo!", valor);
			}
		
		entrada.close();
	}

}
