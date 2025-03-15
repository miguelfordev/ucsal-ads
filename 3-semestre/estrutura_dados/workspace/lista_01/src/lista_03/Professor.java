package lista_03;

public class Professor implements IFaculdade {
	
	String nome;
	int cod_disc;
	
	public Professor(String nome, int cod_disc) {
		this.nome = nome;
		this.cod_disc = cod_disc;
	}

	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return this.nome;
	}

	@Override
	public int getCod_disc() {
		// TODO Auto-generated method stub
		return this.cod_disc;
	}
	
	
}
