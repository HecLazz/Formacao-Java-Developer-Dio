package edu.hector.segundasemana.construtor;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    // método contrutor
    // o nome deverá ser igual ao nome da classe
    public Pessoa (String nome, String cpf){
        this.cpf = cpf; // this = atributo da classe que é diferente do parametro
        this.nome = nome;
        // construtor = quais são os atributos importantes para existencia de um objeto.
    }

    // getters
    // setter

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
