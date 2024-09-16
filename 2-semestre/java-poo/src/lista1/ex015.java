package lista1;
import java.util.Scanner;
public class ex015 {

	public static void main(String[] args) {
		/*15) Faça um programa que receba uma string e mostre-a na vertical.
Exemplo: palavra = “agora” -> a
 g
 o
 r
 a*/

		String nome="";
		System.out.print("Nome: "); nome=new Scanner(System.in).next();
		char vetor[]=new char[nome.length()];
		for(int i=0;i<nome.length();i++) {
			vetor[i]=nome.charAt(i);
		}
		for(int i=0;i<vetor.length;i++) {
			System.out.println(vetor[i]);
		}
	}

}
