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
	
	//diferen�a de LinkedList e ArrayList, seria apenas de performace
	//	Ela consegue fazer umas opera��es de maneira muito eficiente, como invocar o m�todo get(indice). 
	//Se voc� precisa pegar o d�cimo quinto elemento, ele te devolve isso bem r�pido. Onde uma ArrayList � lenta? 
	//Quando voc� for, por exemplo, inserir um novo elemento na primeira posi��o. 
	//Pois a implementa��o vai precisar mover todos os elementos que est�o no come�o da lista para a pr�xima posi��o. 
	//Se h� muitos elementos, isso vai demorar... chamamos isso em computa��o de consumo de tempo linear.
	//J� a LinkedList possui uma grande vantagem aqui. Ela utiliza a estrutura de dados chamada lista ligada.
	//Ela � muito r�pida para adicionar e remover elementos na cabe�a da lista, isso �, na primeira posi��o. 
	//Mas ela � lenta se voc� precisar acessar um determinado elemento,
	//pois a implementa��o precisar� percorrer todos os elementos at� chegar ao d�cimo quinto, por exemplo
	
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
		//dessa forma � a correta porque, a pessoa terar que usar o metodo adiciona
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
