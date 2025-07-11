package jantarfilosofospkg;

import java.util.concurrent.Semaphore;
import java.util.Random;

public class Sojantarfilosofo {

    private static final int N = 5;
    
    static class MonitorJantar {
        private final String[] estado; 
        private final Semaphore mutex; 
        private final Semaphore[] semaforoFilosofos; 

        public MonitorJantar() {
            estado = new String[N];
            semaforoFilosofos = new Semaphore[N];
            mutex = new Semaphore(1);

            for (int i = 0; i < N; i++) {
                estado[i] = "pensando";
                semaforoFilosofos[i] = new Semaphore(0);
            }
        }

        public void pegarGarfo(int idFilosof) throws InterruptedException {
            mutex.acquire();  
            estado[idFilosof] = "faminto";
            testar(idFilosof);
            mutex.release();  

            semaforoFilosofos[idFilosof].acquire();
        }

        public void soltarGarfo(int idFilosof) throws InterruptedException {
            mutex.acquire();  
            estado[idFilosof] = "pensando";

            testar((idFilosof - 1 + N) % N);
            testar((idFilosof + 1) % N);
            mutex.release();  
        }

        private void testar(int idFilosof) {
            if (estado[idFilosof].equals("faminto") &&
                !estado[(idFilosof - 1 + N) % N].equals("comendo") &&
                !estado[(idFilosof + 1) % N].equals("comendo")) {
                estado[idFilosof] = "comendo";
                semaforoFilosofos[idFilosof].release();
            }
        }
    }


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

    private static final Metrica[] filosofosMetrica = new Metrica[N];

    public static void main(String[] args) {
        MonitorJantar monitor = new MonitorJantar();
        Thread[] filosofos = new Thread[N];

        for (int i = 0; i < N; i++) {
            filosofosMetrica[i] = new Metrica();
        }

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

        for (Thread f : filosofos) {
            try {
                f.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("\nMétricas de Tempo:");
        for (int i = 0; i < N; i++) {
            System.out.printf("Filósofo %d: Início: %d ms, Duração: %d ms, Fim: %d ms%n", 
                i, filosofosMetrica[i].inicio, filosofosMetrica[i].duracao, filosofosMetrica[i].fim);
        }
    }

    private static void filosofo(int idFilosof, MonitorJantar monitor) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int tempoPensando = random.nextInt(5000) + 1000;
            System.out.println("Filósofo " + idFilosof + " está pensando por " + tempoPensando + " ms.");
            Thread.sleep(tempoPensando);

            System.out.println("Filósofo " + idFilosof + " está faminto.");
            monitor.pegarGarfo(idFilosof);

            long inicioComer = System.currentTimeMillis();
            filosofosMetrica[idFilosof].inicio = inicioComer;

            int tempoComendo = random.nextInt(4000) + 2000;
            System.out.println("Filósofo " + idFilosof + " está comendo por " + tempoComendo + " ms.");
            Thread.sleep(tempoComendo);

            long fimComer = System.currentTimeMillis();
            filosofosMetrica[idFilosof].duracao = fimComer - inicioComer;
            filosofosMetrica[idFilosof].fim = fimComer;

            monitor.soltarGarfo(idFilosof);
        }

        System.out.println("Filósofo " + idFilosof + " terminou.");
    }
}
