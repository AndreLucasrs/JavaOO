public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;
	
	//rescrita da assinatura do metodo da classe Funcionario
	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Gerente");
	    return super.getSalario();
	}

	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);	
	}
}