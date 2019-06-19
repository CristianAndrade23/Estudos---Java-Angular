package com.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        int permissoes = 1;

        Semaphore semaforo = new Semaphore(permissoes);

        for (int cta = 1; cta <= 6; cta++){
            Thread thread = new ThreadAviao(cta, semaforo);
            thread.start();
        }
    }

}
