package br.edu.ifrs.pw1.util;

import br.edu.ifrs.pw1.pedidos.ItemPedido;
import br.edu.ifrs.pw1.pedidos.Pedido;

import java.util.LinkedList;
import java.util.TreeSet;

public class teste {
    public static void main(String[] args) {
        TreeSet<Pedido> pedidos = new TreeSet<>();
        LinkedList<ItemPedido> itens= new LinkedList<>();
        Pedido pedido = new Pedido(10.0d,"10/10/2020", Situacao.ABERTO,itens);
        Pedido pedido2 = new Pedido(101.0d,"11/11/2021", Situacao.ABERTO,itens);
        pedidos.add(pedido);
        pedidos.add(pedido2);
        System.out.println(pedidos);
    }
}
