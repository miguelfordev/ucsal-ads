package atividade_revisão;

public class TestaLSE {

	public static void main(String[] args) {
		ListaSEncadeada<String> vg = new ListaSEncadeada<>();
		vg.add("RJ");
		vg.add("SP");
		vg.listar();
		vg.del();
		System.out.println();
		vg.listar();

	}

}
