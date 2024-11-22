package trabalho2unidade;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Item[] i = new Item[5];
		i[0] = new Acessorio("Brinco", 7, 4, 10);
		i[1] = new RoupaTamanhoUnico("Blusa Branca", 8, 5, 12);
		i[2] = new RoupaPMG("Casaco Preto", 3, 7, 4, 2, 10);
		i[3] = new RoupaPMG("Camisa Polo", 4, 8, 7, 2, 15);
		i[4] = new RoupaPMG("Calça Jeans", 5, 8, 4, 3, 10);
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
			try {
				if (op != 5) {
					menuEscolha(op, i[op], sc);
				}				
			} catch (Exception e){
				System.out.println("Opção incorreta.");

			}
			System.out.println("\n->-> Produtos em Estoque <-<-");
			for (int c = 0; c < i.length; c++) {
				mostraEstoque(c, i[c]);
				System.out.println("");
			}
			System.out.println();
		} while (op != 5);
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
					"%d - %s / Quantidade em estoque Total: %d, P: %d, M: %d, G: %d / O estoque Total foi reabastecido: %d vez(es). P: %d vez(es), M: %d vez(es), G: %d vez(es).", c,
					i.getDescricao(), i.getQuantidade(),((RoupaPMG) i).getQuantidadeP(), ((RoupaPMG) i).getQuantidadeM(), ((RoupaPMG) i).getQuantidadeG(), i.getControleEstoque(), ((RoupaPMG) i).getControleEstoqueP(), ((RoupaPMG) i).getControleEstoqueM(), ((RoupaPMG) i).getControleEstoqueG());
		} else {
			System.out.printf("%d - %s / Quantidade em estoque: %d / O estoque foi reabastecido: %d vez(es).", c,
					i.getDescricao(), i.getQuantidade(), i.getControleEstoque());		
		}
	}

}
