package exemplos.ex1009.series;

public class Fibannaci {
		
		private int a=1,b=1,c=(a+b);
		
		public int prxTermo() {
			int n;
			n = this.a;
			this.a = this.b;
			this.b = this.c;
			this.c = this.a + this.b;
			return n;		
		}
		
		
}
