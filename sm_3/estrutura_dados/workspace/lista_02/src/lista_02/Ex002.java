package lista_02;

public class Ex002 {

	public static void main(String[] args) {
		/*2 - Desenvolva um programa em java que calcule o fatorial de um número x.*/

		System.out.println(fat(4));
	}
	
	public static int fat(int x) {
        if (x == 0) {
        	return 1;
		} else {
			return x * fat(x - 1);			
		}
    }

}
