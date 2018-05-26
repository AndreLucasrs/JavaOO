package br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class TitularContaComparatorOrdenar implements Comparator<Conta>{

	/**
	 * Esse metodo vai difinir que conta é maior do que a outra pelo numero da conta,
	 * Modelo de ordenação do java 1.8
	 */
	@Override
	public int compare(Conta c1, Conta c2) {
		
		String nomeC1 = c1.getTitular().getNome();
		String nomeC2 = c2.getTitular().getNome();
		
		//ele irar compara o nome c1 com o nome c2 e retornara um integer, menor ou maior
		//assim como o if da clasa de NumeroContaComparatorOrdenar
		return nomeC1.compareToIgnoreCase(nomeC2);
	}
}
