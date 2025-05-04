package cafeestruturado;

public class Cafezinho {

	public static void main(String[] args) {
		CafePilhado<String> cafepilhadaco = new CafePilhado<>();
		
		System.out.println(cafepilhadaco.eVazia());
		cafepilhadaco.push("Miguel");
		cafepilhadaco.push("Angela");
		cafepilhadaco.push("Isabel");
		cafepilhadaco.pop();
		cafepilhadaco.push("Vitor");
		cafepilhadaco.pop();
		cafepilhadaco.push("Paulo");
		System.out.println(cafepilhadaco.eVazia());
		System.out.println("\nListando normal.");
		cafepilhadaco.listar();
		System.out.println("\nListando LIFO");
		cafepilhadaco.listarLIFO();
		
		
	}
	
	

	
	
}
