package atividade_revisão;

public class Celula<T> {

	private Celula<T> proxima;
	private T valor;
	
	public Celula<T> getProxima() {
		return proxima;
	}
	public void setProxima(Celula<T> proxima) {
		this.proxima = proxima;
	}
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	
}
