package com.company;

public class Main {

    public static void main(String[] args) {

      Pessoa clovis = new Pessoa();
      Aluno joaozinho = new Aluno();
      Professor ademilson = new Professor();
      Funcionario cleiton = new Funcionario();

      clovis.setNome("Clovis");
      clovis.setSexo("M");
      clovis.setIdade(41);

      joaozinho.setNome("Joaozinho");
      joaozinho.setSexo("M");
      joaozinho.setIdade(12);

      ademilson.setNome("Ademilson");
      ademilson.setSexo("M");
      ademilson.setIdade(38);
      ademilson.setSalario(2300);

      cleiton.setNome("Cleiton");
      cleiton.setSexo("M");
      cleiton.setIdade(23);

        System.out.println(clovis.toString());
        System.out.println(joaozinho.toString());
        System.out.println(ademilson.toString());
        System.out.println(cleiton.toString());
    }
}
