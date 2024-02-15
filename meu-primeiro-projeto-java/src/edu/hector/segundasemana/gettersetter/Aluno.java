package edu.hector.segundasemana.gettersetter;

public class Aluno {
    private String nome;
    private int idade;

    public String getNome(){ //retorna o nome atribuido
        return nome;
    }

    public void setNome (String newNome){ //altera o valor de variavel, pois tem o parametro newNome
        nome = newNome; // ou seja o valor da variavel nome será atribuido pelo novo valor.
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int newIdade) {
        this.idade = newIdade;
    }
}
