package desafio;

import java.util.Scanner;

public class TestTree {

	public static void main(String[] args) {
		/*Implemente uma estrutura de árvore que receba 10 números, 
		 * o programa deve verificar se o número é maior do zero. 
		 * Caso o usuário informe um número menor, deverá ser emitida 
		 * uma mensagem para ele. Escolha um modo para consultar 
		 * (pré ordem, central ou pós ordem). 
		 * Monte um menu com as seguintes opções:
1 - Inserir a raiz
2 - Inserir números na árvore
3 - Consultar os números inseridos
4 - Sair.

Observação: O método inserir deve obedecer a regra que se o numero for
 maior do que a raiz, deverá ficar na direita e se for menor do
  que a raiz na esquerda.
		 * */
		
		BinaryTree<Integer> tree = new BinaryTree<>();
		menu(tree);
	}
	
	public static void menu(BinaryTree<Integer> tree) {
		Scanner sc = new Scanner(System.in);
		int op=0,value;
		while(op!=4) {
			String view = """
=== MENU ===
1 - Inserir a raiz
2 - Inserir números na árvore
3 - Consultar os números inseridos
4 - Sair.
Opção: """;
			System.out.println(view);
			op = sc.nextInt();
			switch(op) {
			case 1: 
				do {
				System.out.println("Digite a raiz: ");
				value = sc.nextInt();
				if(value<=0) {
					System.out.println("Valor incorreto.");
				}
				}while(value<=0);
				if(tree.empty()) {
					tree.addRoot(value);
					System.out.println("Raiz adicionada.");
				} else {
					System.out.println("Raiz existente.");
				}
				break;
			case 2:
				do {
					System.out.println("Digite o numeros da arvore (n > 0): ");
					value = sc.nextInt();
					if(value<=0) {
						System.out.println("Valor incorreto.");
					}
					}while(value<=0);
				
					if(value > tree.getRoot().getValue()) {
						tree.addRight(tree.getRoot().getValue(), value);
					} else if(value < tree.getRoot().getValue()) {
						tree.addLeft(tree.getRoot().getValue(), value);
					} else {
						System.out.println("Valor igual a raiz.");
					}
					break;
			case 3:
				System.out.println("\n1-Exibir pré-ordem\n2-Exibir Em ordem\n3-Exibir Pós-ordem\nOpção: ");
				value = sc.nextInt();
				if(value == 1) {
					tree.printPreOrder();
				} else if(value == 2) {
					tree.printInOrder();
				} else if (value == 3) {
					tree.printPosOrder();
				} else {
					System.out.println("Opção incorreta.");
				}
				break;
			case 4:
				System.out.println("Encerrando programa.");
				break;
			default:
				System.out.println("Opção errada.");
			}
		}
		sc.close();
	}

}
