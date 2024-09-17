package lista1;
import java.util.Scanner;
public class ex005 {

	public static void main(String[] args) {
		/* 5) Faça um algoritmo em Java que receba a idade de uma pessoa e informe em qual das categorias se
enquadra em relação à obrigatoriedade do voto:
• Sem permissão para votar (0 a 15 anos)
• Voto facultativo (16 a 17 anos, acima de 65 anos)
• Voto obrigatório (18 a 64 anos)
		  */

		int idade;
		
		System.out.print("Digite a idade: ");
		idade = new Scanner(System.in).nextInt();
			
		if(idade<=15) {
			System.out.print("Sem permissão de votar");
		} else {
			if (idade>=18 && idade<=65) {
				System.out.print("Voto obrigatorio");
			} else {
				System.out.print("Voto Facultativo");
			}
		}
		
	}

}
