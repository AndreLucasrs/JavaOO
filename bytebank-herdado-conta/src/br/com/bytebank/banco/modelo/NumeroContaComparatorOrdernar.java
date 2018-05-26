package br.com.bytebank.banco.modelo;

import java.util.Comparator;

public class NumeroContaComparatorOrdernar implements Comparator<Conta>{

	/**
	 * Esse metodo vai difinir que conta é maior do que a outra pelo numero da conta,
	 * Modelo de ordenação do java 1.8
	 */
	@Override
	public int compare(Conta c1, Conta c2) {
		
//		e a forma que fica fica claro e tbm resolve
		return Integer.compare(c1.getNumero(),c2.getNumero());
		
//		não fica tão claro, mas dessa forma tbm funciona
//		ele verifica se c1 > c2 ou c2 > c1 ou c1 == c2
//		return c1.getNumero() - c2.getNumero();
		
//		forma mas explicita possivel de resolver
//		if(c1.getNumero() < c2.getNumero()) {
//			return -1;
//		}
//		else if(c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//		
//		return 0;
	}
	
}