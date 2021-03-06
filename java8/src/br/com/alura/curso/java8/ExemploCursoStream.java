package br.com.alura.curso.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExemploCursoStream {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		
		int sum = cursos.stream()
				.filter(c -> c.getAlunos() >= 100)
				.mapToInt(Curso::getAlunos)
				.sum();
		
		System.out.println(sum);
		//Optional � uma importante nova classe do Java 8.
		//� com ele que poderemos trabalhar de uma maneira mais organizada com poss�veis valores null.
		//Em vez de ficar comparando if(algumaCoisa == null), o Optional j� fornece uma s�rie de m�todos para nos ajudar nessas situa��es.
//		Optional<Curso> optionalCurso = cursos.stream().filter(c -> c.getAlunos() >= 100)
//			.findAny();
		
		//O orElse diz que ele deve devolver o curso que existe dentro desse optional, ou ent�o o que foi passado como argumento
		//Curso curso = optionalCurso.orElse(null);
		//Mesmo assim, ainda n�o est� t�o interessante
		// H� como evitar tanto o null, quanto as exceptions, quanto os ifs
		//O m�todo ifPresent executa um lambda (um Consumer) no caso de existir um curso dentro daquele optional
		//optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
		//Dado um Optional, podemos pegar seu conte�do invocando o get. Ele vai devolver o Curso que queremos. Mas e se n�o houver nenhum? Uma exception ser� lan�ada.
		//Curso curso2 = optionalCurso.get();
		//System.out.println(curso.getNome());
		
		//no dia a dia sera algo mas assim
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 100)
//		   .findAny()
//		   .ifPresent(c -> System.out.println(c.getNome()));
		
		//quando usa esta usando stream ele retorna um tipo de Optional stream
		//ent�o vc n�o esta alterando o collection do curso
		//por que o stream esta funcionando como um fluxo dele
		//entao como fa�o se quiser alterar minha collection e receber ela do tipo que quero
		cursos = cursos.stream()
					.filter(c -> c.getAlunos() > 100)
					.collect(Collectors.toList());
		
		cursos.stream().forEach(c -> System.out.println(c.getNome()));
		
		//exemplo de retorno de map usando isso
		//chave nome, valor numero
		Map<String, Integer> map = cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
		
		System.out.println(map);
		
		
		//uma outra forma para apresentar os map
		
		cursos.stream()
				.filter(c -> c.getAlunos() > 100)
				.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
				.forEach((nome,alunos) -> System.out.println(nome + " tem "+alunos+" alunos"));
		
		//calcular media
		cursos.stream()
	    	.mapToInt(c -> c.getAlunos())
	    	.average();

	}

}
