package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		//Conheceremos um conceito fundamental da String: uma vez que foi criada,
		//ela n�o moder� ser modificada posteriormente.
		//Chamamos o conceito de um objeto de n�o pode ser alterado de imutabilidade
		String nome = "Alura";//object literal
		
		//se vc quer alterar o valor vc tem que fazer dessa forma
		nome = nome.replace("A", "a");
		char c = nome.charAt(2);
		int pos = nome.indexOf("ur");
		String sub = nome.substring(1);
		nome.toLowerCase();
		
		String vazio = "";
		String vazio2 = " ";
		vazio2 = vazio2.trim();
		System.out.println(nome);
		System.out.println(c);
		System.out.println(pos);
		System.out.println(sub);
		System.out.println(nome.length());
		System.out.println(vazio.isEmpty());
		System.out.println(vazio2.isEmpty());
		System.out.println(nome.contains("alu"));

	}

}
