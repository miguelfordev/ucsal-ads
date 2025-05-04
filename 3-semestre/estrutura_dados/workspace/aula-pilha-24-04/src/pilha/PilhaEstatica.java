package pilha;

public class PilhaEstatica<T> {

	private Node<T> topo=null;
	private int cap;
	private int cont=-1;
	
	public PilhaEstatica(int capacidade) {
		this.cap = capacidade;
	}
	
	public boolean isCheia() {
		return cap == cont+1;
	}
	
	public boolean isVazia() {
		return cont == -1;
	}
	
	public void push(T valor) {
		Node<T> no = new Node<>();
		no.setValor(valor);
		if(this.topo==null && isVazia()) {
			this.topo=no;
			this.cont++;
			System.out.println(this.cont+1+"º elemento adicionado.");
		} else if(this.topo!=null && !isVazia() && !isCheia()){
			no.setProximo(this.topo);
			this.topo=no;
			this.cont++;
			System.out.println(this.cont+1+"º Elemento adicionado.");
		} else if(isCheia()) {
			System.out.println("Lista Cheia.");
		}
	}
	
	public void pop() {
		Node<T> no = this.topo;
		this.cont--;
		if(isVazia()) {
			this.topo=null;
			System.out.println("Elemento removido.");
		} else {
			this.topo = no.getProximo();
			System.out.println("Elemento removido do topo.");
		}
	}
	
	public Node<T> getTopo(){
		return this.topo;
	}

	@Override
	public String toString() {
		return "PilhaEstatica [topo=" + topo + ", cont=" + cont + "]";
	}
	
	public String listar() {
		StringBuilder sb = new StringBuilder();
		
		if(cont == -1) {
			System.out.println("lista vazia");
		}
		
		Node atual = topo;
		while(atual.getProximo() != null) {
			sb.append(atual.getValor()).append(", ");
			atual = atual.getProximo();
		}
		
		sb.append(atual.getValor());
		
		return sb.toString();
	}
	
}
