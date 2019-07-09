package com.templateMethods;

public class TreinoNoMeioDaTemporada extends Treinos {

    @Override
    void preparoFisico() {
        System.out.println("Preparo físico intenso");
    }

    @Override
    void jogoTreino() {
        System.out.println("Jogo treino com a equipe reserva");
    }
}
