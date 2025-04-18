package ldeq4;

import java.util.Scanner;

public class TestaLDE {

	public static void main(String[] args) {
		LDE<Integer> lde = new LDE<>();
		menu(lde);

	}

	public static <T> void listar(LDE<Integer> lde) {
		while (lde.tP()) {
			System.out.println(lde.getpA().getValor());
		}
	}

	public static <T> void menu(LDE<Integer> lde) {
		Scanner sc = new Scanner(System.in);
		int op = 0, n = 0;
		while (op != 6) {
			String opcoes = """
					--- MENU ---
					1. Adicionar um numero IMPAR ao inicio.
					2. Adicionar um numero IMPAR ao final.
					3. Remover um numero do inicio.
					4. Remover um numero do final.
					5. Listar todos os números da lista.
					6. Sair.
					Opção:
					""";
			System.out.print(opcoes);
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite um numero: ");
				n = sc.nextInt();
				if (n % 2 == 1) {
					lde.addI(n);
					System.out.println("Adicionado com sucesso.");
				} else {
					System.out.println("Não foi adicionado.");
				}
				break;
			case 2:
				System.out.println("Digite um numero: ");
				n = sc.nextInt();
				if (n % 2 == 1) {
					lde.addF(n);
					System.out.println("Adicionado com sucesso.");
				} else {
					System.out.println("Não foi adicionado.");
				}
				break;
			case 3:
				lde.delI();
				System.out.println("Removido do incio com sucesso.");
				break;
			case 4:
				lde.delF();
				System.out.println("Removido do final com sucesso.");
				break;
			case 5:
				System.out.println("A lista tem os seguintes números: ");
				listar(lde);
				break;
			case 6:
				System.out.println("Volte sempre.");
				sc.close();
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
	}

}
