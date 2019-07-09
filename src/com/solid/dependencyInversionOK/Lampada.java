package com.solid.dependencyInversionOK;

public class Lampada implements Dispositivo {

    public boolean status = false;

    @Override
    public void Status(){
        if (status){
            System.out.println ("Lampada ligada!");
        } else {
            System.out.println ("Lampada desligada");
        }
    }


    @Override
    public void Acionar() {
        if (!status){
            Ligar();
        } else {
            Desligar();
        }
    }

    @Override
    public void Ligar() {
        status = true;
    }

    @Override
    public void Desligar() {
        status = false;
    }
}
