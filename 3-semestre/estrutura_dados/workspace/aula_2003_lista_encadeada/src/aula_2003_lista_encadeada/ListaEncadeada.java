package aula_2003_lista_encadeada;

public class ListaEncadeada {
	// PRIMEIRO                            							ULTIMO     
	// |   | | --> |    | |--> |    | |--> |    | |--> |    | |-->|    | |-->null
	//															posicaoAtual		
	
	private Celula primeiro;
	private Celula ultimo;
	private Celula posicaoAtual;
	
	//vamos criar um metodo adicionar 
	public void adicionar(Contato valor) {
		//criar casinha
		Celula celula = new Celula();// |   ||-->
		//colocar o valor dentro da casinha
		celula.setValor(valor); // | DERIC  ||-->
		//COMO VOU ENFILEIRAR ESSAS CASINHAS PARA TER UMA LISTA ENCADEADA? 
		//Vamos primeiro saber como ta a nossa lista? 
		if(primeiro == null && ultimo == null) {
			//vou entrar aqui se e somente se a lista estiver vazia
			primeiro = celula; // | DERIC  ||-->
			ultimo = celula; //| DERIC  ||-->
		}else {
			//vamos entrar aqui quando a lista já conter dado
			ultimo.setProximo(celula);// | DERIC  ||--> | DIEGO  ||-->
			ultimo = celula;
		}
		
	}
	
	//como eu vou percorrer numa lista encadeada se não tenho o index como em vetor? 
	//Teremos que implementar algo para nos movimentar na sequencia de casinhas
	
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

	public void remover(Contato valor) {
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
}

