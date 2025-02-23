package lista_00;

public class ex002 {

	public static void main(String[] args) {
		maior_menor(3,5);

	}

	public static void maior_menor(int n1,int n2) {
		if(n1==n2) {
			System.out.println(n1+" = "+n2);
		} else {
			System.out.println(n1+" != "+n2);
			if(n1>n2) {
				System.out.println(n1+" > "+n2);
			} else {
				System.out.println(n2+" > "+n1);
			}
		}
		
		
	}
}
