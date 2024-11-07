package banco;

public class ContaCorrente extends ContaBancaria{

	public ContaCorrente(String numero, String senha, double saldo) {
		super(numero, senha, saldo);
	}
	
	public boolean saca(double valor) {
		if(valor<=this.saldo) {
			this.saldo-=valor;
			this.qtdTransacoes++;
			return true;
		}else {
			return false;
		}
	}
	 
	public void tiraExtrato() {
		System.out.println("Numero: "+this.numero);
		System.out.println("Saldo: "+this.saldo);
		System.out.println("Quantidade de transacoes: "+this.qtdTransacoes);
	}
}