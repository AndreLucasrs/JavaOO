
//não pode instanciar essa classe, pq é abstrata
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// assinatura do metodo
	//public double getBonificacao() {
	//	return this.salario * 0.1;
	//}
	
	// metodo sem corpo, não ha implementação desse metodo aqui
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}