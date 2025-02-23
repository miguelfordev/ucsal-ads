package lista_00;
import java.util.Scanner;
public class ex004 {

	public static void main(String[] args) {
		menu();

	}
	
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int n1,n2,op;
		do {
			System.out.print(" --- Menu ---\n1-Adição\n2-Sub\n3-Mult\n4-Div\n5-Sair\nOp: ");
			op = sc.nextInt();
			switch(op) {
			case 1: System.out.print("Número: ");
					n1 = sc.nextInt();
					System.out.print("Número: ");
					n2 = sc.nextInt();
					System.out.println(soma(n1,n2)); break;
			case 2: System.out.print("Número: ");
					n1 = sc.nextInt();
					System.out.print("Número: ");
					n2 = sc.nextInt();
					System.out.println(sub(n1,n2)); break;
			case 3: System.out.print("Número: ");
					n1 = sc.nextInt(); 
					System.out.print("Número: ");
					n2 = sc.nextInt();
					System.out.println(mult(n1,n2)); break;
			case 4: System.out.print("Número: ");
					n1 = sc.nextInt(); 
					System.out.print("Número: ");
					n2 = sc.nextInt();
					System.out.println(divi(n1,n2)); break;
			}			
		} while(op!=5);
		System.out.println("Volte sempre!");
	}
	
	public static int soma(int n1,int n2) {
		return n1+n2;
	}
	
	public static int sub(int n1,int n2) {
		if(n1>n2) {
			return n1-n2;
		} else {
			return n2-n1;
		}
	}
	
	public static double mult(int n1,int n2) {
		return n1*n2;
	}
	
	public static double divi(int n1,int n2) {
		return n1/n2;
	}

}
