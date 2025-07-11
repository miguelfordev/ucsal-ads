package lista_encadeada_classroom;

public class ListaEncadeada<T> {
	
	private Node<T> inicio=null;
	private Node<T> fim=null;
	private Node<T> pA;
	private int c=0;
	private int max=0;
	
	public boolean temProximo() {
		if(this.inicio==null) {
			return false;
		} else if (pA == null){
			pA = this.inicio;
			return true;
		} else {
			boolean verP = pA.getProximo() != null?true:false;
			pA = pA.getProximo();
			return verP;
		}
	}
	
	public Node<T> buscaR(T valor) {
		return buscarA(valor, this.inicio);
	}
	
	public Node<T> buscarA(T valor, Node<T> noAtual){
		if(noAtual == null || noAtual.getDado().equals(valor)) {
			return noAtual;
		}
		return buscarA(valor, noAtual.getProximo());
	}
	
	public void pesquisar(T valor) {
		int num=0;
		boolean conf = false;
		if(!getVazio()) {
			while(temProximo()) {
				num++;
				if(pA.dado.equals(valor)) {
					System.out.println("Existe esse dado na posição: "+num);
					conf = true;
				}
			}
			if(!conf) {
				System.out.println("Dado não encontrado.");
			}
		} else {
				System.out.println("Lista vazia.");
			}
		}
	
	public int getTamanho() {
		return this.c;
	}
	
	public boolean getVazio() {
		if(c==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void apagarLista() {
		this.inicio=null;
		this.fim=null;
		this.c=0;
	}
	
	public void delE() {
		Node<T> noProximo, noAtual = this.inicio;
		if(c==0) {
			System.out.println("Lista vazia.");
		} else {
			this.c--;
			if(c==0) {
				this.inicio=null;
				this.fim=null;
			} else {
				noProximo = noAtual.proximo;
				noAtual.proximo = null;
				noProximo.anterior = null;
				this.inicio = noProximo;
			}
		}
	}
	
	public void delD() {
		Node<T> noAntecessor, noAtual = this.fim;
		if(c==0) {
			System.out.println("Lista vazia.");
		} else {
			this.c--;
			if(c==0) {
				this.inicio=null;
				this.fim=null;
			} else {
				noAntecessor = noAtual.anterior;
				noAtual.anterior=null;
				noAntecessor.proximo = null;
				this.fim = noAntecessor;
			}
		}
	}
	
	public void addD(T valor) {
		Node<T> novoNo = new Node<T>(); 
		novoNo.dado = valor;
		if(c==0) {
			this.inicio = novoNo;
			this.fim = novoNo;
		} else {
			novoNo.proximo = null; 
			novoNo.anterior = this.fim;
			this.fim.proximo = novoNo;
			this.fim = novoNo;
		}
		c++;
	}
	public void addE(T valor) {
		Node<T> novoNo = new Node<T>();
		novoNo.dado = valor;
		
		if(c==0) {
			this.inicio = novoNo;
			this.fim = novoNo;
		} else {
			novoNo.proximo = this.inicio;
			novoNo.anterior = null;
			this.inicio.anterior = novoNo;
			this.inicio = novoNo;
		}
		c++;
	}
	
	public void listar() {
		Node<T> noCheck = new Node<T>();
		noCheck = this.inicio;
		if(noCheck!=null) {
			while(noCheck!=null) {
				System.out.println(noCheck.dado+" ");
				noCheck = noCheck.proximo;
			}
		} else {
			System.out.println("Lista vazia.");
		}
		System.out.println();
	}
	
	public void addDMax7(T valor) {
		Node<T> novoNo = new Node<T>(); 
		novoNo.dado = valor;
		if(max==0) {
			this.inicio = novoNo;
			this.fim = novoNo;
		} else if (max<7){
			novoNo.proximo = null; 
			novoNo.anterior = this.fim;
			this.fim.proximo = novoNo;
			this.fim = novoNo;
		} else {
			System.out.println("Não é possivel adicionar mais numeros.");
		}
		max++;
	}
	
}
