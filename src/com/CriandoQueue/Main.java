package com.CriandoQueue;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {
    public static void main(String[] args) {

        Fila<Integer> fila = new Fila<>(5);

        fila.enfileira(10);
        fila.enfileira(15);
        fila.enfileira(13);

        System.out.println(fila);

        System.out.println("desenfileirando=>" + fila.desenfileirar());

        System.out.println(fila);
    }
}
