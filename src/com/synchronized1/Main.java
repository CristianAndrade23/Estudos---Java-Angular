package com.synchronized1;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 2, 2, 2, 2};

        ThreadSoma thread1 = new ThreadSoma("#1", array1);
        ThreadSoma thread2 = new ThreadSoma("#2", array1);

    }
}
