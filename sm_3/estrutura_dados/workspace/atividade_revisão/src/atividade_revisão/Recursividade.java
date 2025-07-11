package atividade_revisão;

public class Recursividade {

	public static void main(String[] args) {
		
		System.out.println(pot(5,3));

	}
	
	public static int pot(int n1, int n2) {
		if(n2==0) {
			return 1; 
		} else {
			return n1*pot(n1,n2-1);
		}
	}

}
