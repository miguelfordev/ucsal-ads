package alison;

public class Alunos {
	private int matricula;
	private String nome;
	private double nota1;
	private double nota2;
	private double notaTrab;
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public void setNotaTrab(double notaTrab) {
		this.notaTrab = notaTrab;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public double getNota1() {
		return nota1;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public double getNotaTrab() {
		return notaTrab;
	}

	public double getMedia() {
		return (this.nota1*2.5)+(this.nota2*2.5)+(this.notaTrab*2)/3;
	}

}