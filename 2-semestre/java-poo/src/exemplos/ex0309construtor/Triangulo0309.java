package exemplos.ex0309construtor;

public class Triangulo0309 {

	private int l1,l2,l3;
	
	public Triangulo0309(int l1) {
		this.l1 = l1;
		this.l2 = l1;
		this.l3 = l1;
	}
	
	public Triangulo0309(int l1,int l2, int l3) {
		if((l1+l2>l3) && (l2+l3>l1) && (l3+l1>l2)) {
			System.out.println("É triângulo");
			this.l1 = l1;
			this.l2 = l2;
			this.l3 = l3;
		} else {
			System.out.println("Não é triângulo");
			this.l1 = 2;
			this.l2 = 2;
			this.l3 = 2;
		}
	}
	
	public int perimetro() {
		return l1+l2+l3;
	}
	
	public String toString() {
		return this.l1+" - "+this.l2+" - "+this.l3;
	}
}
