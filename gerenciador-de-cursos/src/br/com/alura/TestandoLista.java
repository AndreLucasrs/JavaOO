package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoLista {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		//remove pelo index ou pelo objeto
		aulas.remove(0);
		
		//Java 7
		for (String aula : aulas) {
			System.out.println(aula);
		}
		
		//Java 8
		aulas.forEach(aula -> System.out.println(aula));
		
		//usando get(), pegando por indice
		String primeiraAula = aulas.get(0);
		System.out.println(primeiraAula);
		
		//tamanho do objeto
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println(aulas.get(i));
		}
		
		//Ordena java7
		Collections.sort(aulas);
		
		//Ordena java8
		aulas.sort((a1,a2) -> a1.compareToIgnoreCase(a2));
	}
}
