package com.solid.liskovSubstitution;

public class Conta {

    int id;

    public Conta(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void Saque (int idConta, int valor) {
        System.out.println ("Saque de " + valor + " na classe Base Conta");
    }
}
