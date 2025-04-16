
public class ContaPoupanca extends Conta {
	private double selic = 0.5;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}
	public void verEstimacaoSaldoFuturoPorAnos(int ano){
		System.out.println((getSaldo()*selic) * ano);
	}
}
