package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		System.out.println("Ola pessoal".charAt(2)); //Printa apenas a posição indicada
		
		String s = "Bom dia!";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Bom")); // Verifica se o inicio começa com "Bom".
		System.out.println(s.toLowerCase().startsWith("bom")); // Joga os valores para minusculos e depois verifica se "bom" esta minusculo
		System.out.println(s.endsWith("dia!")); // Verifica se o final termina com "Dia!".
		System.out.println(s.length()); // Conta a quantidade de caracteres
		System.out.println(s.equals("bom dia!")); // Compara se as string são iguais
		System.out.println(s.equalsIgnoreCase("bom dia!")); // Compara as string ignorando a diferença entre maiúscuculas e minúsculas
		
		var nome = "Higor";
		var sobrenome = "Nascimento";
		var idade = 21;
		var salario = 15000.358;
		
		/*
		
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " 
				+ sobrenome + "\nIdade: " 
				+ idade + "\nSalario: " 
				+ salario + "\n\n");
				*/
		
		String maisUmaFrase = "\nNome: " + nome 
				+ "\nSobrenome: " 
				+ sobrenome + "\nIdade: " 
				+ idade + "\nSalario: " 
				+ salario + "\n\n";
		
		System.out.println(maisUmaFrase);
		
		System.out.printf("O sonhor %s %s tem %d anos e ganha R$%.2f \n\n", nome, sobrenome, idade, salario);
		
		String frase = String.format("O sonhor %s %s tem %d anos e ganha R$%.2f\n", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); // verifica se contem o 'qual'
		System.out.println("Frase qualquer".indexOf("qual")); // verifica aonde começa o 'qual'
		System.out.println("Frase qualquer".substring(6)); // printa a partir da posição apresentada
		System.out.println("Frase qualquer".substring(6, 9)); // printa somente dada as posições
		
	}

}
