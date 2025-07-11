package ldeq3;
import java.util.Scanner;
public class TestaLDE {

	public static void main(String[] args) {
		LDE<Aluno> lde = new LDE<>();
		Aluno al6 = new Aluno();
		Aluno al7 = new Aluno();
		cda(lde);
		listar(lde);
		al6.setNome("Eles");
		al6.setIdade(6);
		al7.setNome("Todos");
		al7.setIdade(7);
		lde.addF(al6);
		lde.addI(al7);
		System.out.println("\nLista atualizada: ");
		listar(lde);
		
	}
	
	public static <T> void cda(LDE<Aluno> lde) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			Aluno al = new Aluno();
			System.out.println("Nome: ");
			al.setNome(sc.next());
			System.out.println("Idade: ");
			al.setIdade(sc.nextInt());
			lde.addF(al);
		}
		sc.close();
	}
	
	public static <T> void listar(LDE<Aluno> lde) {
		while(lde.tp()) {
			Aluno al = new Aluno();
			al = lde.getpA().getValor();
			System.out.println("Nome: "+al.getNome()+" Idade: "+al.getIdade());
		}
	}

}
