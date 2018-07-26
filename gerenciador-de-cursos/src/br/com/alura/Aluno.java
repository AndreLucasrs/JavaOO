package br.com.alura;

public class Aluno {
	
	private String nome;
	private int numeroMatricula;
	
	public Aluno(String nome, int numeroMatricula) {
		
		if(nome == null) {
			throw new NullPointerException("Nome não pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	//toda vez que escrever o metodo equals, precisa reescreve o metodo hashcode
	//estou comparando se o objeto equals a outro pelo nome
	@Override
	public boolean equals(Object obj) {
		
		Aluno outro = (Aluno) obj;
		return nome.equals(outro.nome);
	}
	
	//ele ira compara pela tabela de hashcode gerada pelo String
	@Override
	public int hashCode() {
		
		return this.nome.hashCode();
	}
	
	@Override
	public String toString() {
		
		return "[Aluno: "+this.nome+", matricula: "+this.numeroMatricula+" ]";
	}
}
