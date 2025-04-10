package atividade_revisão;

public class ListaSEncadeada<T> {

	private Celula<T> primeiro=null;
	private Celula<T> ultimo=null;
	private Celula<T> pA;
	private int c=0;
	
	public boolean temP() {
		if(this.primeiro==null) {
			return false;
		} else if(this.pA==null){
			this.pA = this.primeiro;
			return true;
		} else {
			boolean verP = pA.getProxima() != null?true:false;
			pA = pA.getProxima();
			return verP;
		}
	}
	
	public void add(T valor) {
		Celula<T> cel = new Celula<>();
		cel.setValor(valor);
		if(c==0) {
			this.primeiro = cel;
			this.ultimo = cel;
		} else {
			this.primeiro.setProxima(cel);
			cel.setProxima(null);
			this.ultimo=cel;
		}
		c++;
	}
	
	public void listar() {
		while(temP()) {
			System.out.println(this.pA.getValor());
		}
	}

	public void del() {
		Celula<T> aux = new Celula<>();
		this.c--;
		if(c==0) {
			this.primeiro=null;
			this.ultimo=null;
		} else {
			while(temP()) {
				if(pA.getProxima()==this.ultimo) {
					aux = this.pA;
					aux.setProxima(null);
				}
			}
			this.ultimo.setProxima(aux);			
		}
		
	}
}
