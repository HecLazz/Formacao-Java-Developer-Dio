package edu.hector.segundasemana.aplicandoconceitos.app;

import java.io.IOException;

public class Telegram extends ServicoDeMensagemInstantanea {
    @Override
    public void enviarMensagem() throws IOException {
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo Telegram");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Receber mensagem pelo Telegram");
    } //Herança

}
