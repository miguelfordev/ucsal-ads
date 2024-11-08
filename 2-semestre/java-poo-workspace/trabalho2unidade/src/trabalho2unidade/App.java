package trabalho2unidade;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Item[] i = new Item[5];
		i[0] = new Acessorio("Brinco", 50, 25, 50);
		i[1] = new RoupaTamanhoUnico("Blusa Branca", 40, 20, 40);
		i[2] = new RoupaPMG("Casaco Preto", 30, 25, 20, 15, 30);
		i[3] = new RoupaPMG("Camisa Polo", 20, 15, 10, 5, 20);
		i[4] = new RoupaPMG("Calça Jeans", 15, 12, 10, 5, 15);
		menu(sc, i);

	}

	public static void menu(Scanner sc, Item[] i) {
		int op;
		do {
			for (int c = 0; c < i.length; c++) {
				System.out.printf("%d - %s", c, i[c].getDescricao());
				System.out.println();
			}
			System.out.print("5 - Sair do Sistema\n -> Opção desejada: ");
			op = sc.nextInt();
			if (op != 5) {
				menuEscolha(op, i[op], sc);
			}
			limpaTela();
		} while (op != 5);
		System.out.println("->-> Produtos em Estoque <-<-");
		for (int c = 0; c < i.length; c++) {
			mostraEstoque(c, i[c]);
			System.out.println();
		}
	}

	public static void menuEscolha(int op, Item i, Scanner sc) {
		int qt = 0;
		if (i instanceof Acessorio) {
			System.out.println("Quantidade vendia: ");
			qt = sc.nextInt();
			System.out.println(i.venda(qt));
			System.out.println(i.reposicaoEstoque());
		} else {
			if (i instanceof RoupaTamanhoUnico) {
				System.out.println(i.venda(1));
				System.out.println(i.reposicaoEstoque());
			} else {
				if (i instanceof RoupaPMG) {
					System.out.println("1 - Tamanho P\n2 - Tamanho M\n3 - Tamanho G\nOpção:");
					qt = sc.nextInt();
					System.out.println(i.venda(qt));
					System.out.println(i.reposicaoEstoque());
				}
			}
		}
	}

	public static void mostraEstoque(int c, Item i) {
		if (i instanceof RoupaPMG) {
			System.out.printf(
					"%d - %s / Quantidade em estoque Total: %d, P: %d, M: %d, G: %d / O estoque foi reabastecido: %d vez(es).", c,
					i.getDescricao(), i.getQuantidade(),((RoupaPMG) i).getQuantidadeP(), ((RoupaPMG) i).getQuantidadeM(), ((RoupaPMG) i).getQuantidadeG(), i.getControleEstoque());
		} else {
			System.out.printf("%d - %s / Quantidade em estoque: %d / O estoque foi reabastecido: %d vez(es).", c,
					i.getDescricao(), i.getQuantidade(), i.getControleEstoque());		
		}
	}

	public static void limpaTela() {
		for (int i = 0; i < 11; i++) {
			System.out.println();
		}
	}

}
