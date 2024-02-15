package edu.hector.segundasemana.restaurante.area.cozinha;

public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("Adicionando lanche natural no balcão");
    }
    public void adicionarSucoNoBalcao() {
        System.out.println("Adicionando suco no balcão");
    }

    private void lavarIngredientes(){
        System.out.println("Lavando igredientes");
    }

    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
}
