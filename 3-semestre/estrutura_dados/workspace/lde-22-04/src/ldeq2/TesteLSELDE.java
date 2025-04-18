package ldeq2;

public class TesteLSELDE {

	public static void main(String[] args) {
		LSE<String> lse1 = new LSE<>();
		LSE<String> lse2 = new LSE<>();
		LDE<String> lde = new LDE<>();
		
		lse1.addLSE("Ana");
		lse1.addLSE("Angela");
		lse1.addLSE("Bia");
		lse1.addLSE("Eu");
		lse1.addLSE("Carlos");
		lse1.addLSE("To ficando");
		lse1.addLSE("Gabriel");
		lse1.addLSE("Maluco");
		listarLSE(lse1);
		
		lse2.addLSE("To ficando");
		lse2.addLSE("Damião");
		lse2.addLSE("Eu");
		lse2.addLSE("Everton");
		lse2.addLSE("Maluco");
		lse2.addLSE("Fernando");
		lse2.addLSE("Angela");
		lse2.addLSE("Hilton");
		listarLSE(lse2);
		
		verificandoNomes(lse1,lse2,lde);
		
		
	}
	
	public static <T> void verificandoNomes(LSE<T> lse1, LSE<T> lse2, LDE<T> lde) {
		while(lse1.tP()) {
			while(lse2.tP()) {
				if(lse1.getpA().getDado().equals(lse2.getpA().getDado())) {
					lde.addF(lse1.getpA().getDado());
				}
			}
		}
		System.out.println("A lista duplamente encadeada tem os seguintes nomes: ");
		while(lde.tP()) {
			System.out.println(lde.getpA().getValor());
		}
	}
	
	public static <T> void listarLSE(LSE<T> lse) {
		System.out.println("A Lista Simplesmente Encadeada é:");
		while(lse.tP()) {
			System.out.println(lse.getpA().getDado());
		}
		System.out.println();
	}

}
