package lista_arvore_classroom;

public class TestaAB {

	public static void main(String[] args) {
		/*Faça um algoritmo para:

		a) Mostrar o caminhamento central a esquerda.
		b) Mostrar o caminhamento pré-fixado a direita.
		c) Mostrar o caminhamento pós-fixado a esquerda.
		d) Apresentar todos os nós folhas
		e) Liste o pai (Raiz) e seus Filhos
		 * */

		ArvBi<Integer> ab = new ArvBi<>();
		
		ab.addR(5);
		ab.addEsq(ab.bscNo(5), 3);
		ab.addDir(ab.bscNo(3), 4);
		ab.addDir(ab.bscNo(5), 9);
		ab.addEsq(ab.bscNo(9), 7);
		ab.addDir(ab.bscNo(9), 11);
		
		System.out.println("Caminhamento Central");
		ab.exibirOrdem(ab.getRz());
		System.out.println("\nCaminhamento Pré-ordem");
		ab.exibirPreOrdem(ab.getRz());
		System.out.println("\nCaminhamento Pós-ordem");
		ab.exibirPosOrdem(ab.getRz());
		System.out.println();
		System.out.println("Nós folhas");
		ab.exibirNoFolhas(ab.getRz());
		System.out.println();
		System.out.println("Pai(raiz) e filhos");
		ab.exibirPaiFilho(ab.getRz());
	}
	
}