package lista1;
import java.util.Scanner;
public class ex006 {

	public static void main(String[] args) {
		/*6) As maçãs custam R$ 0,30 cada se forem compradas menos do que uma dúzia, e R$ 0,25 se forem 
compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e 
escreva o valor total da compra.
		 * */

		System.out.print("Digite a qtd de maças: ");
		int m = new Scanner(System.in).nextInt();
		double valor;
		if(m>11) {
			valor = m*0.25;
		} else {
			valor = m*0.30;
		}
		System.out.print("O valor total da compra é: "+valor);
		
	}

}
