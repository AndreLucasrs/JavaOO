package br.com.alura.curso.java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStringLambda {

	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");

		// Projeto bytebank-herdado-conta
		// no package teste.util
		// classe TesteClasseAnonima, existe ja esses exemplos
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String s1, String s2) {
//				// verifica s1 > s2 se s2 > s1 e se s1 == s2, ele ja ordena com isso
//				return s1.length() - s2.length();
//			}
//		};
		// java 1.7
		// Collections.sort(palavras, comp);

		// java 1.8
		//palavras.sort((s1,s2) -> Integer.compare(s1.length(),s2.length()));
		//Agora ao inves de escreve classe anonimas
		//escrevemos interfaces funcionais = lambda
		//palavras.sort((s1,s2) -> s1.length() - s2.length());
		
		//Isso � um metodo reference
		//palavras.sort(Comparator.comparing(String::length));
		
		//lambda
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		//OBS SOBRE LAMBDA
		//Object o = s -> System.out.println(s); -- pq n�o funciona?
		//O c�digo n�o funciona porque Object n�o � uma interface funcional.
		//Lembre-se que para trabalhar com lambda, uma interface funcional precisa estar envolvida.
		//O erro de compila��o � bem intuitivo:
		//The target type of this expression must be a functional interface

		System.out.println(palavras);

		// 1.7
		// for (String p : palavras) {
		// System.out.println(p);
		// }

		// Projeto bytebank-herdado-conta
		// no package teste.util
		// classe TesteClasseLambda, existe ja esses exemplos

		// 1.8
		palavras.forEach(System.out::println); 

	}

}
