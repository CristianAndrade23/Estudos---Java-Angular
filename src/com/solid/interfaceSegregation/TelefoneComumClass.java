package com.solid.interfaceSegregation;

public class TelefoneComumClass implements TelefoneComum {
    @Override
    public void Tocar() {
        System.out.println ("Telefone tocando");
    }

    @Override
    public void Discar() {
        System.out.println ("Telefone discando");
    }
}
