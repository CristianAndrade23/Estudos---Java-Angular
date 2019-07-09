package com.templateMethods;

public class TreinoNoInicioDaTemporada extends Treinos {

    @Override
    void preparoFisico() {
        System.out.println("Preparo fisico leve");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo treino com a equipe Junior");
    }
}
