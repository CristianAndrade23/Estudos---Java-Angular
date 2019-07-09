package com.solid.notinterfaceSegregation;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class TelefoneComum implements Telefone{
    @Override
    public void Tocar() {
        System.out.println ("Telefone Comum tocando...");
    }

    @Override
    public void Discar() {
        System.out.println ("Telefone Comum discando...");
    }

    @Override
    public void TirarFoto() {
        throw new NotImplementedException ();
    }
}
