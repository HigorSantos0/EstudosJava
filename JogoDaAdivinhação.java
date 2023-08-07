package Controle;

import java.util.Scanner;

public class JogoDaAdivinhação {
	public static void main(String[] args) {
		

//		6. Jogo da adivinhação: Tentar adivinhar um número entre
//		0 - 100. Armazene um numero aleatório 
//		em uma variável. O Jogador tem 10 tentativas 
//		para adivinhar o número gerado. Ao final de cada tentativa,
//		imprima a quantidade de tentativas restantes, e imprima se o número 
//		inserido é maior ou menor do que o número armazenado.
		
		Scanner entrada = new Scanner(System.in);
		
		int valor = 15, tentativas = 10, i;
		
		
		i = 0;
		do
		{
			System.out.println("Digite o numero a ser adivinhado: ");
			int comparacao = entrada.nextInt();
			
			if(valor == comparacao)
			{
				System.out.println("Valor encontrado!");
			}
			else if(valor > comparacao){
					System.out.println("O valor que voce digitou e menor");
				}
				else
					{
						System.out.println("O valor que voce digitou e' maior");
					}
			
			i++;
			System.out.printf("\nnumero de tentativas %d \n", tentativas-i);
			
			
		}while(i <= tentativas);
		
		
		entrada.close();
	}

}
