package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1,2,3,4,5,6);
		System.out.printf("Salario: %.2f\n", 21000.23548);
		System.out.printf("Nome: %s\n", "Higor");
		
		Scanner entrada = new Scanner(System.in); // dar entrada ou seja, escrever
		
		
		System.out.print("Entre com o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Entre com a sua idade: ");
		int idade = entrada.nextInt();
		entrada.nextLine();
		
		System.out.print("Entre com o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Entre com o seu salario: ");
		double salario = entrada.nextDouble();
		
		System.out.printf("\n\n %s %s tem %d anos e recebe %.2f\n", nome, sobrenome, idade, salario);
		
		entrada.close();
		
		
	}
	

}
