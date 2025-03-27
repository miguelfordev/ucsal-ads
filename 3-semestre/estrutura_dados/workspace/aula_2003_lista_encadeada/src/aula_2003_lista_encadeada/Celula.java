package aula_2003_lista_encadeada;

public class Celula {
	
	//| juvenal    |  |-->| Diego    |  |-->| Filipe    |  |-->| Arthur    |  |-->
	// valor     proximo
	private Contato valor;
	private Celula proximo;
	
	public Contato getValor() {
		return valor;
	}
	public void setValor(Contato valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
	
}