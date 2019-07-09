package com.criando.queue;

public class Fila<T> {

    private T[] elementos;
    private int tamanho;

    public Fila(int capacidade){
        elementos = (T[]) new Object[capacidade];
        tamanho = 0;
    }

    public void enfileira(T elemento){
        this.elementos[this.tamanho] = elemento;
        this.tamanho++;
    }

    public T espiar(){
        if (!estaVazia()){
            return null;
        } else {
            return this.elementos[0];
        }

    }

    public T desenfileirar(){

        final int POS = 0;

        if (estaVazia()){
            return null;
        }
        else {
            T elementoASerRemovido = this.elementos[POS];

            for(int i = POS; i < tamanho-1; i++){
                elementos[i] = elementos[i+1];
            }
            tamanho--;

            return elementoASerRemovido;
        }
    }

    public void remove(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        for (int i = posicao; i < tamanho-1; i++){
            elementos[i] = elementos[i+1];
        }
        tamanho--;
    }

    public boolean estaVazia(){
        return tamanho == 0;
    }
}
