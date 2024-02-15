package edu.hector.segundasemana.aplicandoconceitos.app;

import java.io.IOException;
import java.net.InetAddress;


public abstract class ServicoDeMensagemInstantanea { //Abstração
    public abstract void enviarMensagem() throws IOException;
    public abstract void receberMensagem();

    // método que todos os filhos deverão implementar
    protected void salvarHistorico(){
        System.out.println("Histórico salvo");
    }

    //Somente os filhos conhecem este método
    protected void validarConectadoInternet() throws IOException { // Testando código
        System.out.println("Validando se está conectado a Internet");
        InetAddress endereco = InetAddress.getByName("www.google.com");
        int timeout = 3000;

        if(endereco.isReachable(timeout)) {
            System.out.println("Conectado!");
        }else{
            System.out.println("Fora do ar!");
        }
        /*para apenas os filhos conseguir ter interação com protected
        * precisa estar no mesmo pacote, justamente por isso criei o package
        * app.
        * */
    }
}