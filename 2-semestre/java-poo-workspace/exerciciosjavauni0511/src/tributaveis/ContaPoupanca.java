package tributaveis;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public void juros(double percentual) {
		this.saldo+=this.saldo*percentual/100;
	}
}