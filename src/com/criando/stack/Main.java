package com.criando.stack;

public class Main {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<Integer>(10);

        pilha.empilha(10);
        pilha.empilha(14);
        pilha.empilha(15);
        pilha.empilha(20);


//        System.out.println("pilha => " + pilha);

        System.out.println("Desempilhando =>" + pilha.desempilha());

        System.out.println(pilha);

//        if (pilha.estaVazia()){
//            System.out.println("A pilha está vazia");
//        }
//        if (!pilha.estaVazia()){
//            System.out.println("A pilha NÃO está vazia");
//        }
//
//        System.out.println("Verifica item do topo => " + pilha.verificaItemDoTodo());

    }
}
