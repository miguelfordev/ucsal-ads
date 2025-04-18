package ldeq3;

public class LDE<T> {
	
	private Node<T> inicio;
	private Node<T> fim;
	private Node<T> pA;
	private int c=0;
	
	public Node<T> getpA(){
		return this.pA;
	}
	
	public void addI(T valor) {
		Node<T> no = new Node<>();
		no.setValor(valor);
		if(this.c==0) {
			this.inicio=no;
			this.fim=no;
		} else {
			this.inicio.setAnterior(no);
			no.setProximo(this.inicio);
			no.setAnterior(null);
			this.inicio=no;
		}
		this.c++;
	}
	
	public void addF(T valor) {
		Node<T> no = new Node<>();
		no.setValor(valor);
		if(this.c==0) {
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
	
	public boolean tp() {
		if(this.c==0) {
			return false;
		} else if(this.pA==null) {
			this.pA=this.inicio;
			return true;
		} else {
			boolean vp = this.pA.getProximo()!=null?true:false;
			this.pA = this.pA.getProximo();
			return vp;
		}
	}
}
