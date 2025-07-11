package lista_pilha;

import java.util.Stack;

public class q4_MyPilha<E> {
	
	private Stack<E> pilha;
	
	public void inicializarPilha() {
		Stack<E> nova_pilha = new Stack<>();
		this.pilha = nova_pilha;
	}
	
	public <T> void push(E elemento) {
		this.pilha.push(elemento);
	}
	
	public <T> void pop() {
		this.pilha.pop();
	}

	public <T> E peek() {
		return this.pilha.peek();
	}
}
