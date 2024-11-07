package poligonos;

public class Circulo implements Figura {
	protected int raio;
	
	public Circulo(int raio) {
		this.raio=raio;
	}
	
	public double getArea() {
		return 3.14*this.raio*this.raio;
	}
}
