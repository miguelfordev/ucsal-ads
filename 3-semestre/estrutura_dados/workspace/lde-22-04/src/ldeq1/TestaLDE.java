package ldeq1;

public class TestaLDE {

	public static void main(String[] args) {
		LDE<Integer> lden = new LDE<>();
		
		lden.addF(5);
		lden.addF(10);
		lden.addF(15);
		lden.addF(20);
		lden.addF(25);
		
		mostraListaVA(lden);
		System.out.println();
		mostraListaVP(lden);

	}
	
	public static <T> void mostraListaVP(LDE<T> lde) {
		while(lde.tP()) {
			System.out.println(lde.getpA().getValor());
		}
	}
	
	public static <T> void mostraListaVA(LDE<T> lde) {
		while(lde.tA()) {
			System.out.println(lde.getpA().getValor());
		}
	}

}
