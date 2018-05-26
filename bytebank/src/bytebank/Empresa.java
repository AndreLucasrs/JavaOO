package bytebank;

public class Empresa {
	private Funcionario[] empregados;
	private String cnpj;
	private int livre = 0;

	public Empresa(int tamanhoArray) {
		empregados = new Funcionario[tamanhoArray];
	}
	public void adiciona(Funcionario f) {
		this.empregados[this.livre] = f;
		this.livre++;
	}
	public void mostraEmpregados() {
	    for (int i = 0; i < this.livre; i++) {
	        System.out.println("Funcionário na posição: " + i);
	        System.out.println("R$" + this.empregados[i].getSalario());
	    }
	}
	public void mostraTodasAsInformacoes() {
	    for (int i = 0; i < this.livre; i++) {
	        System.out.println("Funcionário na posição: " + i);
	        this.empregados[i].mostra();
	    }
	}
	public boolean contem(Funcionario f) {
        for (int i = 0; i < this.livre; i++) {
            if (f == this.empregados[i]) {
                return true;
            }
        }
        return false;
    }
	public Funcionario[] getEmpregados() {
		return empregados;
	}
	public void setEmpregados(Funcionario[] empregados) {
		this.empregados = empregados;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public int getLivre() {
		return livre;
	}
	public void setLivre(int livre) {
		this.livre = livre;
	}
}
