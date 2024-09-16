package lista3.ex001;
import java.util.Scanner;
public class AppPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ProgressaoAritmetica pa = new ProgressaoAritmetica(3,5);
		System.out.println("Digite os n primeiro termos: "); int n = sc.nextInt();
		termos(n,pa);
		
		int pt = sc.nextInt();
		pa.setPT(pt);
		termos(n,pa);
		int r = sc.nextInt();
		pa.setR(r);
		termos(n,pa);
	}
	
	public static void termos(int n, ProgressaoAritmetica pa) {		
		for(int i=0;i<n;i++) {
			int x = pa.prxTermo();
			System.out.println("TA: "+x);
		}
	}
	

}
;