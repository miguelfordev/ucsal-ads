package atividade_revisão;

public class Node<T> {

	private Node<T> proximo;
	private Node<T> anterior;
	private T dado;
	
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
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	
	
}
