package tributaveis;

public class Conta {
	double saldo;
	
	public Conta(double saldo) {
		this.saldo=saldo;
	}
		
		public boolean sacar(double valor){
			if(valor<=this.saldo) {
				this.saldo-=valor;
				return true;
			}else {
				return false;
			}
		}
		
		public boolean depositar(double valor) {
			if(valor>0) {
				this.saldo+=valor;
				return true;
			}else {
				return false;
			}
		}
		
		public double obterSaldo() {
			return this.saldo;
		}
	
}