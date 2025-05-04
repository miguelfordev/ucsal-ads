package pilha;

public class TestaMyPilha {

	public static void main(String[] args) {
		PilhaEstatica<Integer> pilha = new PilhaEstatica<>(3);
		
		pilha.push(10);
		pilha.push(20);
		pilha.pop();
		pilha.push(30);
		pilha.push(40);
		pilha.push(50);
		System.out.println(pilha.getTopo().getValor());
		System.out.println(pilha.listar());

	}

}
