package edu.hector.primeirasemana;

public class AnatomiaClasses { // A classe deve ter o mesmo nome do arquivo
    public static void main(String[] args) throws Exception {

        int anoAtual = 2024; // variável que pode ser alterada
        final double PI = 3.14; // Não pode ser alterada


        String primeiroNome = "Hector"; // Tipo, nome bem definido e o valor referente ao tipo.
        String segundoNome = "Lazzari";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

public static String nomeCompleto (String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}
} 
    

