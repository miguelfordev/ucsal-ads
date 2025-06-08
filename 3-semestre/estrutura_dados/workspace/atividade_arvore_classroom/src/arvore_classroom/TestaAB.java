package arvore_classroom;

import java.util.Scanner;

public class TestaAB {

	public static void main(String[] args) {
		ArvoreBinaria<Integer> ab = new ArvoreBinaria<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a raiz: ");
        int n = sc.nextInt();
        ab.adicionarRaiz(n);
        
        boolean exec = true;
        while (exec) {
            System.out.println("Digite um numero: ");
            n = sc.nextInt();
        
            if (n > ab.getRaiz().valor && n > 0) {
                ab.adicionarDireita(ab.getRaiz(), n);
            } else if (n < ab.getRaiz().valor && n > 0) {
                ab.adicionarEsquerda(ab.getRaiz(), n);
            } else {
                System.out.println("Valor não pode ser igual a raiz ou abaixo de 0.");
            }
            
            System.out.println("Continuar? 1-Sim 2-Nao");
            n = sc.nextInt();
            if (n == 2) {
                exec = false;
            }
        }

        System.out.println("Árvore binária (em ordem): ");
        ab.exibir(ab.getRaiz());
        System.out.println("\nÁrvore binária (pre ordem): ");
        ab.exibirPre(ab.getRaiz());
        System.out.println("\nÁrvore binária (pos ordem): ");
        ab.exibirPos(ab.getRaiz());
        sc.close();

	}

}
