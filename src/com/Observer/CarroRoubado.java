package com.Observer;

import java.util.Observable;

public class CarroRoubado extends Observable implements Carro {

    private String acao = "";

    public void mudaEstado(){
        setChanged();
        notifyObservers(acao);
    }

    public void frente(){
        acao = "frente";
        System.out.println("Carro roubado segue em frente.");
        this.mudaEstado();
    }

    public void direita(){
        acao = "direita";
        System.out.println("Carro roubado vira a direita.");
        this.mudaEstado();
    }

    public void esquerda(){
        acao = "esquerda";
        System.out.println("Carro roubado vira a esquerda.");
        this.mudaEstado();
    }

    public void para(){
        acao = "para";
        System.out.println("Carro roubado parou.");
    }
}
