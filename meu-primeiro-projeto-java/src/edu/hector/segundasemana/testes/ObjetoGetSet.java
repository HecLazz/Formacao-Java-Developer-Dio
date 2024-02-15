package edu.hector.segundasemana.testes;

public class ObjetoGetSet {
    private String modelo;
    private int portas;
    private String motor;

    public String getModelo(){
        return modelo;
    }
    public void setModelo(String novoModelo){
        modelo = novoModelo;
    }

    public String getMotor(){
        return motor;
    }

    public void setMotor(String novoMotor){
        motor = novoMotor;
    }

    public int getPortas(){
        return portas;
    }

    public void setPortas(int novaPortas){
        this.portas = novaPortas;
    }
}
