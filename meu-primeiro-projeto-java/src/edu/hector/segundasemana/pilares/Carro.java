package edu.hector.segundasemana.pilares;

public class Carro extends Veiculo {
    public void ligar(){
        confereCombustivel();
        confereTurbo();
        System.out.println("Carro ligado");
    }
    private void confereCombustivel(){
        System.out.println("Conferindo combustível");
    }
    private void confereTurbo(){
        System.out.println("Conferindo Turbo");
    }


}
