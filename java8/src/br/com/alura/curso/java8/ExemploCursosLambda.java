package br.com.alura.curso.java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExemploCursosLambda {
	
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		//cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		//metodo reference
		//dessa forma n�o da certo pq ele ira apresentar
		//com o hash, e ele precisa do toString
		//precisamos ser um pouco mais claro e usar o lamda
		//cursos.forEach(System.out::println);
		
		//com lambda
		//cursos.forEach(c -> System.out.println(c.getNome()));
		
		//Ao inves de eu criar um for e criar um if para verificar os alunos com maior que 100
		//podemos usar agora o .stream(), com ele aplicamos o filter e neles passando a regra pra filtrar
//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.map(c -> c.getAlunos())
//			.forEach(total -> System.out.println(total));
		
		cursos.stream()
			.filter(c -> c.getAlunos() >= 100)
			.map(Curso::getAlunos)
			.forEach(System.out::println);
		
		int soma = cursos.stream()
				   .filter(c -> c.getAlunos() > 100)
				   .mapToInt(Curso::getAlunos)
				   .sum();
	}
}
