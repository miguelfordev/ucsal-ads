package atividade_avaliativa_1_0;

public class Celula_LE_Q3<T> {
	
	public Numero_LE_Q3<T> valor;
	public Celula_LE_Q3<T> proximo;
	
	public Numero_LE_Q3<T> getValor() {
		return this.valor;
	}
	public void setValor(Numero_LE_Q3<T> valor) {
		this.valor = valor;
	}
	public Celula_LE_Q3<T> getProximo() {
		return proximo;
	}
	public void setProximo(Celula_LE_Q3<T> proximo) {
		this.proximo = proximo;
	}
	
}
