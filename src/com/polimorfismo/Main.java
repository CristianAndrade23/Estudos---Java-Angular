package com.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Mamifero serHumano = new Mamifero();
        Reptil lagarto = new Reptil();
        Peixe peixePalhaco = new Peixe();
        Ave falcao = new Ave();


        serHumano.setPeso(75.5f);
        serHumano.setCorDoPelo("Castanho");
        serHumano.alimentar();
        serHumano.locomover();
        serHumano.emitirSom();

    }
}
