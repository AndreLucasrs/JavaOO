package br.com.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteAlunos {

	public static void main(String[] args) {
		//conjunto de objetos
		Set<String> alunos = new HashSet<>();
		//não adiciona objetos repetidos
		alunos.add("André");
		alunos.add("André");
		alunos.add("Lucas");
		alunos.add("Maryana");
		alunos.add("Marinho");
		
		alunos.forEach(aluno -> System.out.println(aluno));
		System.out.println(alunos.size());
		System.out.println(alunos);
		
		//por que usar o set ou conjuntos ? por causa da performace
		//o contains() e o remove(), são muito mais rapidos do que usando os do list
		//devido usando uma tabela de espalhamento, HashSet 
		boolean jorgemMatriculado = alunos.contains("Jorge");
		//.remove()
		System.out.println(jorgemMatriculado);
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		

	}

}
