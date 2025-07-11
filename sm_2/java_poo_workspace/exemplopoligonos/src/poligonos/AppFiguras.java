package poligonos;

public class AppFiguras {

	public static void main(String[] args) {
		Figura[] fig=new Figura[3];
		
		fig[0]=new Circulo(3);
		fig[1]=new Quadrado(2);
		fig[2]=new TrianguloRetangulo(2,3);
		
		for(int i=0;i<fig.length;i++) {
			System.out.println(fig[i].getArea());
		}

	}

}
