package ldeq1;

public class LDE<T> {

	private Node<T> inicio;
	private Node<T> fim;
	private Node<T> pA;
	private int c;
	
	public Node<T> getpA(){
		return this.pA;
	}
	
	public boolean tA() {
		if(this.c==0) {
			return false;
		} else if(this.pA==null) {
			this.pA = this.fim;
			return true;
		} else {
			boolean vA = this.pA.getAnterior()!=null?true:false;
			this.pA = this.pA.getAnterior();
			return vA;
		}
	}
	
	public boolean tP() {
		if(this.c==0) {
			return false;
		} else if (this.pA==null) {
			this.pA=this.inicio;
			return true;
		} else {
			boolean vP = this.pA.getProximo()!=null?true:false;
			this.pA=this.pA.getProximo();
			return vP;
		}
	}
	
	public void addI(T valor) {
		Node<T> no = new Node<T>();
		no.setValor(valor);
		if(this.c==0) {
			this.inicio = no;
			this.fim = no;
		} else {
			no.setProximo(this.inicio);
			this.inicio.setAnterior(no);
			no.setAnterior(null);
			this.inicio=no;
		}
		this.c++;
	}
	
	public void addF(T valor) {
		Node<T> no = new Node<T>();
		no.setValor(valor);
		if(this.c==0) {
			this.inicio=no;
			this.fim=no;
		} else {
			this.fim.setProximo(no);
			no.setAnterior(this.fim);
			no.setProximo(null);
			this.fim = no;
		}
		this.c++;
	}
	
}
