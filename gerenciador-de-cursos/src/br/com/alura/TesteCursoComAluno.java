package br.com.alura;

public class TesteCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
		
		System.out.println("O aluno "+a1+" esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(a1));
		
		Aluno andre = new Aluno("André", 34672);
		System.out.println("E esse André, esta matriculado?");
		System.out.println(javaColecoes.estaMatriculado(andre));
		
		System.out.println("O a1 é equals ao andre");
		System.out.println(a1.equals(andre));
		
		//isso abaixo sera true por causa do hashcode ser igual
		System.out.println(a1.hashCode() == andre.hashCode());
		 
	}
}
