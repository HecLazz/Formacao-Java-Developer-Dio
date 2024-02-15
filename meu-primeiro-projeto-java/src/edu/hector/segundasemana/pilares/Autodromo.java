package edu.hector.segundasemana.pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro nissan = new Carro();
        nissan.setChassi("234234");
        //nissan.ligar();

        Moto z400 = new Moto();
        z400.setChassi("56545454");
        //z400.ligar();

        // verificando como o veículo é ligado
        Veiculo coringa = nissan;
        Veiculo coringa2 = z400;

        coringa.ligar();
        coringa2.ligar();
    }
}
