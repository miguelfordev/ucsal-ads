package lista_02;

public class Ex004 {

	public static void main(String[] args) {
		/*4 - Faça um programa em java fazendo uso da recursividade que solicite para o
usuário digitar um número, em seguida, faça a soma de todos os algarismos do
número. Exemplos:
1981 = 1 + 9 + 8 + 1
2020 = 2 + 0 + 2 + 0*/

		System.out.println(soma(2020));
	}
	
	public static int soma(int n) {
		if(n==0) {
			return 0;
		} else {
			return (n%10) + soma(n/10);
		}
	}

}
