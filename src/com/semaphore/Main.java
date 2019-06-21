package com.semaphore;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        int permissoes = 2;

        Semaphore semaforo = new Semaphore(permissoes);

        Processador processo1 = new Processador(1, semaforo);
        processo1.start();

        Processador processo2 = new Processador(2, semaforo);
        processo2.start();

        Processador processo3 = new Processador(3, semaforo);
        processo3.start();

        Processador processo4 = new Processador(4, semaforo);
        processo4.start();
    }
}
