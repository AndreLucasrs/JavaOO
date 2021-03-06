package br.com.bytebank.banco.modelo;
public abstract class Conta {

	//Quando n�o expressamos diretamente um modificador de visibilidade como public,
	//a classe se torna vis�vel apenas dentro de seu pr�prio pacote,
	//isso significa <<package private>>,
	//n�o se trata de uma palavra utilizada no mundo Java,
	//mas a condi��o de uma classe nos termos de visibilidade, caso n�o espefifiquemos essa condi��o.
	//embre-se que retiramos o protected de double saldo,
	//isso significa que na quest�o de visibilidade este atributo passa a ser <<package private>>,
	//ou seja, apenas vis�vel dentro de seu pr�prio pacote
	
	//public:vis�vel em todos os espa�os
	//protected: vis�vel dentro do pacote e p�blico para os filhos
	//package private: vis�vel apenas dentro do pacote
	//private: vis�vel apenas dentro da classe
	
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
    
    /**
     * Metodo construstuor
     * @param agencia
     * @param numero
     */
    public Conta(int agencia, int numero){
        Conta.total++;
        //System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        //System.out.println("Estou criando uma conta " + this.numero);
    }

    public abstract void deposita(double valor);

    public void saca(double valor) throws SaldoInsuficienteExcepetion {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteExcepetion("Saldo Insuficiente !!! Saldo: R$ "+this.saldo+" Sacar:"+valor);
        }    
        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws SaldoInsuficienteExcepetion {
    	this.saca(valor);
    	destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
       if(agencia <= 0) {
           System.out.println("Nao pode valor menor igual a 0");
           return;
       }
       this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public static void setTotal(int total) {
		Conta.total = total;
	}
	
	@Override 
	public String toString() { 
	    return "Numero: " + this.numero + " Agencia: " + this.agencia;
	}
	
	@Override
	public boolean equals(Object ref){

	    Conta outra = (Conta) ref;

	    if(this.agencia != outra.agencia){
	        return false;
	    }

	    if(this.numero != outra.numero){
	        return false;
	    }

	    return true;
	}
}