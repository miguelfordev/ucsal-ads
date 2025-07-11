package lista_pilha;

public class q4_main {

	public static void main(String[] args) {
		/*4. Projete uma estrutura do tipo pilha para guardar informações de páginas da
web visitadas.
a) Escreva a função inicializarPilha
b) Escreva a função push para adicionar um elemento à pilha.
c) Escreva a função pop para remover*/
		
		q4_MyPilha<String> pilha = new q4_MyPilha<>();
		pilha.inicializarPilha();
		pilha.push("Pagina A");
		pilha.push("Pagina B");
		pilha.pop();
		System.out.println(pilha.peek());

	}

}
