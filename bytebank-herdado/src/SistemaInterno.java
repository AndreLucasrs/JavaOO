
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autentico = fa.autentica(this.senha);
		if(autentico) {
			System.out.println("Pode acessar o Sistema");
		}else {
			System.out.println("Não pode acessar o Sistema");
		}
	}

}
