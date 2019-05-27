package com.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Mamifero serHumano = new Mamifero();
        Reptil lagarto = new Reptil();
        Peixe peixePalhaco = new Peixe();
        Ave falcao = new Ave();

        Cachorro boby = new Cachorro();
        Cobra snake = new Cobra();
        Arara araraAzul = new Arara();

        snake.locomover();
        snake.picar();

        boby.emitirSom();
    }
}
