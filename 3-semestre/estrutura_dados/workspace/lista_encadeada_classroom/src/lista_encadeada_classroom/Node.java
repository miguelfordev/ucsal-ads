package lista_encadeada_classroom;

public class Node<T> {

	public Node<T> anterior=null;
	public Node<T> proximo=null;
	public T dado;
	
	public Node<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(Node<T> anterior) {
		this.anterior = anterior;
	}
	public Node<T> getProximo() {
		return proximo;
	}
	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	public T getDado() {
		return dado;
	}
	public void setDado(T dado) {
		this.dado = dado;
	}
	
	
}
