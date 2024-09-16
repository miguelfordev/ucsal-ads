package lista1;
import java.util.Scanner;
public class Ex003 {

	public static void main(String[] args) {
		/* Faça um programa em Java que receba 3 notas de um aluno e seus respectivos pesos, calcule e informe a
média ponderada. */
		
		double n1,n2,n3;
		System.out.print("Digite a nota 1: ");
		n1 = new Scanner(System.in).nextDouble();
		System.out.print("Digite o peso da nota: ");
		int p1= new Scanner(System.in).nextInt();
		
		System.out.print("Digite a nota 2: ");
		n2 = new Scanner(System.in).nextDouble();
		System.out.print("Digite o peso da nota: ");
		int p2= new Scanner(System.in).nextInt();
		
		System.out.print("Digite a nota 3: ");
		n3 = new Scanner(System.in).nextDouble();
		System.out.print("Digite o peso da nota: ");
		int p3= new Scanner(System.in).nextInt();
		
		double resultado = ((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3); 
		System.out.print("A media ponderada é: "+resultado);
		
	}

}
