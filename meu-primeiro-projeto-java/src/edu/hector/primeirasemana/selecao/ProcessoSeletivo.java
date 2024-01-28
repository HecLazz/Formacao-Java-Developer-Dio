package edu.hector.primeirasemana.selecao;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        /* Nessa parte vou ter que colocar um vetor de String
        pois não consegui ainda passar o valor para a main, talvez falte
        conhecimento ainda
        * */
        selecaoCandidato();
        String [] candidatos = {"Felipe", "Julia", "Paulo", "Augusto"};
        for (String candidato : candidatos){
            entrandoEmContato(candidato);
        }

    }

    static void entrandoEmContato(String candidato){
        int tentativaRealizadas = 1;
        boolean continuaTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuaTentando = !atendeu;

            if (continuaTentando){
                tentativaRealizadas++;
            }else
                System.out.println("Contato realizado com sucesso");
        }while (continuaTentando && tentativaRealizadas < 3);

        if (atendeu)
            System.out.println("Conseguimos contato com "+candidato+ " Na " +tentativaRealizadas+ " Tentativa");
        else
            System.out.println("Não conseguimos contato com "+candidato+ " ,número máximo tantavivas "+tentativaRealizadas);
    }

    // método auxiliar
    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }


    static void selecaoCandidato() {
        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela"};
        String [] selecionados = new String[5];

        int contador = 0;
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);


            if (salarioBase >= salarioPretendido) {
                System.out.println("LIGAR PARA O CANDIDATO");
                candidatosSelecionados++;
                selecionados[contador] = candidato;
                contador++;
            } else {
                System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
            }
            candidatoAtual++;

        }
        selecao(selecionados);
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecao(String [] selecionados){

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int indice = 0; indice < selecionados.length;indice++){
            if (selecionados[indice] == null) {
                continue;
            }
                System.out.println("O candidato de n° " +(indice+1)+ " é "+selecionados[indice]);

        }

        for (String candidato : selecionados){
            if (candidato == null){
                continue;
            }
            System.out.println("O candidato selecionado foi "+candidato);
        }
        System.out.println();

    }
}
