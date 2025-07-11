package atividade_avaliativa_1_0;

public class Recursao_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(somaNat(5));
	}
	
	public static int somaNat(int n) {
		if(n==1) {
			return 1;
		} else {
			return somaNat(n-1) + n;
		}
	}

}
