package lista_arvore_classroom;

public class Node<T> {

		private T valor;
		private Node<T> Esq, Dir;
		
		public T getValor() {
			return valor;
		}
		public void setValor(T valor) {
			this.valor = valor;
		}
		public Node<T> getEsq() {
			return Esq;
		}
		public void setEsq(Node<T> esq) {
			Esq = esq;
		}
		public Node<T> getDir() {
			return Dir;
		}
		public void setDir(Node<T> dir) {
			Dir = dir;
		}
		
}
