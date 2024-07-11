package questoes;
import java.util.Scanner;
public class ex005 {

	public static void main(String[] args) {
		/* 5) Faça uma função que receba por parâmetro uma palavra e mostre na tela a palavra na 
			vertical.*/
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.print("Digite um nome: ");
		nome = sc.next();
		vertical(nome);
	}
	
	public static void vertical(String nome) {
		int i;
		for(i=0;i<nome.length();i++) {
			System.out.println(nome.charAt(i));
		}
	}

}
