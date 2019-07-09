package com.solid.dependencyInversionOK;

public class Main {
    public static void main(String[] args) {

        Lampada lampada = new Lampada();

        lampada.Acionar();
        lampada.Acionar();

        lampada.Status();

    }
}
