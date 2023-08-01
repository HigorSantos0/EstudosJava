package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String dia;
		
		System.out.print("Entre com um valor: ");
		dia = entrada.next();
		
		if(dia.equalsIgnoreCase("Domingo")){
			System.out.printf("Retorno = %d", 1);
		}else if(dia.equalsIgnoreCase("Segunda")){
			System.out.printf("Retorno = %d", 2);
		}else if(dia.equalsIgnoreCase("Terca")) {
			System.out.printf("Retorno = %d", 3);
		}else if(dia.equalsIgnoreCase("Quarta")) {
			System.out.printf("Retorno = %d", 4);
		}else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.printf("Retorno = %d", 5);
		}else if(dia.equalsIgnoreCase("Sexta")) {
			System.out.printf("Retorno = %d", 6);
		}else if(dia.equalsIgnoreCase("Sabado")) {
			System.out.printf("Retorno = %d", 7);
		}

		entrada.close();
	}

}
