package com.polimorfismo;

public class Cobra extends Reptil {

    @Override
    public void locomover(){
        System.out.println("Deslizando");
    }

    public void picar(){
        System.out.println("Picou");
    }
}
