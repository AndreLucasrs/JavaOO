package br.com.alura.curso.java8;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteLambda {
	
	public static void main(String[] args) {
		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do c�digo");
		palavras.add("caelum");
		
		palavras.sort(Comparator.comparing(String::length));
		palavras.forEach(System.out::println); 
	}

}
