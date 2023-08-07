package Controle;

import java.util.Scanner;

public class NotasParciais {
	public static void main(String[] args) {
		
		/*
		 * 3. Criar um programa que receba duas notas parciais, calcular 
		 * a média final. Se a nota do aluno for maior ou igual a 7.0 
		 * imprime no console "Aprovado", se a nota for menor 
		 * que 7.0 e maior do que 4.0 imprime no console "Recuperação"
		 * , caso contrário imprime no console "Reprovado".
		 */
		
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		
		System.out.println("Entre com a primeira nota: ");
		nota1 = entrada.nextDouble();
		
		System.out.println("Entre com a segunda nota: ");
		nota2 = entrada.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 7)
		{
			System.out.print("Aprovado!");
		}
		else if(media >= 4 && media < 7) {
			
			System.out.print("Recuperacao!");
		}
		else
			{
				System.out.println("Reprovado!");
			}
		
		entrada.close();
	}

}
