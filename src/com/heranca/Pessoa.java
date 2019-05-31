package com.heranca;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String sexo;

    public void fazerAniversario(){
        this.idade ++;
    }

    public String getNome() {
        return nome;
    }

    public Number getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
