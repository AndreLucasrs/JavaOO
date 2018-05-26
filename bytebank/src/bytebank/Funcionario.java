package bytebank;

public class Funcionario {

	private String nome;
	public String departamento;
	private double salario;
	public Data dataEntrada = new Data();
	private String rg;
	
	private static int identificador;

	public Funcionario(String nome) {
		this.nome = nome;
	}
	public Funcionario() {
		identificador++;
	}
	public double recebeAumento(double valor) {
		return this.salario += valor;
	}

	public double calculaGanhoAnual() {
		return this.salario *= 12;
	}

	public void mostra() {
		System.out.println(this.nome);
		System.out.println(this.rg);
		System.out.println(this.departamento);
		System.out.println(this.salario);
		System.out.println("Dia: " + this.dataEntrada.dia);
		System.out.println("Mês: " + this.dataEntrada.mes);
		System.out.println("Ano: " + this.dataEntrada.ano);
		System.out.println(this.calculaGanhoAnual());

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataEntrada() {
		return dataEntrada;
	}

	public void setDataEntrada(Data dataEntrada) {
		this.dataEntrada = dataEntrada;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	public static int getIdentificador() {
		return identificador;
	}
}