package com.solid.dependencyInversionOK;

public class Ventilador implements Dispositivo {

    public boolean status = false;

    @Override
    public void Status(){
        if (status){
            System.out.println ("Ventilador ligada!");
        } else {
            System.out.println ("Ventilador desligada");
        }
    }

    @Override
    public void Acionar() {
        if (!status){
            this.Ligar();
        } else {
            this.Desligar();
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
