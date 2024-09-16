package lista4.ex001;

public class Circulo {
	private int x;
	private int y;
	private int raio;
	
	public Circulo(int x, int y, int raio) {
		this.x=x;
		this.y=y;
		this.raio=raio;
	}
	
	public double perimetro() {
		return 2*3.14*this.raio;
	}
	
	public double area() {
		return 3.14*this.raio*this.raio;
	}
}
