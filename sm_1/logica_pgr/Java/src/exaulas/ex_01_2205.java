package exaulas;
import java.util.Scanner;
import exaulas.questao_aula_07_06;
public class ex_01_2205 {

	public static void main(String[] args) {
		/* Faca um programa que receba 10 nomes solicite ao usuario um nome e posterioremente
		 * o encontre no vetor. Mostre ao usuario a posicao que o nome foi armazenado dentro do vetor.
		 * Depois pergunte ao usuario um nome e localize-o no vetor.
		 * Caso o nome não seja localizado o usuario deve informar outro nome "tente novamente". 
		 * Essa rotina deve se repetir até que o nome seja localizado.
		 * Metodos: preencher, mostrar e localizar.
		 */

		
		/*String[] nomes = new String[2];
		preencher(nomes);
		localizar(nomes);*/
		testando();

	}
	
	public static void preencher(String[] captarnome) {
		for(int c=0;c<captarnome.length;c++) {
			System.out.print("Digite um nome: ");
			captarnome[c] = new Scanner(System.in).next().toLowerCase();
			mostrar(captarnome, c);
		}
	}
	
	public static void mostrar(String[] mostrarnome, int p) {
			System.out.print("Nome armazenado na "+(p+1)+"ª posição. \n");
	}
	
	public static void localizar(String[] nomes) {
		boolean resposta = false;
		while(true) {
			System.out.print("Informe o nome para localizar: ");
			String nome = new Scanner(System.in).next().toLowerCase();
			for(int v=0;v<nomes.length;v++) {
				if(nomes[v].equals(nome)) {
					resposta = true;
				}
			}
			if(resposta==true) {
				System.out.print("Esse nome está contido no vetor.\nFim do programo \n");
				break;
			} else {
				System.out.print("O nome digitado não está no vetor. Tente novamente.\n");
			}
		}
	}
	
	public static void testando() {
		int num = 1;
		questao_aula_07_06 atividade = new questao_aula_07_06();
		num = atividade.numero;
		System.out.print(num+" \n");
		atividade.numero = 10;
		num = atividade.numero;
		System.out.print(num+" ");
	}

	public static void cadastrarUsuario() {}
	
	public static void geradorDeNumeroAleatorio() {}
}
