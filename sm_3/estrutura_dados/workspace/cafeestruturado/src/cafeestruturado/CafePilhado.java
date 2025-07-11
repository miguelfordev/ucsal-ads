package cafeestruturado;

import java.util.Iterator;
import java.util.Stack;

public class CafePilhado<E> {

	private Stack<E> cafepilhado = new Stack<>();
	
	public <T> void push(E nome) {
		cafepilhado.push(nome);
	}
	
	public <T> void pop() {
		cafepilhado.pop();
	}
	
	public boolean eVazia() {
		return cafepilhado.empty();
	}
	
	public <T> void listarLIFO() {
		for(int i=cafepilhado.size()-1;i>=0;i--) {
			System.out.println(cafepilhado.get(i));
		}
	}
	
	public <T> void listar() {
		Iterator<E> it = cafepilhado.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
}
