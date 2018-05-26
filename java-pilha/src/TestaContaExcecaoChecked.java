
public class TestaContaExcecaoChecked {

	public static void main(String[] args) {
		
		Conta c = new Conta();
		try {
			c.deposita();
		}catch (MinhaExecao ex) {
			System.out.println("Tratando");
		}

	}

}
