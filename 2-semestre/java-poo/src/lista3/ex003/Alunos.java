package lista3.ex003;

public class Alunos {
	
	private int matricula;
	private String nome;
	private double n1,n2,tr,media;
	
	public void setAluno(int mat, String nom, double n1, double n2, double tr) {
		this.matricula = mat;
		this.nome = nom;
		this.n1 = n1;
		this.n2 = n2;
		this.tr = tr;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double media() {
		this.media = ((this.n1*2.5)+(this.n2*2.5)+(this.tr*2))/7;
		return this.media;
	}
	
	public double provafinal() {
		if(this.media>=7) {
			return 0;			
		} else {
			return 1;
		}
	}
	
	public String toString() {
		return "Matricula: "+this.matricula+" / Nome: "+this.nome+" / Media: "+this.media;
	}
	
	/*3) Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina.
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome,
2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho
tem peso 2)
b. final -> calcula quanto o aluno precisa para a prova final (retorna zero se ele
não for para a final)

Faça uma aplicação que instancie três objetos do tipo Aluno defina todos os valores de
atributos e ao final informe os nomes dos alunos que vão para a prova final.
	 * */

}
