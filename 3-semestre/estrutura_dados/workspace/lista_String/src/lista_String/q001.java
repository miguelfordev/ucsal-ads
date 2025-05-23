package lista_String;
import java.util.Scanner;
public class q001 {

	public static void main(String[] args) {
		
		/*Faça uma função que receba por parâmetro uma palavra e uma
	substring e retorne a palavra sem a substring.
		 * */
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("Digite a palavra: ");
		String palavra1 = sc.next().toLowerCase();
		// Paralelepipedo = Plelepipedo
		String palavra2 = palavra1.substring(1,4);
		System.out.println(palavra(palavra1,palavra2));
		
	}
	
	public static String palavra(String p, String sub) {
		String resp;
		
		// P a r a l e l e p i  p  e  d  o
		// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
		// a r a
		// 1 2 3
		
		int a, b;
		// int a == 1;
		a = p.indexOf(sub);
		// int b == a (1) + sub (3) -----> 4
		b = a + sub.length();
		//          0 -> (1-1)        +          4 -> (14-1)
		//            P               +          lelepipedo
		resp = p.substring(0, a) + p.substring(b, p.length());
		
		return resp;
	}

}
