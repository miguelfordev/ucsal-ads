package atividade_avaliativa_1_0;

public class Disciplina_Q1_TAD implements ICursos_Q1_TAD{

	public String nomeDisciplina;
	public String nomeProfessor;
	public double mediaNota;
	
	@Override
	public String getNomeDisciplina() {
		// TODO Auto-generated method stub
		return this.nomeDisciplina;
	}
	@Override
	public String setNomeDisciplina(String nome) {
		// TODO Auto-generated method stub
		return this.nomeDisciplina=nome;
	}
	@Override
	public String getNomeProfessor() {
		// TODO Auto-generated method stub
		return this.nomeProfessor;
	}
	@Override
	public String setNomeProfessor(String nome) {
		// TODO Auto-generated method stub
		return this.nomeProfessor=nome;
	}
	@Override
	public double getNotas() {
		// TODO Auto-generated method stub
		return this.mediaNota;
	}
	@Override
	public double setNotas(double nota) {
		// TODO Auto-generated method stub
		return this.mediaNota=nota;
	}
}
