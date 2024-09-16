package lista1;
import java.util.Scanner;
public class ex007 {

	public static void main(String[] args) {
		/*7) Faça um programa em Java que receba três valores inteiros referentes ao tamanho dos três lados de um 
triângulo. Para formar um triângulo cada lado deve ser menor do que a soma dos outros dois lados. Uma vez 
verificado que os valores estão corretos (ou seja, formam um triângulo) o programa deve classifica-lo em
equilátero (todos os lados iguais), isósceles (dois lados iguais), escaleno (todos os lados diferentes).
		 * */

		int n1,n2,n3;
		System.out.print("Digite os lados do triangulo: ");
		n1 = new Scanner(System.in).nextInt();
		n2 = new Scanner(System.in).nextInt();
		n3 = new Scanner(System.in).nextInt();
		
		if(n1<n2+n3 && n2<n1+n3 && n3<n1+n2 ) {
			System.out.print("Forma triangulo");
			if(n1==n2 && n2==n3) {
				System.out.print("->Equilatero");
			} else {
				if(n1!=n2 && n2!=n3 && n3!=n1) {
					System.out.print("->Escaleno");
				} else {
					System.out.print("->Isosceles");
				}
			}
		} else {
			System.out.print("Nao forma triangulo");
		}
		
	}

}
