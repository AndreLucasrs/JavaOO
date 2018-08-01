package br.com.alura;

public class TestaBuscaAlunosnoCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as Coleções do Java", "Paulo Siveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma aula", 20));
		javaColecoes.adiciona(new Aula("Modelando coleções", 22));
		
		Aluno a1 = new Aluno("André", 34672);
		Aluno a2 = new Aluno("Lucas", 5617);
		Aluno a3 = new Aluno("Maryana", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem e o aluno da matricula 34672");
		System.out.println(javaColecoes.buscaMatriculado(34672));

	}

}
