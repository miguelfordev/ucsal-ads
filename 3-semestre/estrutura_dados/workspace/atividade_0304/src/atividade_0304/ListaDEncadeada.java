package atividade_0304;

public class ListaDEncadeada<T> {
	private Node<T> primeiro = null;
	private int n=0;
	private Node<T> ultimo=null;
	private Node<T> posicaoAtual;
	
	public Node<T> getPosicaoAtual(){
		return this.posicaoAtual;
	}
	
	public boolean temAnterior() {
		if(ultimo == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = ultimo;
			return true;
		} else {
			boolean temAnterior = posicaoAtual.getAnterior() != null?true:false;
			posicaoAtual = posicaoAtual.getAnterior();
			return temAnterior;
		}
	}
	
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posicaoAtual.getProximo() != null?true:false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
		}
	}
	
	public void inserirEsquerda(int valor) {
		Node<T> aux = new Node<T>();
		aux.dado = valor;
		
		if(n==0) {
			primeiro = aux;
			ultimo = aux;
			aux.anterior = null;
		} else {
			aux.proximo = primeiro;
			aux.anterior = null;
			primeiro.anterior = aux;
			primeiro = aux;
		}
		n++;
	}
	
	public void inserirDireita(int valor) {
		Node<T> aux = new Node<T>();
		aux.dado = valor;
		
		if(n==0) {
			primeiro = aux;
			ultimo = aux;
			aux.anterior = null;
		} else {
			aux.anterior = ultimo;
			aux.proximo = null;
			ultimo.proximo = aux;
			ultimo = aux;
			//ultimo.anterior.proximo = ultimo;
		}
		n++;
	}
	
	public int removerListaDireita() {
		Node<T> antes, aux = ultimo;
		int dado;
		if(n==0) {
			return(0);
		} else {
			dado = aux.dado;
			n--;
			if(n==0) {
				primeiro = null;
				ultimo = null;
			} else {
				antes = aux.anterior;
				ultimo = antes;
				antes.proximo = null;
			}
			return(dado);
		}
	}
	
	public int removerListaEsquerda() {
		Node<T> antes, aux = primeiro;
		int dado;
		
		if(n==0) {
			return(0);
		} else {
			dado = aux.dado;
			n--;
			if(n==0) {
				primeiro = null;
				ultimo = null;
			} else {
				antes = aux.proximo;
				primeiro = antes;
				antes.anterior = null;
			}
			return(dado);
		}
	}
	
	public void listarListaImprimir() {
		Node<T> aux = primeiro;
		System.out.println("Será que vai funcionar? Vamos lá");
		if(aux!=null) {
			while(aux!=null) {
				System.out.println(aux.dado+" ");
				aux = aux.proximo;
			}
		} else {
			System.out.println("Moral a lista ta vazia.....");
		}
		
		System.out.println();
	}
}
