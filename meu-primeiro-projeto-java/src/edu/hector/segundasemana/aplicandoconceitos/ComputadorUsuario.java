package edu.hector.segundasemana.aplicandoconceitos;

import edu.hector.segundasemana.aplicandoconceitos.app.Facebook;
import edu.hector.segundasemana.aplicandoconceitos.app.MSN;
import edu.hector.segundasemana.aplicandoconceitos.app.ServicoDeMensagemInstantanea;
import edu.hector.segundasemana.aplicandoconceitos.app.Telegram;

import java.io.IOException;

public class ComputadorUsuario {
    public static void main(String[] args) throws IOException {
        ServicoDeMensagemInstantanea smi = null;
        /*
        * Não se sabe qual App
        * Mas qualquer um deverá enviar e receber mensagem
        * */

        String appEscolhido = "msn"; //Pode ser implementado um Scanner para interação com usuario

        if(appEscolhido.equals("msn")){
            smi = new MSN();
        }else if(appEscolhido.equals("fb")){
            smi = new Facebook();
        }else if(appEscolhido.equals("tl")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
