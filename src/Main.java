public class Main{

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(400);
		cc.sacar(150);
		
		Conta poupan�a = new ContaPoupan�a();
		cc.transferir(0, poupan�a);
	
	cc.ImprimirDadosComuns();
	poupan�a.ImprimirDadosComuns();
	}
}
	