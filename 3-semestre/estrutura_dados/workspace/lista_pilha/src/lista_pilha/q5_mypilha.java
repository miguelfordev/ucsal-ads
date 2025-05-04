package lista_pilha;

import java.util.Stack;

public class q5_mypilha<E> {

	private Stack<E> pilha;
	
	public <T> void criarPilha() {
		Stack<E> nova_pilha = new Stack<>();
		this.pilha = nova_pilha;
	}
	
	public <T>  void push(E elemento) {
		this.pilha.push(elemento);
	}
	
	public <T>  void pop() {
		this.pilha.pop();
	}
	
	public <T> boolean empty() {
		return this.pilha.empty();
	}
} 
