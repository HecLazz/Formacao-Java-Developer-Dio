package edu.hector.segundasemana;

public enum EstadosBrasileiros { // criando o enum para ser usado em toda a aplicação
    SAO_PAULO("SP", "São Paulo", 11),
    RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
    PIAUI("PI", "Piauí", 13),
    MARANHAO("MA", "Maranhão", 14),
    // ponto e virgula para finalizar
    // se quiser adicionar mais, só colocar antes do ponto e virgula
    CEARA("CE", "Ceará", 15)
    ;

    private String nome;
    private String sigla;
    private int ibge;

    private EstadosBrasileiros(String sigla, String nome, int ibge){
        this.sigla = sigla;
        this.nome = nome;
        this.ibge = ibge;
    }

    public int getIbge(){
        return ibge;
    }
    public String getSigla(){
        return sigla;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }
}
