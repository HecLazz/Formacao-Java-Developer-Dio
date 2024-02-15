package edu.hector.segundasemana.aplicandoconceitos.app;

import java.io.IOException;

public class MSN extends ServicoDeMensagemInstantanea {
    @Override
    public void enviarMensagem() throws IOException {
        validarConectadoInternet();
        System.out.println("Enviar mensagem pelo MSN");
        salvarHistorico();
    }

    @Override
    public void receberMensagem() {
        System.out.println("Receber mensagem pelo MSN");
    } //Herança
}
