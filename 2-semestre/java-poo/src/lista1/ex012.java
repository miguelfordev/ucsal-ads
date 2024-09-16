package lista1;
import java.util.Scanner;
public class ex012 {

	public static void main(String[] args) {
		/*12) Faça um programa que receba vários números positivos, calcule e mostre:
a) a soma dos números digitados;
b) a quantidade de números digitado;
c) a média dos números digitados;
d) o maior número digitado;
e) o menor número digitado;
f) a média dos números pares
		 * */
		int n=1,soma=0,qtd=1,maior=0,menor=0,par=0,qtdpar=0;
		System.out.print("Numero > 0: "); n=new Scanner(System.in).nextInt();
		maior=n;
		menor=n;
		while(n>0) {
			System.out.print("Numero > 0: "); n=new Scanner(System.in).nextInt();
			if(n%2==0) {
				par += n;
				qtdpar +=1;
			}
			
			if(n>maior) {
				maior = n;
			} else {
				if(n<menor) {
					menor = n;
				}
			}
			soma += n;
			qtd+=1;	
		}
		System.out.print("a- "+soma);
		System.out.print("b- "+qtd);
		System.out.print("c- "+(soma/qtd));
		System.out.print("d- "+maior);
		System.out.print("e- "+menor);
		System.out.print("f- "+(par/qtdpar));

	}

}
