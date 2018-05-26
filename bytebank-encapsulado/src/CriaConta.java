
public class CriaConta {
	public static void main(String[] args) {
		//Falamos geralmente nesse caso que estamos criando um novo objeto,
		// mas o certo é estamos criando uma referencia a um novo objeto
		Conta primeiraConta = new Conta(111,1111);
        primeiraConta.deposita(50);
        System.out.println("Primeira Conta, primeiro saldo "+primeiraConta.getSaldo());

        Conta segundaConta = new Conta(222,2222);
        segundaConta.deposita(200);
        System.out.println("Segunda Conta, primeiro saldo "+segundaConta.getSaldo());
        segundaConta.transfere(100, primeiraConta);
        segundaConta.saca(50);
        System.out.println("primeira conta tem " + primeiraConta.getSaldo());
        System.out.println("segunda conta tem " + segundaConta.getSaldo());
	}

}
