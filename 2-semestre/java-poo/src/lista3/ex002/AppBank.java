package lista3.ex002;
import java.util.Scanner;
public class AppBank {

	public static void main(String[] args) {
		Conta Usuario = new Conta();
		Usuario.setUsuario(43211234, "Miguel", 10321);
		menu(Usuario);
	}
	
	
	public static void menu(Conta Usuario) {
		int op=0;
		do{
			System.out.println("\n----- MENU -----\n1-Saque\n2-Deposito\n3-Consultar\n4-Sair\nOpção: ");
			op = new Scanner(System.in).nextInt();
			switch(op) {
			case 1: System.out.println("\n------ SAQUE ------\nDigite o valor: "); double din = new Scanner(System.in).nextDouble();
					Usuario.saque(din);
					System.out.println("\n! Dinheiro retirado. !\n");
					break;
			case 2: System.out.println("\n----- DEPOSITO -----\nDigite o valor: "); double din2 = new Scanner(System.in).nextDouble();
					Usuario.deposito(din2);
					System.out.println("\n! Dinheiro depositado. !\n");
					break;
			case 3: System.out.println("\n----- SALDO ATUAL -----\n");
					double din3 = Usuario.consultar();
					System.out.println("Saldo: R$"+din3);
					break;
			case 4:
				System.out.println("\n ---- VOLTE SEMPRE ----");
				break;
			default:
				System.out.println("\n !! Por favor, digite uma opção válida. !!\n");
			}
		} while(op!=4);
	}
}
