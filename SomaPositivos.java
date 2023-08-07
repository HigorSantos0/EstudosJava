package Controle;

import java.util.Scanner;

public class SomaPositivos {

	public static void main(String[] args) {
		
//		Criar um programa que enquanto estiver recebendo 
//		números positivos, imprime no console a 
//		soma dos números inseridos, caso receba um número 
//		negativo, encerre o programa. Tente utilizar a estrutura do while.
		
		Scanner entrada = new Scanner(System.in);
		int soma = 0, valor;
		
		do
		{
			System.out.println("Digite o numero a ser somado: ");
			valor = entrada.nextInt();
			
			if(valor >= 0)
			{
				soma += valor;
				
				System.out.printf("Soma = %d\n", soma);
			}
			else
				{
					System.out.println("Programado encerrado!");
				}
			
		}while(valor >= 0);
		
		
		entrada.close();
	}
}
