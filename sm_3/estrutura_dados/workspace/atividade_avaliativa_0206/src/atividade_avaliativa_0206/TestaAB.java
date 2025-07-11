package atividade_avaliativa_0206;

public class TestaAB {

	public static void main(String[] args) {
		AB<String> ab = new AB<>();
		
		ab.addR("-");
		
		ab.addE(ab.getR(), "+");
		ab.addE(ab.bscNo("+"), "6");
		ab.addD(ab.bscNo("+"), "2");
		
		ab.addD(ab.getR(), "/");
		ab.addE(ab.bscNo("/"), "12");
		
		ab.addD(ab.bscNo("/"), "+");
		No<String> barrinha = ab.bscNoE(ab.bscNo("/"), "+"); 
		ab.addE(barrinha, "1");
		ab.addD(barrinha, "3");
		
		ab.exibirOrdem(ab.getR());

	}

}
