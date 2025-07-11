package lista_00;

public class ex010 {

	public static void main(String[] args) {
		int div;
		for(int i=1;i<=50;i++) {
			div=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					div++;
				}
			}
			if(div==2) {
				System.out.println(i+" é primo");
			}
		}

	}

}
