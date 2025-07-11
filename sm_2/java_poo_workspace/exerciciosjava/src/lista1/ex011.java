package lista1;
import java.util.Scanner;
public class ex011 {

	public static void main(String[] args) {
		/*11) Escreva um programa para ler o nome do cliente e o saldo inicial de uma conta bancária. A seguir ler um 
número indeterminado de pares de valores indicando respectivamente o tipo da operação (codificado da 
seguinte forma: 1.Depósito 2.Retirada 3.Fim) e o valor. Quando for informado para o tipo o código 3, o 
programa deve ser encerrado e impresso o saldo final da conta com as seguintes mensagens: CONTA ZERADA, 
CONTA ESTOURADA(se o saldo for negativo) ou CONTA PREFERENCIAL (se o saldo for positivo)*/

		System.out.print("Nome: "); String nome=new Scanner(System.in).nextLine();
		System.out.print("Saldo: "); double saldo=new Scanner(System.in).nextDouble();
		int op=0;
		while(op!=3) {
			System.out.println("- MENU -\n1-Deposito \n2-Retirada\n3-Fim"); op=new Scanner(System.in).nextInt();
			switch(op) {
			case 1: System.out.print("Quantia: "); double qt=new Scanner(System.in).nextDouble();
					saldo = saldo+qt;
				break;
			case 2: System.out.print("Quantia: "); qt=new Scanner(System.in).nextDouble();
				saldo = saldo-qt;
				break;
			}
		}
		if(saldo==0) {
			System.out.print("CONTA ZERADA: R$"+saldo);
		} else {
			if(saldo<0) {
				System.out.print("CONTA ESTOURADA: R$"+saldo);
			} else {
				System.out.print("CONTA PREFERENCIAL: R$"+saldo);
			}
		}
		
	}

}
