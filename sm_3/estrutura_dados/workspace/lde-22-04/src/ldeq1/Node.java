package ldeq1;

public class Node<T> {

	private Node<T> proximo;
	private Node<T> anterior;
	private T valor;

	public Node<T> getProximo() {
		return proximo;
	}

	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}

	public Node<T> getAnterior() {
		return anterior;
	}

	public void setAnterior(Node<T> anterior) {
		this.anterior = anterior;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

}
