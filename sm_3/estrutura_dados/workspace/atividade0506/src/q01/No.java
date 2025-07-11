package q01;


public class No<T> {

		private T v;
		private No<T> E, D;
		
		public T getV() {
			return v;
		}
		public void setV(T v) {
			this.v = v;
		}
		public No<T> getE() {
			return E;
		}
		public void setE(No<T> e) {
			E = e;
		}
		public No<T> getD() {
			return D;
		}
		public void setD(No<T> d) {
			D = d;
		}
		
}
