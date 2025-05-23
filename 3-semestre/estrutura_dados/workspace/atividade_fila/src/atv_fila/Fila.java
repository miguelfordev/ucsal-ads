package atv_fila;

public class Fila<T> {
	
	private Node<T> inicio;
	private Node<T> fim;
	private Node<T> pA;
	private int c=-1;
	
	public Node<T> getpA(){
		return this.pA;
	}
	
	public boolean hasnext() {
		if(this.inicio==null) {
			return false;
		} else if(this.pA==null) {
			this.pA = this.inicio;
			return true;
		} else {
			boolean vp = this.pA.getProximo()!=null?true:false;
			this.pA = this.pA.getProximo();
			return vp;
		}
	}
	
	public void push(T valor) {
		Node<T> no = new Node<>();
		no.setValor(valor);
		if(this.c==-1) {
			this.inicio=no;
			this.fim=no;
		} else {
			this.fim.setProximo(no);
			no.setAnterior(this.fim);
			no.setProximo(null);
			this.fim=no;
		}
		this.c++;
	}
	
	public void pop() {
		Node<T> aux = new Node<>();
		this.c--;
		if(this.c==-1) {
			this.inicio=null;
			this.fim=null;
		} else {
			aux = this.inicio.getProximo();
			this.inicio.setProximo(null);
			aux.setAnterior(null);
			this.inicio=aux;
		}
	}

}
