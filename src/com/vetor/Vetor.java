package com.vetor;

import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        } else {
            return false;
        }
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String busca(int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException ( "Posição inválida" );
        } else {
            return this.elementos[posicao];
        }
    }

    public int busca(String elemento){
        for (int i=0; i < this.tamanho; i++){
            if (this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

    public boolean adiciona (int posicao, String elemento){

        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException ( "Posição inválida" );
        }

        this.aumentaCapacidade();

        for (int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i + 1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;

        return false;
    }

    private void aumentaCapacidade(){
        if (this.tamanho == this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length * 2];
            for (int i=0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public void remove (int posicao){
        if (!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException ( "Posição inválida" );
        }

        for (int i = posicao; i < this.tamanho -1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }


    @Override
    public String toString() {
        return Arrays.toString ( elementos );
    }
}
