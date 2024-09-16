package lista1;
import java.util.Scanner;
public class ex016 {

	public static void main(String[] args) {
		/*16) Faça um programa que receba o nome e a idade de 20 pessoas e armazene em dois vetores. Uma vez 
preenchidos os vetores, o programa deve calcular a média das idades e listar os nomes das pessoas que têm 
idade acima da média.
*/
		String nome[] = new String[20];
		int idade[]=new int[20];
		int soma=0,media=0;
		for(int i=0;i<20;i++) {
			nome[i] = new Scanner(System.in).next();
			idade[i] = new Scanner(System.in).nextInt();
			soma += idade[i];
		}
		media = soma/20;
		for(int i=0;i<20;i++) {
			if(idade[i]>media) {
				System.out.print("Nome: "+nome[i]);
			}
		}
		
		
	}

}
