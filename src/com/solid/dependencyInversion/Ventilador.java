package com.solid.dependencyInversion;

public class Ventilador {

    public boolean status = false;

    public boolean Status(){
        return status;
    }

    public void Ligar(){
        status = true;
    }

    public void Desligar(){
        status = false;
    }
}
