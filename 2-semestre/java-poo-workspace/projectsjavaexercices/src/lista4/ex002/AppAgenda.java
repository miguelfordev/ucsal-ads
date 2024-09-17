package lista4.ex002;
import java.util.Scanner;
public class AppAgenda {

	public static void main(String[] args) {
		menu();		
	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		Agenda ag = new Agenda();
		int op = 0;
		do {
			System.out.print("\n---- AGENDA MALUCA ----\n1-Adcionar Contato\n2-Consultar Contato\n3-Listar Aniversariante\n4-Listar Contatos\n5-Sair\nOpção: ");
			op = sc.nextInt();
			switch(op) {
			case 1: ag.adicionarContato();
					System.out.println("\nContato Adicionado!\n");
					break;
			case 2: ag.consultarContato();
					break;
			case 3: ag.listarAniversariante();
					break;
			case 4: ag.listarContatos();
					break;
			case 5: System.out.print("\nVolte sempre a sua Agenda doida!");
					break;
			default:System.out.print("\nOpção inválida.\n");
			}
			
		} while (op!=5);
	}
}
