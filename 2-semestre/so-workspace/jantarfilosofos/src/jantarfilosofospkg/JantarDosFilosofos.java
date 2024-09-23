package jantarfilosofospkg;

import java.util.concurrent.Semaphore;

//Classe principal do programa
public class JantarDosFilosofos {
	public static void main(String[] args) {
		final int NUM_FILOSOFOS = 5; // Número de filósofos
		Semaphore[] garfos = new Semaphore[NUM_FILOSOFOS]; // Array de semáforos para os garfos

		// Inicializa os semáforos (um para cada garfo)
		for (int i = 0; i < NUM_FILOSOFOS; i++) {
			garfos[i] = new Semaphore(1); // Permite que 1 filósofo pegue o garfo
		}

		// Cria e inicia os filósofos
		for (int i = 0; i < NUM_FILOSOFOS; i++) {
			Filosofo filosofo = new Filosofo(i, garfos[i], garfos[(i + 1) % NUM_FILOSOFOS]);
			filosofo.start(); // Inicia a thread do filósofo
		}
	}
}