package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics <>
		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(11, 11);
		lista.add(cc3);
		
		System.out.println(lista.size());
		lista.remove(2);
		System.out.println(lista.size());
		
		for(Conta ref : lista) {
			System.out.println(ref);
		}
		
	}

}
