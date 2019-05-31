package com.heranca;

public class Main {

    public static void main(String[] args) {

      Pessoa clovis = new Pessoa();
      Aluno joaozinho = new Aluno();


      clovis.setNome("Clovis");
      clovis.setSexo("M");
      clovis.setIdade(null);

      joaozinho.setNome("Joaozinho");
      joaozinho.setSexo("M");
      joaozinho.setIdade(12);

      System.out.println(clovis.toString());
      System.out.println(joaozinho.toString());

      //testando branch
      //testando tag
    }
}
