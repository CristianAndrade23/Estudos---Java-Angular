package com.semaphore;

import java.util.concurrent.Semaphore;

public class ThreadAviao extends Thread {
    private int idThread;
    private static final int distanciaTotal = 100;
    private static int cta = 0;
    private Semaphore semaforo;

    public ThreadAviao(int idThread, Semaphore semaforo){
        this.idThread = idThread;
        this.semaforo = semaforo;
    }

    private void aviaoAndando(){
        int DistanciaPercorrida = 0;

        while (DistanciaPercorrida < distanciaTotal){
            int rodada = (int) (Math.random() * 50) + 10;

            DistanciaPercorrida += rodada;

            System.out.println("O avião #" + idThread + " já percorreu " + DistanciaPercorrida);

            try{
                Thread.sleep(300);
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
    }

    private void pista(){
        if (cta % 2 == 0){
            System.out.println("O avião #" + idThread + " está na pista da direit!");
            cta++;
        } else {
            System.out.println("O avião #" + idThread + " está na pista da esquerda!");
            cta++;
        }
    }

    private void manobra(){
        System.out.println("O avião #" + idThread + " está manobrando!");

        int tempo = (int) ((Math.random() * 300) + 400);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    private void taxiar(){
        System.out.println("O avião #" + idThread + " está taxiando!");

        int tempo = (int) ((Math.random() * 200) + 300);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    private void posicionando(){
        System.out.println("O avião #" + idThread + " está posicionando!");
        int tempo = (int) ((Math.random() * 100) + 300);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    private void acelerar(){
        System.out.println("O avião #" + idThread + " está acelerando!");
        int tempo = (int) ((Math.random() * 300) + 200);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    private void decolar(){
        System.out.println("O avião #" + idThread + " está decolando!");
        int tempo = (int) ((Math.random() * 400) + 300);
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    private void afastar(){
        System.out.println("O avião #" + idThread + " está se afastando!");
        int tempo = (int) ((Math.random() * 200) + 400);
        try {
            Thread.sleep(tempo);
            System.out.println("O avião #" + idThread + " já se afastou, pode entrar o próximo avião!");
        } catch (InterruptedException exception){
            exception.printStackTrace();
        }
    }

    public void run(){

        try {

            semaforo.acquire();
            aviaoAndando();
            pista();
            manobra();
            taxiar();
            posicionando();
            acelerar();
            decolar();
            afastar();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            semaforo.release();
        }
    }
}
