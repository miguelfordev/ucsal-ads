package lista3.ex002;

public class Conta {

	private int numeroConta;
	private String nomeUsuario;
	private double saldo;
	
	public void setUsuario(int numeroConta, String nomeUsuario, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		this.saldo = saldo;
	}
	
	public void saque(double din) {
		this.saldo -= din;
	}
	
	public void deposito(double din) {
		this.saldo += din;
	}
	
	public double consultar() {
		return this.saldo;
	}
	
	public String toString() {
		return this.numeroConta+"/"+this.nomeUsuario+"/"+this.saldo;
	}
	
}
