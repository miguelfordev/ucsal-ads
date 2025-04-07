package atividade_0304;
import java.util.Scanner;
public class TestaListaEncadeada {

	public static void main(String[] args) {
		ListaDEncadeada<Integer> list = new ListaDEncadeada<>();
		//menu(list);
		list.inserirEsquerda(10);
		list.inserirEsquerda(9);
		list.inserirEsquerda(8);
		list.inserirEsquerda(7);
		while(list.temProximo()) {
			System.out.println(list.getPosicaoAtual().getDado());
		}
		System.out.println();
		while(list.temAnterior()) {
			System.out.println(list.getPosicaoAtual().getDado());
		}
	}
	
	public static void menu(ListaDEncadeada<Integer> list) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=6) {
			System.out.println(" -- MENU -- \n1-add direita 2-add Esquerda 3-rem D  4-rem E 5-imp 6-sair: \nop:");
			op = sc.nextInt();
			switch(op) {
			case 1: System.out.println("Numero: ");
					op = sc.nextInt();
					list.inserirDireita(op);
					break;
			case 2: System.out.println("Numero: ");
					op = sc.nextInt();
					list.inserirEsquerda(op);
					break;
			case 3: 
					list.removerListaDireita();
					break;
			case 4: 
					list.removerListaEsquerda();
					break;
			case 5: list.listarListaImprimir();
					menu(list);
					break;
			case 6: System.out.println("Volte sempre");
					break;
			default: System.out.println("opcao invalida.");
			}
		}
		sc.close();
		System.exit(0);
	}

}
