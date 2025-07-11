package atv_fila;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Testa_fila {

	public static void main(String[] args) {
		Fila<String> fila = new Fila<>();
		Queue<String> fila2 = new LinkedList<String>();
		
		fila.push("Miguel");
		fila.push("Angela");
		fila.push("Tauan");
		fila.push("Vitor");
		System.out.println("Fila completa.");
		printfila(fila);
		fila.pop();
		fila.pop();
		fila.pop();
		System.out.println("\nFila removendo até sobrar um.");
		printfila(fila);
		
		
		System.out.println("\nFila com Queue.");
		fila2.add("Aluno 4");
		fila2.add("Aluno 3");
		fila2.remove();
		fila2.add("Aluno 2");
		fila2.add("Aluno 5");
		System.out.println("Tamanho da fila: "+fila2.size());
		Iterator<String> it = fila2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
	
	public static void printfila(Fila<String> fila) {
		while(fila.hasnext()) {
			System.out.println(fila.getpA().getValor());
		}
	}

}
