package lista_pilha;

public class q5_main {

	public static void main(String[] args) {
		/*5. Projete uma estrutura de pilha para guardar passo a passo de como efetuar
uma determinada tarefa.
a) Escreva a função criar a pilha
b) Adicione tarefas na pilha
c) Remova tarefas da pilha
d) Indique se a tarefa for concluída quando a pilha estiver vazia.*/
		
		q5_mypilha<String> pilha = new q5_mypilha<>();
		pilha.criarPilha();
		pilha.push("Tarefa 1");
		tarefaConcluida(pilha);
		pilha.pop();
		tarefaConcluida(pilha);

	}
	
	public static void tarefaConcluida(q5_mypilha<String> pilha) {
		if(pilha.empty()) {
			System.out.println("Tarefa concluidas.");
		} else {
			System.out.println("Ainda tem tarefas.");
		}
	}

}
