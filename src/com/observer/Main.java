package com.observer;

public class Main {
    public static void main(String[] args) {

        CarroPolicia carroPolicia = new CarroPolicia();

        CarroRoubado carroRoubado = new CarroRoubado();

        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.frente();
        carroRoubado.para();
    }
}
