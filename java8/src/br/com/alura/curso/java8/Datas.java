package br.com.alura.curso.java8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate copa = LocalDate.of(2018, Month.JUNE, 20);

		Period periodo = Period.between(hoje, copa);
		
		System.out.println(periodo.getDays());
		
		copa = copa.plusYears(4);
		
		System.out.println(copa);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		String resultado = copa.format(formatador);
		
		System.out.println(resultado);
		
		LocalDateTime agora = LocalDateTime.now();
		
		DateTimeFormatter formatador2 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		
		System.out.println(agora.format(formatador2));
	}

}
