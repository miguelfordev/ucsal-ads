package lista_02;

public class Aluno implements IFaculdade{

	String nome;
	int sem;
	
	public Aluno(String nome, int sem) {
		this.nome = nome;
		this.sem = sem;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public int getSem() {
		// TODO Auto-generated method stub
		return this.sem;
	}
	
	
}
