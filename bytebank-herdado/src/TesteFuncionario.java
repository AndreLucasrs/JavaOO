
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Gerente andre = new Gerente();
		andre.setNome("André");
		andre.setCpf("22222222222");
		andre.setSalario(1000);
		
		System.out.println("Salario "+andre.getSalario());
		System.out.println("Boficacao "+andre.getBonificacao());
	}

}
