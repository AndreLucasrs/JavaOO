package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObject {

	public static void main(String[] args) {
		// sobreescrita relacionado com heran�a
		// sobrecarga relacionada com metodo

//		System.out.println("x");
//		System.out.println(3);
//		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(22, 33);
        ContaPoupanca cp = new ContaPoupanca(33, 22);
        Object cc2 = new ContaCorrente(22, 33);
        Object cp2 = new ContaPoupanca(33, 22);
        
        System.out.println(cp);
        System.out.println(cc);
        
		println(cc);
	}

//	static void println() {
//	}
//
//	static void println(int a) {
//	}
//
//	static void println(boolean valor) {
//	}
	//toda class herdar coisas de Objetct
	//Object � um tipo mais generico
	static void println(Object object) {
		
	}
}
