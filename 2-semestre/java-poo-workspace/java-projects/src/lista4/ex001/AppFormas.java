package lista4.ex001;

public class AppFormas {
	
	public static void main(String[] args) {
		Circulo circ=new Circulo(2, 2, 5);
		Retangulo ret=new Retangulo(2, 6, 2, 3);
		
		System.out.println(circ.perimetro()+" - "+circ.area());
		System.out.println(ret.perimetro()+" - "+ret.area());
	}
	
}
