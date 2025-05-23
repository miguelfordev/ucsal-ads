package lista_String;

import java.util.Random;
import java.util.Scanner;

public class l8q1 {

	public static void main(String[] args) {
		// Criando meu vetor de nomes
		String[] vetornomes = new String[5];
		// Criando meu vetor de idades
		int[] vetoridades = new int[5];
		// Chamando meu metodo preencher (p) e passando por parametros os dois vetores
 		p(vetornomes,vetoridades);
 		// Chamando meu metodo mostrarresultado e passando por parametro dois vetores e 
 		// chamando outro metodo para retornar a media do meu vetor de idades passado por parametro.
		mostrarresultado(vetornomes,vetoridades,calcularMedia(vetoridades));
		
		System.exit(0);
		
	}
	
	// metodo que mostra o resultado aceitando como parametro o vetor de nomes e idades mais a media.
	private static void mostrarresultado(String[] vetornomes, int[] vetoridades, double media) {
		//percorrendo o meu vetor de nomes
		for(int i=0;i<vetornomes.length;i++) {
			// verificando minha condição para mostrar apenas os nomes acima da media
			if(vetoridades[i]>media) {
				System.out.println("Nome: "+vetornomes[i]+" Idade: "+vetoridades[i]);
			}
		}
	}

	public static void p(String[] vn, int[] vi) {
		// Instanciando o Scanner
		Scanner sc = new Scanner(System.in);
		// Instanciando o Random
		Random rd = new Random();
		// Percorrendo o vetor de nomes
		for(int i=0;i<vn.length;i++) {
			System.out.println("Digite seu nome: ");
			// Captando pelo teclado o nome e salvando no vetor de nomes na posição de i
			vn[i] = sc.next();
			// Gerando aleatoriamente numeros de 1 a 70 e salvando no vetor de idades na posição de i
			vi[i] = rd.nextInt(1,70);
		}
		//Fechando o Scanner
		sc.close();
	}
	
	public static double calcularMedia(int[] vi) {
		double media,soma_das_idades=0;
		for(int i=0;i<vi.length;i++) {
			soma_das_idades += vi[i];
		}
		media = soma_das_idades/vi.length;
		return media;
	}

}
