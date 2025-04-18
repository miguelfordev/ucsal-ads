package ldeq2;

public class Celula<T> {

	private Celula<T> proximo;
	private T dado;
	
	public Celula<T> getProximo() {
		return proximo;
	}
	public void setProximo(Celula<T> proximo) {
		this.proximo = proximo;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	
	
	
	
	
}
