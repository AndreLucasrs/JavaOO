
public class TesteComposicao {
	
	public static void main(String[] args) {
		Conta contaDoAndre = new Conta(444,4444);
		Cliente andre = new Cliente();
		//Criando uma associação
		contaDoAndre.setTitular(andre);
		
		contaDoAndre.getTitular().setNome("André");
	}

}
