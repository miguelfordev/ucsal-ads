package atividade_revisão;

public class LDE<T> {

	private Node<T> inicio=null;
	private Node<T> fim=null;
	private Node<T> pA;
	private int c=0;
	
	public void addI(T valor) {
		Node<T> no = new Node<>();
		no.setDado(valor);
		if(this.c==0) {
			this.inicio=no;
			this.fim=no;
		} else {
			this.inicio.setAnterior(no);
			no.setProximo(this.inicio);
			no.setAnterior(null);
			this.inicio = no;
		}
		this.c++;
	}
	
	public void rmvI() {
		Node<T> no = new Node<>();
		this.c--;
		if(this.c==0) {
			this.inicio=null;
			this.fim=null;
		} else {
			no = this.inicio.getProximo();
			this.inicio.setProximo(null);
			no.setAnterior(null);
			this.inicio = no;
		}
	}
	
	public void addF(T valor) {
		Node<T> no = new Node<>();
		no.setDado(valor);
		if(this.c==0) {
			this.inicio = no;
			this.fim = no;
		} else {
			this.fim.setProximo(no);
			no.setAnterior(this.fim);
			no.setProximo(null);
			this.fim = no;
		}
		this.c++;
	}
	
	public void rmvF() {
		Node<T> no = new Node<>();
		this.c--;
		if(this.c==0) {
			this.inicio=null;
			this.fim=null;
		} else {
			no = this.fim.getAnterior();
			this.fim.setAnterior(null);
			no.setProximo(null);
			this.fim = no;
		}
	}
	
	public boolean tP() {
		if(this.inicio==null) {
			return false;
		} else if(this.pA==null) {
			this.pA=this.inicio;
			return true;
		} else {
			boolean vP = this.pA.getProximo() != null?true:false;
			this.pA=this.pA.getProximo();
			return vP;
		}
	}
	
	public void listar() {
		while(tP()) {
			System.out.println(this.pA.getDado());
		}
	}
	
}
