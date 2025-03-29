package lista_LE;
import java.util.Scanner;
public class TestaListaEncadeada {

	public static void main(String[] args) {
		
		ListaEncadeada<Valor> listaEncadeada = new ListaEncadeada<>();
		
		
		menu(listaEncadeada);
	}
	
	public static void menu(ListaEncadeada listaEncadeada) {
		Scanner sc = new Scanner(System.in);
		
		int op=0;
		while(op!=5) {
			System.out.println("\n    -- MENU --   ");
			System.out.println("Digite op:\n1-Add\n2-Remove\n3-Tamanho\n4-Lista Carros\n5-Sair\n");
			op = sc.nextInt();
			switch(op){
				case 1:	System.out.println("ID, Nome do veiculo: ");
						int id = sc.nextInt();
						String nome = sc.next().toLowerCase().trim();
						Valor valor = new Valor(id,nome);
						listaEncadeada.adicionar(valor);
						break;
				case 2: System.out.println("ID, Nome do veiculo: ");
						id = sc.nextInt();
						nome = sc.next().toLowerCase().trim();
						valor = new Valor(id,nome);
						listaEncadeada.remover(valor);
						break;
				case 3: int tamanho = listaEncadeada.tamanho();
						System.out.println("O tamanho da lista é: "+tamanho);
						break;
				case 4: mostrarLista(listaEncadeada);
						break;
				case 5: System.out.println("volte sempre"); 
						break;
				default: System.out.println("Opção invalida");		
			}
		}
		
	}
	
	public static void mostrarLista(ListaEncadeada listaEncadeada) {
		
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getId());
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
	}
	
	
	

}
