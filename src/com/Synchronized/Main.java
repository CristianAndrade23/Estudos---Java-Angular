package com.Synchronized;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};

        ThreadSoma thread1 = new ThreadSoma("#1", array1);
        ThreadSoma thread2 = new ThreadSoma("#2", array1);

    }
}
