package pilha;

public class Node<T> {

	private T valor;
	private Node<T> proximo;
	
	public T getValor() {
		return valor;
	}
	public void setValor(T valor) {
		this.valor = valor;
	}
	public Node<T> getProximo() {
		return proximo;
	}
	public void setProximo(Node<T> proximo) {
		this.proximo = proximo;
	}
	@Override
	public String toString() {
		return "Node [valor=" + valor + "]";
	}
	
	
}
