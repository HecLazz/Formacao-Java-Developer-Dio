package edu.hector.segundasemana.aplicandoconceitos.app;

import java.io.IOException;

public class Facebook extends ServicoDeMensagemInstantanea {//Herança
    @Override
    public void enviarMensagem() throws IOException {
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo Facebook");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Receber mensagem pelo Facebook");
    }
}
