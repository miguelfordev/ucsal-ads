package atividade_avaliativa_1_0;
import java.util.ArrayList;
public class ListaEncadeada_LE_Q3<T> {
	
	public Celula_LE_Q3<T> primeiro;
	public Celula_LE_Q3<T> ultimo;
	public Celula_LE_Q3<T> posicaoAtual;
	public ArrayList<T> listaCelula = new ArrayList<>();
	
	public Celula_LE_Q3<T> getPosicaoAtual(){
		return this.posicaoAtual;
	}
	
	public boolean verifProximo() {
		if(this.primeiro == null) {
			return false;
		} else if (this.posicaoAtual == null) {
			this.posicaoAtual = primeiro;
			return true;
		} else {
			boolean verProx = posicaoAtual.getProximo() != null?true:false;
			posicaoAtual = posicaoAtual.getProximo();
			return verProx;
		}
	}
	
	public void listar() {
		while(verifProximo()) {
			System.out.println(this.posicaoAtual.getValor().getValor());
		}
	}
	
	public void remover() {
		while(verifProximo()) {
			if(this.posicaoAtual.getProximo()== this.ultimo) {
				this.posicaoAtual.setProximo(null);
				this.ultimo = this.posicaoAtual;
			}
		}
	}
	
	public void adicionar(Numero_LE_Q3<T> valor) {
		Celula_LE_Q3<T> cel = new Celula_LE_Q3<T>();
		cel.setValor(valor);
		int eNumero = (int) cel.getValor().getValor();
		if(verPar(eNumero)) {
			listaCelula.add((T) cel);
		} else if(this.primeiro==null && this.ultimo==null) {
					this.primeiro = cel;
					this.ultimo = cel;
				} else {
					ultimo.setProximo(cel);
					ultimo = cel;
				}
		
	}
	
	public boolean verPar(int n) {
		if(n%2==0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void updateLista() {
		for(int i=0;i<listaCelula.size();i++) {
			Celula_LE_Q3<T> cel = new Celula_LE_Q3<T>();
			cel = (Celula_LE_Q3<T>) listaCelula.get(i);
			ultimo.setProximo(cel);
			ultimo = cel;	
		}
	}

}
