package aula_private_2703;

public class ListaEncadeada {

	private Celula primeiro;
	private Celula ultimo;
	private Celula posAtual;
	
	public void adicionarMusica(Musica valor) {
		Celula cel = new Celula();
		cel.setValor(valor);
		if(primeiro == null && ultimo == null) {
			primeiro = ultimo = cel;
		} else {
			ultimo.setProximo(cel);
			ultimo = cel;
		}
	}
	
	public boolean temProximo() {
		if(primeiro == null) {
			return false;
		} else if (posAtual == null) {
			posAtual = primeiro;
			return true;
		} else {
			boolean temProximo = posAtual.getProximo() != null;
			posAtual = posAtual.getProximo();
			return temProximo;
		}
	}
	
	public void listar() {
        if (primeiro == null) {
            System.out.println("Lista vazia.");
            return;
        }
        while(temProximo()) {
            System.out.println(posAtual.getValor().getNomeMusica());
        }
    }
	
	public void remover() {
		if(primeiro == null) {
			return;
		}else if(primeiro.getProximo() == null) {
			primeiro = ultimo = null;
			return;
		} else {			
			while(temProximo()) {
				if(posAtual.getProximo().getProximo() == null) {
					posAtual.setProximo(null);
					ultimo = posAtual;
				}
			}
		}
	}
	
}
