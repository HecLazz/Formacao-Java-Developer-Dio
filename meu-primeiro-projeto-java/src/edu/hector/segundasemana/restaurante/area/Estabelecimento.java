package edu.hector.segundasemana.restaurante.area;

import edu.hector.segundasemana.restaurante.area.cliente.Cliente;
import edu.hector.segundasemana.restaurante.area.cozinha.Almoxarifado;
import edu.hector.segundasemana.restaurante.area.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {


        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.pegarPedidoBalcao();
        atendente.servindoMesa();

        Cozinheiro cozinheiro = new Cozinheiro();
        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        Almoxarifado almoxarifado = new Almoxarifado();
        // uma das funções do almoxarife não está visivel pois está em default.

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        cliente.pegarPedidoBalcao();
    }
}
