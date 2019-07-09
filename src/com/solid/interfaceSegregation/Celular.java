package com.solid.interfaceSegregation;

public class Celular implements TelefoneCelular {
    @Override
    public void Tocar() {
        System.out.println ("Celular tocando");
    }

    @Override
    public void Discar() {
        System.out.println ("Celular discando");
    }

    @Override
    public void TirarFoto() {
        System.out.println ("Celular tirando foto");
    }

    @Override
    public void Conectar3G() {
        System.out.println ("Celular conectando 3G");
    }
}
