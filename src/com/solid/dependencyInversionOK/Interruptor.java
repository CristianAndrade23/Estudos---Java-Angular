package com.solid.dependencyInversionOK;

public class Interruptor {
    private Dispositivo dispositivo;

    public void AcionarDispositivo(){
        dispositivo.Acionar();
    }
}
