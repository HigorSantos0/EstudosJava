package Controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		// Media das notas de uma turma
		// Usuario preenche as notas enquanto não digita -1
		// quantidade de inserções de notas
		Scanner entrada = new Scanner(System.in);
		
		double nota = 0, media = 0, soma = 0;
		int i = 0;
		
		while(nota != -1)
		{
			System.out.print("Entre com a nota, caso queira sair, digite -1: ");
			nota = entrada.nextDouble();
			
			if(nota >= 0 && nota <= 10)
			{
				soma += nota;
				i++;
			}
		}
		
		media = soma / i;
		
		System.out.println("Media = " + media);
		System.out.println("Quantidade de insercoes = " + i);
		
		entrada.close();
	}
}
