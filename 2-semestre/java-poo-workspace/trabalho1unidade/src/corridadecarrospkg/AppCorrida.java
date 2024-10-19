package corridadecarrospkg;

public class AppCorrida {

	public static void main(String[] args) {
	
		int distanciaMaxima = 10;
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		
		rua();
		System.out.println(c1.getCar());
		tracado();
		System.out.println(c2.getCar());
		rua();
		do {
			rua();
			c1.pegandoVelo(c1.geraVelo());
			System.out.println(c1.getCar());
			tracado();
			c2.pegandoVelo(c2.geraVelo());
			System.out.println(c2.getCar());
			rua();	
		}while(distanciaMaxima>c1.getDistancia() && distanciaMaxima>c2.getDistancia());
		
		if(c1.getDistancia()==distanciaMaxima && c2.getDistancia()==distanciaMaxima || c1.getDistancia()==c2.getDistancia()) {
			System.out.println("Os Carros empataram");
		} else {
			if(c2.getDistancia()>=distanciaMaxima && c2.getDistancia()>c1.getDistancia()) {
				System.out.println("Carro 2 Ganhou!");
			} else {
				if(c1.getDistancia()>=distanciaMaxima && c1.getDistancia()>c2.getDistancia()) {
					System.out.println("Carro 1 Ganhou!");						
				}
			}
		}
		
		
	}
	
	public static void rua() {
		for(int i=0;i<10;i++) {
			System.out.print("_");
		}
		System.out.print("P____");
		System.out.println();
	}
	
	public static void tracado() {
		for(int i=0;i<5;i++) {
			System.out.print(" -");
		}
		System.out.print(" - -");
		System.out.println();
	}
	
}
