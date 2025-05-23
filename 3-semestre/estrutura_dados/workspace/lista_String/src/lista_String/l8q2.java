package lista_String;

import java.util.Scanner;

public class l8q2 {

	public static void main(String[] args) {
		/* 2. Implemente uma urna eletrônica. Inicialmente o programa deve receder o nome dos 5
candidatos cujos identificadores vão de 1 a 5. O número do candidato deve ser usado como
índice no vetor onde os nomes vão ser armazenados. Uma vez armazenados os nomes dos
candidatos, o programa deve começar a receber os votos dos eleitores. Um menu deve ser
mostrado na tela como segue:
(0) BRANCO
(1) Nome do candidato 1
(2) Nome do candidato 2
(3) Nome do candidato 3
(4) Nome do candidato 4
(5) Nome do candidato 5
		 * */
		
		menu();

	}
	
	public static void menu() {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=6) {
			String menu = """
==== MENU VOTAÇÃO ====
1 - Cand. 1
2 - Cand. 2
3 - Cand. 3
4 - Cand. 4
5 - Cand. 5
6 - Sair.
Opção:
					""";
			System.out.println(menu);
			System.out.println(" ---- MENU ---- \n 1-Opção\n2-Opção");
			op = sc.nextInt();
		}
	}

}
