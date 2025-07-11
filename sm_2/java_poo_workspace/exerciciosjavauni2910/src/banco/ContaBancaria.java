package banco;

public abstract class ContaBancaria {
	protected String senha;
	protected String numero;
	protected double saldo;
	protected int qtdTransacoes;
	
	public ContaBancaria(String numero, String senha, double saldo) {
		this.numero=numero;
		this.senha=senha;
		this.saldo=saldo;
		this.qtdTransacoes=0;
	}
	
	public boolean deposita(double valor) {
		if(valor>0) {
			this.saldo+=valor;
			this.qtdTransacoes++;
			return true;
		}else {
			return false;
		}
	}
	
	public abstract boolean saca(double valor);
	 
	public abstract void tiraExtrato();
}
