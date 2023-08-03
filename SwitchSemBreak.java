package Controle;

import java.util.Scanner;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual e' a sua faixa? ");
		faixa = entrada.nextLine();
		
		switch(faixa.toLowerCase()) {
		
		case "preta":
			System.out.println("Sei o Bassai-dai...");
			break;
		case "marrom":
			System.out.println("Sei o Tekki Shodan...");
			break;
		case "roxa":
			System.out.println("Sei o Heian Godan...");
			break;
		case "verde":
			System.out.println("Sei o Heian Yodan...");
			break;
		case "laranja":
			System.out.println("Sei o Heian Sandan...");
			break;
		case "vermelha":
			System.out.println("Sei o Heian Nidan...");
			break;
		case "amarela":
			System.out.println("Sei o Heian Shodan...");
			break;
			default:
				System.out.println("Nao sei de nada.");
				
				
				entrada.close();
		}
	}
}
