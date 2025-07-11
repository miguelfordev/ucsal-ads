package exemploarvore;

public class TestaArvore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
		arvoreBinaria.insereRaiz(12);
		arvoreBinaria.insereEsquerda(12, 10);
		arvoreBinaria.insereDireita(12, 14);
		
		arvoreBinaria.insereEsquerda(10, 8);
		arvoreBinaria.insereDireita(14, 16);
		
		System.out.println("Vamos ver se imprime");
		arvoreBinaria.exibePreOrdem();

	}

}
