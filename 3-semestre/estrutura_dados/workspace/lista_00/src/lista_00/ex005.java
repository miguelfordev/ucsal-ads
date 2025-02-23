package lista_00;
import java.util.Scanner;
public class ex005 {

	public static void main() {
		String[] estoque = new String[5];
		add(estoque);
		System.out.println(estoque[1]);
	}
	
	public static void add(String[] vt) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do produto, qtd min e qtd max, nessa ordem.");
		vt[0] = sc.next();
		vt[1] = sc.next();
		vt[2] = sc.next();
	}
	
	
}
