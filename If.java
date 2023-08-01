package Controle;

import java.util.Scanner;

public class If {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a media: ");
		double media = entrada.nextDouble();
		
		if(media >= 7)
		{
			System.out.print("Aprovado!");
		}
		else
			{
				System.out.println("O valor nao esta na media.");
			}
		
		
		
		entrada.close();
	}
}
