package pilha;
import java.util.Stack;
import java.util.Vector;
public class TestePilha {

	public static void main(String[] args) {
		Vector<Integer> pilhaE = new Vector<>(3);
		Stack<Integer> pilhaD = new Stack<>();
		
		pilhaE.add(10);
		pilhaE.add(20);
		pilhaE.add(30);
		//pilhaE.add(40);
		//pilhaE.add(50);
		//pilhaE.add(60);
		//pilhaE.add(70);
		
		System.out.println(pilhaE.toString());
		System.out.println(pilhaE.isEmpty());
		
		System.out.println(pilhaD.capacity());
		

	}

}
