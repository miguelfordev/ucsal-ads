package model;

public class ClasseSingleton {

	private static ClasseSingleton instance = null;
	
	private ClasseSingleton() {
		// TODO IMPLEMENTAR
	}
	
	public static ClasseSingleton getInstance() {
		if(instance == null) {
			instance = new ClasseSingleton();
		}
		return instance;
	}
	
}
