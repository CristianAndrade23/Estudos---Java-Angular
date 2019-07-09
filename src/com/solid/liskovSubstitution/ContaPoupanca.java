package com.solid.liskovSubstitution;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int id) {
        super ( id );
    }

    @Override
    public void Saque(int idConta, int valor){
        System.out.println ("Saque de " + valor + " na classe derivada Conta Poupança");
    }
}
