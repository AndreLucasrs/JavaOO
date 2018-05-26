
public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta = new Conta(333,3333);
		conta.deposita(200);
		Conta conta2 = conta;
		conta2.deposita(conta.getSaldo() + 100);
		System.out.println("Conta 1 saldo "+conta.getSaldo());
		System.out.println("Conta 2 saldo "+conta2.getSaldo());
		//O resultado foi que a conta 1 e a conta 2, teve o valor alterado
		// agora as duas est�o com valor 300,
		//isso ocorre pq eu n�o criei um objeto novo e sim uma referencia nova
		// que esta aponta para o mesmo objeto,
		//conta1 e conta2 est�o fazendo referencia ao mesmo objeto,
		//isso quer dizer eles est�o apontando para mesmo espa�o de memoria
	}
}
