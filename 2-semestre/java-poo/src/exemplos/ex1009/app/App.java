package exemplos.ex1009.app;
import exemplos.ex1009.series.Fibannaci;
import exemplos.ex1009.series.ProgressaoAritmetica;
import exemplos.ex1009.series.ProgressaoGeometrica;
public class App {

	public static void main(String[] args) {
		Fibannaci fibo = new Fibannaci();
		ProgressaoAritmetica pa = new ProgressaoAritmetica();
		ProgressaoGeometrica pg = new ProgressaoGeometrica();
		
		for(int i=0;i<4;i++) {
			System.out.println(pg.prxTermo());
		}
		
//		System.out.println(fibo.prxTermo());
//		System.out.println(pa.prxTermo());

	}

}
