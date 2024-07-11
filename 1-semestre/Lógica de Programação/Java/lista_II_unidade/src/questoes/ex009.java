package questoes;
import java.util.Scanner;
public class ex009 {

	public static void main(String[] args) {
		/* 9) Faça um programa que receba o nome e a idade de 20 pessoas e armazene em dois 
			vetores. Uma vez preenchidos os vetores, o programa deve calcular a média das idades 
			e listar os nomes das pessoas que têm idade acima da média. */
		
		Scanner sc = new Scanner(System.in);
		String nome[] = new String[20];
		int idades[] = new int[20];
		int i,soma=0,media;
		for(i=0;i<3;i++) {
			System.out.print("Digite o nome: ");
			nome[i] = sc.next();
			System.out.print("Digite a idade: ");
			idades[i] = sc.nextInt();
			soma += idades[i];
		}
		media = soma/3;
	    for(i=0;i<3;i++) {
	        if(idades[i]>media) {
	        	System.out.println(nome[i]);
	        }
	    }
	    
	    
		
	}

}
