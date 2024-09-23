package jantarfilosofospkg;

import java.util.concurrent.Semaphore; // Importa a classe Semaphore

//Classe que representa um filósofo
class Filosofo extends Thread {
	private final Semaphore garfoEsquerdo; // Garfo à esquerda
	private final Semaphore garfoDireito; // Garfo à direita
	private final int id; // ID do filósofo

	// Construtor do filósofo
	public Filosofo(int id, Semaphore garfoEsquerdo, Semaphore garfoDireito) {
		this.id = id; // Atribui o ID do filósofo
		this.garfoEsquerdo = garfoEsquerdo; // Inicializa o garfo esquerdo
		this.garfoDireito = garfoDireito; // Inicializa o garfo direito
	}

	// Método que define o que a thread do filósofo fará
	public void run() {
		try {
			while (true) { // Loop infinito para simular a vida do filósofo
				pensar(); // O filósofo pensa
				comer(); // O filósofo tenta comer
			}
		} catch (InterruptedException e) {
			// Trata a interrupção da thread
			Thread.currentThread().interrupt(); // Restaura o estado de interrupção
		}
	}

	// Simula o ato de pensar
	private void pensar() throws InterruptedException {
		System.out.println("Filósofo " + id + " está pensando."); // Imprime no terminal
		Thread.sleep((int) (Math.random() * 1000)); // Espera aleatoriamente entre 0 e 1000 ms
	}

	// Simula o ato de comer
	private void comer() throws InterruptedException {
		System.out.println("Filósofo " + id + " está tentando pegar os garfos...");
		garfoEsquerdo.acquire(); // Tenta pegar o garfo esquerdo
		System.out.println("Filósofo " + id + " pegou o garfo esquerdo."); // Imprime que pegou o garfo
		garfoDireito.acquire(); // Tenta pegar o garfo direito
		System.out.println("Filósofo " + id + " pegou o garfo direito."); // Imprime que pegou o garfo
		System.out.println("Filósofo " + id + " está comendo."); // Imprime que está comendo
		Thread.sleep((int) (Math.random() * 1000)); // Espera aleatoriamente entre 0 e 1000 ms
		garfoEsquerdo.release(); // Libera o garfo esquerdo
		System.out.println("Filósofo " + id + " liberou o garfo esquerdo."); // Imprime que liberou o garfo
		garfoDireito.release(); // Libera o garfo direito
		System.out.println("Filósofo " + id + " liberou o garfo direito."); // Imprime que liberou o garfo
	}
}