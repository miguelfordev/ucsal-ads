package lista_LE;



public class ListaEncadeada<T> {

	Celula primeiro;
	Celula ultimo;
	Celula posicaoAtual;
		
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
	
	public Celula getPosicaoAtual() {
		return posicaoAtual;
	}
	
	public void adicionar(Valor valor) {
		Celula celula = new Celula();
		celula.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = celula;
			ultimo = celula;
		} else {
			ultimo.setProximo(celula);
			ultimo = celula;
		}
	}
	
	public void remover(Valor valor) {
		Celula posAtual = this.primeiro;
		if(posAtual.getProximo() != null && posAtual.getValor().getId() != valor.getId()) {
			while(temProximo()){
				if(posAtual.getProximo() != null && posAtual.getValor().getId() != valor.getId()) {
					if(posAtual.getProximo().getValor().getId() == valor.getId()){
						posicaoAtual.setProximo(posAtual.getProximo().getProximo());
						if (posAtual.getProximo() == null) {
							ultimo = posAtual;
							ultimo.setProximo(null);					
						}	
					} 
				}
				posAtual = posicaoAtual.getProximo();
			}
		} else {
			this.primeiro = posAtual.getProximo();
		}	
	}
	
	public int tamanho() {
		int var=0;
		while(temProximo()) {
			var+=1;
		}
		return var;
	}
		
}
