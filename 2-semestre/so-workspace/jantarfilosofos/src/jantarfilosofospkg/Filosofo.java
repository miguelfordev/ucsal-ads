package jantarfilosofospkg;

import java.util.concurrent.Semaphore;

class Filosofo implements Runnable {
    private final int id;
    private final Semaphore garfos;
    private long tempoInicio; // Tempo de início da refeição
    private long tempoFim; // Tempo de fim da refeição
    private boolean comeu = false; // Flag para indicar se comeu

    public Filosofo(int id, Semaphore garfos) {
        this.id = id;
        this.garfos = garfos;
    }

    @Override
    public void run() {
        try {
            pensar();
            comer();
        } catch (InterruptedException e) {
            // Thread interrompida
        }
    }

    private void pensar() throws InterruptedException {
        long tempoPensar = (long) (Math.random() * 1000);
        System.out.printf("Filósofo %d está pensando por %.2fs.%n", id, tempoPensar / 1000.0);
        Thread.sleep(tempoPensar);
    }

    private void comer() throws InterruptedException {
        long tempoAguardando = System.currentTimeMillis();
        System.out.printf("Filósofo %d está tentando pegar os garfos.%n", id);
        garfos.acquire(2); // Adquire dois garfos
        long tempoPegou = System.currentTimeMillis();
        System.out.printf("Filósofo %d pegou os garfos em %.2fs.%n", id, (tempoPegou - tempoAguardando) / 1000.0);

        try {
            tempoInicio = System.currentTimeMillis();
            long tempoComer = (long) (Math.random() * 1000);
            System.out.printf("Filósofo %d começou a comer após %.2fs.%n", id, (tempoPegou - tempoAguardando) / 1000.0);
            Thread.sleep(tempoComer);
            tempoFim = System.currentTimeMillis();
            System.out.printf("Filósofo %d terminou de comer em %.2fs.%n", id, (tempoFim - tempoAguardando) / 1000.0);
            comeu = true; // Marca que o filósofo comeu
        } finally {
            garfos.release(2);
            System.out.printf("Filósofo %d soltou os garfos.%n", id);
        }
    }

    public String getMetricas(long tempoInicioExecucao) {
        if (!comeu) return String.format("Filósofo %d: Não comeu.", id);
        long duracaoComer = (tempoFim - tempoInicio);
        return String.format("Filósofo %d: Início: %.2fs, Fim: %.2fs, Duração: %.2fs",
                             id, (tempoInicio - tempoInicioExecucao) / 1000.0, 
                             (tempoFim - tempoInicioExecucao) / 1000.0, 
                             (duracaoComer / 1000.0));
    }
}