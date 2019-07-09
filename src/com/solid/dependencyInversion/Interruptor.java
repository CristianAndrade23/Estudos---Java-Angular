package com.solid.dependencyInversion;

public class Interruptor {

    private Ventilador ventilador;

    public void Acionar(){
        if (!ventilador.status){
            ventilador.Ligar ();
        }
        else {
            ventilador.Desligar ();
        }
    }
}
