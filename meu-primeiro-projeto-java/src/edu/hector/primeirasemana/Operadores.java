package edu.hector.primeirasemana;

public class Operadores {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        //Operadora ternário
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        // Poderia usar o IF e ELSE

        boolean var = true;
        var = !var; //inverte o valor de uma variável boolean
        System.out.println(var);

        int i = -5;
        i = i * -1; // Transformar um número em positivo.
        System.out.println(i);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois?: "+ simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é igual a numeroDois?: "+ simNao);

        //metodo .equals();
        String nomeUm = "Hector";
        String nomeDois = new String("Hector");

        System.out.println(nomeUm.equals(nomeDois)); // compara o conteúdo entre dois objetos.

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas confições são verdadeiras");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das opções são verdadeiras");
        }

        if (condicao1 && (7 > 4)){ // formas de utilizar os operadores lógicos
            System.out.println("Ambas são verdadeiras");
        }
    }
    
}
