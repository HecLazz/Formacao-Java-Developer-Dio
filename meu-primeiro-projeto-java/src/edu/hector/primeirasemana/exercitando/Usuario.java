/* Primeiro projeto em Java.
 *
 * Exercicío aplicado em aula, porém modifiquei para ficar interativo com o usuário. Em aula apenas é ensinado como funciona o objeto, dando valores e apenas aumentando e diminuindo canais e volumes de forma manual, direto no código.
 */
package edu.hector.primeirasemana.exercitando;

import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        SmartTv smartTv = new SmartTv();
        int operacao = 0;
        int novoCanal;

        System.out.println("TV ligada ? "+smartTv.ligada);
        System.out.println("Canal atual: "+smartTv.canal);
        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Digite ON para ligar e OFF para desligar:");
        String ligarDesligar = ler.nextLine().toLowerCase();

        if(ligarDesligar.equals("on")){
            smartTv.ligar();
            do{
                System.out.println("-------------------------------------------------");
                System.out.println("TV ligada ? "+smartTv.ligada);
                System.out.println("Canal atual: "+smartTv.canal);
                System.out.println("Volume atual: "+smartTv.volume);
                System.out.println("-------------------------------------------------");
                System.out.println("Opções:\n1 - volume\n2 - Canal\n3 - Desligar");
                operacao = ler.nextInt();

                switch (operacao) {
                    case 1:
                        System.out.println("Digite 1 para aumentrar e 0 para diminuir:");
                        operacao = ler.nextInt();

                        if(operacao == 1){
                            smartTv.aumentarVolume();

                        }else if (operacao == 0){
                            smartTv.diminuirVolume();
                            
                        }else{
                            System.out.println("Digite 1 ou 0");
                        }
                        operacao = 0;
                        break;
                    case 2:
                        System.out.println("Digite 1 para aumentrar e 0 para diminuir:\nPara escolher o canal digite 2:");
                        operacao = ler.nextInt();

                        if (operacao == 1) {
                            smartTv.aumentarCanal();

                        }else if (operacao == 0) {
                            smartTv.diminuirCanal();

                        }else if (operacao == 2) {
                            System.out.println("Informe o canal:");
                            novoCanal = ler.nextInt();

                            smartTv.mudarCanal(novoCanal);
                        }
                        operacao = 0;
                    case 3:
                        smartTv.desligar();
                    default:
                        System.out.println("Digite uma das opções!");
                        break;
                }

            }while(operacao != 3);

        }else if(ligarDesligar.equals("off")){
            smartTv.desligar();
        }else{
            System.out.println("Digite uma das opções!");
        }
    }

}
