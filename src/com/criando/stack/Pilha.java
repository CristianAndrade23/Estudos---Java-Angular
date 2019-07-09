package com.criando.stack;

public class Pilha<T> {

    private T[] elementos;
    private int tamanho;

    public Pilha(int capacidade) {
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }


    public void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void empilha(T elemento){
        this.aumentaCapacidade();

        this.elementos[tamanho] = elemento;
        tamanho++;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }

    public T verificaItemDoTodo(){

        if (this.estaVazia()){
            return null;
        }
        else {
            return this.elementos[tamanho - 1];
        }
    }

    public T desempilha(){

        if (this.estaVazia()){
            return null;
        }
        else {
            T elemento = this.elementos[tamanho - 1];

            tamanho--;

            return elemento;
        }
    }


}
