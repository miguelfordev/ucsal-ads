package atv_fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class challenge_level1 {

	public static void main(String[] args) {
		/*Faca um programa em java que receba do usuário números.
O usuário pode informar quantos números quiser, até apertar -1.
Com essa entrada, você deverá verificar a lista de números inseridos e:
Se o número for primo, devera inserir em uma fila e se não for primo, deverá
inserir em uma pilha.
No final, deverá ser apresentado ao usuário os elementos da pilha e da fila.*/
		
		Queue<Integer> fila = new LinkedList<>();
		Stack<Integer> pilha = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int op=0;
		while(op!=-1) {
			System.out.println("Digite o numero: (-1 para ver a lista)");
			op = sc.nextInt();
			if(ehPrimo(op) && op!=-1) {
				fila.add(op);
			} else if(op!=-1){
				pilha.push(op);
			}
			
		}
		System.out.println("\nFila: ");
		Iterator<Integer> it1 = fila.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("\nPilha: ");
		Iterator<Integer> it2 = pilha.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}
	
	public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
