package br.com.alura;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
	private String instrutor;
	//Porque usar o List ?
	//porque neste caso quando implementamos,
	//estaremos implemanto uma interface
	//nesse caso quem for usar aulas pode usar um arrayList ou LinkedList, etc.
	//temos um aproveitamento do polimorfismo
	private List<Aula> aulas = new LinkedList<>();
	
	//diferença de LinkedList e ArrayList, seria apenas de performace
	//	Ela consegue fazer umas operações de maneira muito eficiente, como invocar o método get(indice). 
	//Se você precisa pegar o décimo quinto elemento, ele te devolve isso bem rápido. Onde uma ArrayList é lenta? 
	//Quando você for, por exemplo, inserir um novo elemento na primeira posição. 
	//Pois a implementação vai precisar mover todos os elementos que estão no começo da lista para a próxima posição. 
	//Se há muitos elementos, isso vai demorar... chamamos isso em computação de consumo de tempo linear.
	//Já a LinkedList possui uma grande vantagem aqui. Ela utiliza a estrutura de dados chamada lista ligada.
	//Ela é muito rápida para adicionar e remover elementos na cabeça da lista, isso é, na primeira posição. 
	//Mas ela é lenta se você precisar acessar um determinado elemento,
	//pois a implementação precisará percorrer todos os elementos até chegar ao décimo quinto, por exemplo
	
	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}
	public String getNome() {
		return nome;
	}
	
	public String getInstrutor() {
		return instrutor;
	}
	
	public List<Aula> getAulas() {
		//dessa forma qualquer um poderia vir por aqui e alterar
		//return aulas;
		//dessa forma é a correta porque, a pessoa terar que usar o metodo adiciona
		//e aqui ele esta retornando algo parecido como uma copia
		//
		return Collections.unmodifiableList(aulas);
	}
	
	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		//vai pegar todos tempo e ira somar
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	
	@Override
	public String toString() {
		return "[Curso: " +nome+ ", tempo total: "+this.getTempoTotal()+"]";
	}
}
