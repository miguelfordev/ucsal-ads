package lista2.ex003;

public class Alunos {
	
	String nome;
	int matricula;
	Double n1,n2,nt,media;
	
	
	public void mediaFinal() {
		this.media = (n1*2.5+n2*2.5+nt*2)/7;		
	}

	public double notaFinal() {
		double resultado;
		if(media>7) {
			resultado = 0.0;
			return resultado;
		} else {
			resultado = 7.0-media;
			return resultado;
		}
	}
	
	public static void main(String[] args) {
		/*3) Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
Cada objeto dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 
2 notas de prova e 1 nota de trabalho. Escreva os seguintes métodos para esta classe:
a. media -> calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho 
tem peso 2)
b. final -> calcula quanto o aluno precisa para a prova final (retorna zero se ele 
não for para a final)*/

	}

}
