package com.solid.notinterfaceSegregation;

public class TelefoneCelular implements Telefone {
    @Override
    public void Tocar(){
        System.out.println ("Celular tocando...");
    }

    @Override
    public void Discar(){
        System.out.println ("Celular discando...");
    }

    @Override
    public void TirarFoto(){
        System.out.println ("Celular tirando foto...");
    }
}
