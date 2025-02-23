package lista_00;

public class ex006_1 {

	String nome;
	double altura;
	Character sexo;

	
	public String toString() {
		return "Nome: " + nome + ", altura: " + altura + " e sexo: " + sexo;
	}

	public double pesoIdeal() {
		double pesoIdeal;
		if(this.sexo.equals('F')) {
			pesoIdeal = (62.1*altura)-44.7;
			return pesoIdeal;
		} else {
			pesoIdeal = (72.7*altura)-58;
			return pesoIdeal;
		}
	}
}
