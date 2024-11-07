package banco;

public class ContaEspecial extends ContaBancaria{
	protected double limite;
	public ContaEspecial(String numero, String senha, double saldo,
						double limite) {
		
		super(numero, senha, saldo);
		this.limite=limite;
	}
	
	public boolean saca(double valor) {
		if(valor<=this.saldo+this.limite) {
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
		System.out.println("Limite: "+this.limite);
		System.out.println("Quantidade de transacoes: "+this.qtdTransacoes);
	}
}