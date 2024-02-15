package edu.hector.segundasemana.construtor;

public class SistemaDeCadastro {
    public static void main(String[] args) {
        // Criamos uma pessoa no sistema
        Pessoa marcos = new Pessoa("Marcos","12345678");


        //definimos o endereço de marcos
        marcos.setEndereco("Rua Das Marias");

        // e como definir o nome e cpf do marcos?

        // Imprimendo o marcos sem o nome e cpf
        System.out.println(marcos.getNome()+" - "+marcos.getCpf());
    }
}
