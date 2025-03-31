package program;

import model.ClasseNormal;
import model.ClasseSingleton;

public class Main {

	public static void main(String[] args) {
		
		// PARA CLASSES NORMAIS
		ClasseNormal classe1 = new ClasseNormal("Marcos");
		ClasseNormal classe2 = classe1;
		
		classe2.nome = "João";
		
		System.out.println("Nome1: " + classe1.nome);
		System.out.println("Nome2: " + classe2.nome);
		
		// PARA CLASSES SINGLETON
		
		ClasseSingleton sing1 = ClasseSingleton.getInstance();
		ClasseSingleton sing2 = ClasseSingleton.getInstance();
		
		System.out.println("TESTANDO CLASSE SINGLETON");
		if (sing1 == sing2) {
			System.out.println("=> TRATRA-SE DA MESMA INSTANCIA");
		} else {
			System.out.println("=> NÃO SE TRATA DA MESMA INSTANCIA");
		}
		
		
	}

}
