
public class TesteComposicao {
	
	public static void main(String[] args) {
		Conta contaDoAndre = new Conta(444,4444);
		Cliente andre = new Cliente();
		//Criando uma associa��o
		contaDoAndre.setTitular(andre);
		
		contaDoAndre.getTitular().setNome("Andr�");
	}

}
