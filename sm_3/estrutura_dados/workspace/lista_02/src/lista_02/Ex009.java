package lista_02;

public class Ex009 {

	public static void main(String[] args) {
		/*9 – Escreva um método recursivo que calcule a potência de um número, ou
seja, dado dois números inteiros base e expoente, retorne base^expoente sem
usar operadores de multiplicação direta.*/
		
		System.out.println(pot(2,3));

	}
	
	public static int pot(int base, int exp) {
		if (exp==0) {
			return 1;
		} else {
			return base*pot(base,exp-1);
		}
	}
}
