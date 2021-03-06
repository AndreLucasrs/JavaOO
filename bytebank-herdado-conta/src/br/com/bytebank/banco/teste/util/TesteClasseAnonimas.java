package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteClasseAnonimas {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta + " ,Titular : " + conta.getTitular().getNome());
		}

		// java 1.7
		// Collections.sort(lista, new TitularContaComparatorOrdenar());
		// Collections.reverse(lista);
		
		// Vai ordenar apartir daqui
		// java 1.8
		//Function Object - mas pra isso criamos uma classe apenas para fazer a compara��o
		//podemos fazer dessa forma abaixo
//		lista.sort(new TitularContaComparatorOrdenar());
		
		//existe essa forma tbm, que iremos criar uma classe anonima
		//quando se usa classe anonima, vc n�o ira criar uma nova classe apenas para ter um metodo para comparar
		//dessa forma � melhor usar uma classe anonima
		lista.sort(new Comparator<Conta>() { //compara por String

			//compara String - assemelha a classe TitularContaComparatorOrndenar
			@Override
			public int compare(Conta c1, Conta c2) {

				String nomeC1 = c1.getTitular().getNome();
				String nomeC2 = c2.getTitular().getNome();

				return nomeC1.compareToIgnoreCase(nomeC2);
			}
		});
		
		//outra forma de criar uma classe anonima, mas da forma acima fica mais enxuta 
		Comparator<Conta> comp = new Comparator<Conta>(){
			
			//compara Numero - assemelha a classe NumeroContaComparatorOrndenar
			@Override
			public int compare(Conta c1, Conta c2) {
				
				return Integer.compare(c1.getNumero(),c2.getNumero());
				
			}
		};
		
//		//compara por numero
//		lista.sort(comp);
		
		System.out.println("--------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta + " ,Titular : " + conta.getTitular().getNome());
		}
	}

}
