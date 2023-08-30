package br.edu.ifrs.pw1.pedidos;

import br.edu.ifrs.pw1.util.Situacao;
import br.edu.ifrs.pw1.util.Validador;


import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Pedido implements Validador, Comparable<Pedido>{

    private static int contador = 1; //variavel numero
    private int numero;
    private double valor;
    private String data;
    private Situacao situacao;

    private LinkedList<ItemPedido> itensPedidos;

    public Pedido(){
    }

    public Pedido(double valor, String data, Situacao situacao, List<ItemPedido> itensPedidos) {
        this.valor = valor;
        this.data = data;
        this.situacao = situacao.ABERTO;
        this.itensPedidos = (LinkedList<ItemPedido>) itensPedidos;
        this.numero = contador;
        contador++;
    }

    public static int getTotalPedidos(){
        return contador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = (LinkedList<ItemPedido>) itensPedidos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Número do Pedido: ").append(getNumero()).append("\n");
        sb.append("Data: ").append(data).append("\n");
        sb.append("Valor Total: ").append(valor).append("\n");
        sb.append("Situação: ").append(situacao).append("\n");
        sb.append("Itens do Pedido: \n");
        for (ItemPedido item : itensPedidos) {
            sb.append("\t").append(item.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return valor == pedido.valor;
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    @Override
    public int compareTo(Pedido o) {
        if(o.getValor() == this.getValor())return 0;
        if (o.getValor() < this.getValor())return -1;
        return 1;
    }

    @Override
    public boolean validar(Object obj) {
        return false;
    }
}
