package com.polimorfismo;

import java.sql.SQLOutput;

public class Ave extends Animal {

    private String corDaPena;


    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som da Ave");
    }

    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }
}
