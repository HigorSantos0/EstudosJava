package oo.composicao;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Higor");
		Aluno aluno2 = new Aluno("Pedro");
		Aluno aluno3 = new Aluno("Joao");
		
		Curso curso1 = new Curso("Java");
		Curso curso2 = new Curso("Spring Boot");
		Curso curso3 = new Curso("MongoDB");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno : curso1.alunos) {
			System.out.println("...Matriculado no curso " + curso1.nome);
			System.out.println("...Meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno : curso2.alunos) {
			System.out.println("...Matriculado no curso " + curso2.nome);
			System.out.println("...Meu nome é " + aluno.nome);
			System.out.println();
		}
		for(Aluno aluno : curso3.alunos) {
			System.out.println("...Matriculado no curso " + curso3.nome);
			System.out.println("...Meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java");
		
		if(cursoEncontrado!=null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}

}
