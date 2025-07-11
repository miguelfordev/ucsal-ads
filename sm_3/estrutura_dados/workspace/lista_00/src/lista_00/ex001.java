package lista_00;

public class ex001 {

	public static void main(String[] args){
		Maior(2,2);
		
	}
	
	public static void Maior(int n1,int n2) {
		if(n1>n2) {
			System.out.println(n1+" é maior."); 
		} else  if (n2>n1){
			System.out.println(n2+" é maior.");
		} else {
			System.out.println("Os números são iguais.");
		}
	}
}
