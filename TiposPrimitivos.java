package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		
		// Tipos Numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L; // literal do tipo 'Long'. O anderlaine é usando apenas para melhorar a leitura
		
		// Tipos numericos Reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_793_103.01;
		
		//Booleano
		boolean estaDeFerias = true; // ou false
		
		// Tipo Caractere
		
		char status = 'A';
		
		// Dias de empresa
		
		System.out.println(anosDeEmpresa*365);
		
		// Numero de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		//pontos por real
		
		System.out.println(pontosAcumulados / vendasAcumuladas);

		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias: " + estaDeFerias);
		System.out.println("Status: "+ status);
		
	}

}
