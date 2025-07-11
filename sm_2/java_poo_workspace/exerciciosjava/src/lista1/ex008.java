package lista1;
import java.util.*;
public class ex008 {

	public static void main(String[] args) {
		/*8) A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programa em Java que 
receba o enquadramento do professor e a quantidade de horas trabalhadas, calcule e exiba o salário do 
professor. Sabe-se que o valor da hora/aula segue a tabela abaixo:
Enquadramento Valor da hora/aula
Nível 1 R$12,00
Nível 2 R$17,00
Nível 3 R$25,00
		 * */
		
		int nivel = new Scanner(System.in).nextInt();
		int htb = new Scanner(System.in).nextInt();

		switch(nivel) {
		case 1: 
			System.out.print("O salario é: R$"+(htb*12));
			break;
		case 2:
			System.out.print("O salario é: R$"+(htb*17));
			break;
		case 3:
			System.out.print("O salario é: R$"+(htb*25));
			break;
		default:
			System.out.print("Não existe esse nivel.");
			break;
		}
	}

}
