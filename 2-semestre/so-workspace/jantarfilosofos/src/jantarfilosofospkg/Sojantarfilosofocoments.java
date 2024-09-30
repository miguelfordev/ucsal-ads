package jantarfilosofospkg;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class Sojantarfilosofocoments {

    // Número de filósofos
    private static final int N = 5;

    // Monitor para o jantar dos filósofos
    static class MonitorJantar {
        private final String[] estado;  // Estados dos filósofos: "pensando", "faminto", "comendo"
        private final Semaphore mutex;  // Exclusão mútua para garantir que apenas um filósofo altere o estado
        private final Semaphore[] semaforoFilosofos;  // Semáforos individuais para os filósofos

        public MonitorJantar() {
            estado = new String[N];
            semaforoFilosofos = new Semaphore[N];
            mutex = new Semaphore(1);

            // Inicializa todos os filósofos como "pensando" e seus semáforos com 0 permissões
            for (int i = 0; i < N; i++) {
                estado[i] = "pensando";
                semaforoFilosofos[i] = new Semaphore(0);
            }
        }

        // Método para pegar os garfos (entrar no estado "comendo")
        public void pegarGarfo(int idFilosof) throws InterruptedException {
            mutex.acquire();  // Exclusão mútua para alterar o estado
            estado[idFilosof] = "faminto";
            testar(idFilosof);
            mutex.release();  // Libera a exclusão mútua

            // Se o filósofo não puder comer, ele será bloqueado até que possa
            semaforoFilosofos[idFilosof].acquire();
        }

        // Método para soltar os garfos (voltar ao estado "pensando")
        public void soltarGarfo(int idFilosof) throws InterruptedException {
            mutex.acquire();  // Exclusão mútua para alterar o estado
            estado[idFilosof] = "pensando";

            // Tentar ver se os vizinhos podem comer
            testar((idFilosof - 1 + N) % N);
            testar((idFilosof + 1) % N);
            mutex.release();  // Libera a exclusão mútua
        }

        // Método para verificar se um filósofo pode comer
        private void testar(int idFilosof) {
            // Um filósofo só pode comer se ele estiver faminto e seus vizinhos não estiverem comendo
            if (estado[idFilosof].equals("faminto") &&
                !estado[(idFilosof - 1 + N) % N].equals("comendo") &&
                !estado[(idFilosof + 1) % N].equals("comendo")) {
                estado[idFilosof] = "comendo";
                semaforoFilosofos[idFilosof].release();  // Permite que o filósofo comece a comer
            }
        }
    }

    // Métricas de tempo para cada filósofo
    static class Metrica {
        public long inicio;
        public long duracao;
        public long fim;

        public Metrica() {
            this.inicio = 0;
            this.duracao = 0;
            this.fim = 0;
        }
    }

    // Guardar métricas de tempo
    private static final Metrica[] filosofosMetrica = new Metrica[N];

    public static void main(String[] args) {
        MonitorJantar monitor = new MonitorJantar();
        Thread[] filosofos = new Thread[N];

        // Inicializando métricas
        for (int i = 0; i < N; i++) {
            filosofosMetrica[i] = new Metrica();
        }

        // Criando threads dos filósofos
        for (int i = 0; i < N; i++) {
            final int idFilosof = i;
            filosofos[i] = new Thread(() -> {
                try {
                    filosofo(idFilosof, monitor);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
            filosofos[i].start();
        }

        // Esperar os filósofos terminarem
        for (Thread f : filosofos) {
            try {
                f.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        // Exibir as métricas
        System.out.println("\nMétricas de Tempo:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Filósofo %d: Início: %d ms, Duração: %d ms, Fim: %d ms%n", 
                i, filosofosMetrica[i].inicio, filosofosMetrica[i].duracao, filosofosMetrica[i].fim);
        }
    }

    private static void filosofo(int idFilosof, MonitorJantar monitor) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {  // Cada filósofo come 3 vezes para simplificar
            // Pensar
            int tempoPensando = random.nextInt(5000) + 1000;  // Entre 1 e 5 segundos
            System.out.println("Filósofo " + idFilosof + " está pensando por " + tempoPensando + " ms.");
            Thread.sleep(tempoPensando);

            // Ficar faminto e pegar garfo
            System.out.println("Filósofo " + idFilosof + " está faminto.");
            monitor.pegarGarfo(idFilosof);

            // Começar a comer
            long inicioComer = System.currentTimeMillis();
            filosofosMetrica[idFilosof].inicio = inicioComer;

            int tempoComendo = random.nextInt(4000) + 2000;  // Entre 2 e 6 segundos
            System.out.println("Filósofo " + idFilosof + " está comendo por " + tempoComendo + " ms.");
            Thread.sleep(tempoComendo);

            long fimComer = System.currentTimeMillis();
            filosofosMetrica[idFilosof].duracao = fimComer - inicioComer;
            filosofosMetrica[idFilosof].fim = fimComer;

            // Soltar garfos
            monitor.soltarGarfo(idFilosof);
        }

        System.out.println("Filósofo " + idFilosof + " terminou.");
    }
}
