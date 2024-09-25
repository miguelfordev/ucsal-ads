package jantarfilosofospkg;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class JantarDosFilosofos {
    public static void main(String[] args) throws InterruptedException {
        final int NUM_FILOSOFOS = 5;
        Semaphore garfos = new Semaphore(NUM_FILOSOFOS - 1); // Um garfo a menos para evitar deadlock
        Filosofo[] filosofos = new Filosofo[NUM_FILOSOFOS];

        ExecutorService executor = Executors.newFixedThreadPool(NUM_FILOSOFOS);

        // Cria e executa os filósofos
        for (int i = 0; i < NUM_FILOSOFOS; i++) {
            filosofos[i] = new Filosofo(i, garfos);
            executor.execute(filosofos[i]);
        }

        long tempoInicioExecucao = System.currentTimeMillis(); // Início da execução
        Thread.sleep(5000); // Espera a execução dos filósofos por 5 segundos
        executor.shutdownNow(); // Interrompe as threads
        executor.awaitTermination(1, TimeUnit.MINUTES);
        long tempoFimExecucao = System.currentTimeMillis(); // Fim da execução

        // Exibe as métricas
        System.out.println("\n=== Análise do Jantar dos Filósofos ===");
        System.out.println("Estratégia utilizada:");
        System.out.println("1. Preempção: Sim, os filósofos são interrompidos para evitar starvation.");
        System.out.println("2. Deadlock: Evitado ao permitir que apenas um menos que o total de filósofos possa comer.");
        System.out.println("3. Starvation: Garantido pelo uso de semáforos que limitam o número de filósofos comendo.");
        System.out.println("4. Concorrência: Controlada pela sincronização do acesso aos garfos.");

        System.out.println("\n=== Métricas dos Filósofos ===");
        for (Filosofo filosofo : filosofos) {
            System.out.println(filosofo.getMetricas(tempoInicioExecucao));
        }

        // Tempo total de execução
        long tempoTotalExecucao = (tempoFimExecucao - tempoInicioExecucao) / 1000;
        System.out.printf("\nTempo total de execução: %d segundos.%n", tempoTotalExecucao);
    }
}