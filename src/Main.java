public class Main{

	public static void main(String[] args) {
		Conta cc = new ContaCorrente();
		cc.depositar(400);
		cc.sacar(150);
		
		Conta poupanša = new ContaPoupanša();
		cc.transferir(0, poupanša);
	
	cc.ImprimirDadosComuns();
	poupanša.ImprimirDadosComuns();
	}
}
	