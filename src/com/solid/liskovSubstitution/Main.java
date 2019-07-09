package com.solid.liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        System.out.println ("Olá !");
        System.out.println ("Seja Bem-Vindo");
        System.out.println ("Realizando Saque...");
        System.out.println ("");

        Conta conta1 = new Conta ( 1 );
        conta1.Saque ( 1, 300 );

//        ------------------------------------------------

        System.out.println ("Realizando Saque na Conta Poupança...");

        Conta conta2 = new ContaPoupanca ( 2 );
        conta2.Saque ( 2, 150 );

    }
}
