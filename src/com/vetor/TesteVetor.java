package com.vetor;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class TesteVetor {

    public static void main(String[] args){

        Vetor array = new Vetor(3   );

        array.adiciona ( "Cristian" );
        array.adiciona ( "Jubileu" );
        array.adiciona ( "Jorge" );
        array.adiciona ( "Amadeu" );

        System.out.println (array);

        array.remove ( 1 );

        System.out.println (array);
    }
}
