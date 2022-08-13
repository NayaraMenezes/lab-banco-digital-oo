
public class ContaPoupanca extends Conta {

	private String x;

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		x = "=== Extrato Conta Poupanca ===";
		System.out.println(x);
		super.imprimirInfosComuns();
	}
}
