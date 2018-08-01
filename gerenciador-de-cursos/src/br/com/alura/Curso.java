package br.com.alura;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private String nome;
	private String instrutor;
	//Porque usar o List ?
	//porque neste caso quando implementamos,
	//estaremos implemanto uma interface
	//nesse caso quem for usar aulas pode usar um arrayList ou LinkedList, etc.
	//temos um aproveitamento do polimorfismo
	private List<Aula> aulas = new LinkedList<>();
	
	//HashSet não mantem a ordem na hora de apresentar
	//o LinkHashSet sim
	//E nem adiciona objetos repetidos
	private Set<Aluno> alunos = new HashSet<>();
	
	//para busca ele é mais perfomatico
	//LinkedHashMap ele ira guarda a ordem das linhas na hora que for inserido, uma das diferenças do HashMap
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
	
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
	
	//sobre map
	//Ela funciona da seguinte maneira, mapeia valores para chaves, e através da chave conseguimos acessar o valor correspondente. Por isso ela não pode ser repetida, ao contrário do valor, que podem existir iguais.
	//Se uma chave for repetida, a antiga permanece, porém, o valor é sobrescrito pelo novo valor contido na chave passada, sendo o antigo valor "esquecido" pelo Map.
	
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
		//adiciona aula, lista
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		//vai pegar todos tempo e ira somar
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}
	public void matricula(Aluno aluno) {
		//adiciona um novo aluno no curso, no conjunto
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
	}
	
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	
	@Override
	public String toString() {
		return "[Curso: " +nome+ ", tempo total: "+this.getTempoTotal()+"]";
	}
	public boolean estaMatriculado(Aluno aluno) {
		
		return this.alunos.contains(aluno);
	}
	public Aluno buscaMatriculado(int numero) {
		if(!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
	}
}
