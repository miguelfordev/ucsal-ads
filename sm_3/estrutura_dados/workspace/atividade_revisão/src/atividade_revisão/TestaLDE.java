package atividade_revisão;

public class TestaLDE {

	public static void main(String[] args) {
		LDE<String> lde = new LDE<>();
		lde.addI("Angela");
		lde.addI("Mario");
		lde.addI("Elton");
		lde.addF("Chris");
		lde.addF("Osvaldo");
		lde.listar();
		System.out.println();
		lde.rmvI();
		lde.rmvF();
		lde.rmvF();
		lde.rmvI();
		lde.listar();

	}

}
