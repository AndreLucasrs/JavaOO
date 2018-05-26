package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		//acesso f�cil e perform�tico pelo �ndice
		//elementos precisam ser copiados quando n�o h� mais capacidade
		//ArrayList<Conta> lista = new ArrayList<>();
		// inser��o e remo��o perform�tica em qualquer posi��o, tamb�m no in�cio
		//acesso mais demorado pelo �ndice, � preciso pesquisar os elementos
		//LinkedList<Conta> lista = new LinkedList<>();
		
		//LinkList e ArrayList s�o classe que herdam coisas de List
		List<Conta> lista = new ArrayList<>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 22);
		//Contains � true porque o metodo equals foi sobrescrito na classe conta
		//para avaliar se ja existe esses valores iguais ao objeto
		boolean existe = lista.contains(cc3);
		
		System.out.println("Exite ?"+existe);
		
		for (Conta conta : lista) {
			if(conta.equals(cc3)) {
				System.out.println("Tenho Conta");
			}
		}
		for (Conta conta : lista) {
			System.out.println(conta);
		}
	}

}
