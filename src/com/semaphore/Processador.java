package com.semaphore;

import java.util.concurrent.Semaphore;

public class Processador extends Thread {

    private int id;
    private Semaphore semaforo;

    public Processador(int id, Semaphore semaforo){
        this.id = id;
        this.semaforo = semaforo;
    }

    private void processar(){
        try {
            System.out.println("#" + id + " processando...");
            Thread.sleep(3000);
        } catch (Exception exception){
            exception.printStackTrace();
        } finally {
            System.out.println("Processo #" + id + " finalizado!");
        }
    }

    public void run(){
        try {
            semaforo.acquire();
            processar();
        } catch (Exception exception){
            exception.printStackTrace();
        }
        finally {
            semaforo.release();
        }
    }

}
