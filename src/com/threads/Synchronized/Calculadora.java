package com.threads.Synchronized;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array) {
        soma = 0;

        for (int i = 0; i < array.length; i++){

            soma += array[i];

            System.out.println("Executando a soma " + Thread.currentThread().getName() +
                                " somando o valor " + array[i] + " com o total de " + soma);

            try{
                Thread.sleep(500);
            } catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        return soma;
    }
}
