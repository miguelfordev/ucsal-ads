package atividade_0304;

public class Node<T> {
	public Node<T> anterior = null;
	public int dado;
	public Node<T> proximo = null;
	
	public Node<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Node<T> anterior) {
		this.anterior = anterior;
	}
	public int getDado() {
		return dado;
	}
	public void setDado(int dado) {
		this.dado = dado;
	}
	public Node<T> getProximo() {
		return proximo;
	}
	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	
	
}
