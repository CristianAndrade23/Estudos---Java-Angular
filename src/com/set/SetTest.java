package com.set;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Cliente joao = new Cliente("João", "R.Cairu", "332211");
        Cliente maria = new Cliente("Maria", "R.São Nicolau", "999999");
        Cliente pedro = new Cliente("Pedro", "R.Joaquim Caetano", "888888");

        Set<Cliente> clienteSet = new HashSet<>();

        clienteSet.add(joao);
        clienteSet.add(maria);
        clienteSet.add(pedro);

        System.out.println("clienteSet" + clienteSet);
    }
}
