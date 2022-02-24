
public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;
	
	
	protected  int agencia;
	protected  int numero;
	protected  double saldo;

	public Conta() {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
	}			
	
	
	public int getAgencia() {
		return agencia;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) 
	{
		saldo -= valor;
		
		if (valor <= saldo) 
		
		System.out.println((String.format("Saque de: " +valor+ ", Novo Saldo após saque: %.2f", this.saldo)));
		
		else {
		System.out.println("Seu saldo é insuficiente");
	}
}
		
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected void ImprimirDadosComuns() {
		 System.out.println(String.format("Agencia: %d", this.agencia));
		 System.out.println(String.format("Numero: %d", this.numero));
		 System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
