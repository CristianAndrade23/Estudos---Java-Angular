package com.polimorfismo;

public class Peixe extends Animal {

    private String corDaEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não emite som");
    }

    public void soltarBolha(){
        System.out.println("Soltando bolha");
    }
}
