public class Main{

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(400);
		cc.sacar(150);
		
		Conta poupança = new ContaPoupança();
		cc.transferir(0, poupança);
	
	cc.ImprimirDadosComuns();
	poupança.ImprimirDadosComuns();
	}
}
	