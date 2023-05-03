package br.edu.ifrs.pw1.pedidos;

import br.edu.ifrs.pw1.util.Situacao;

import java.util.LinkedList;
import java.util.Objects;
import java.util.TreeSet;

public class Pedido implements Comparable<Pedido>{

    public static int contador = 0;
    public static int numeroTotalPedidos;
    private double valor;
    private String data;
    private int numero;
    Situacao situacao;

    LinkedList<ItemPedido> itensPedidos;

    public Pedido(){}

    public Pedido(double valor, String data, int numero, Situacao situacao, LinkedList<ItemPedido> itensPedidos) {
        contador ++;
        this.valor = valor;
        this.data = data;
        this.numero = numero;
        this.situacao = situacao;
        this.itensPedidos = itensPedidos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pedido.contador = contador;
    }

    public static int getNumeroTotalPedidos() {
        return numeroTotalPedidos;
    }

    public void setNumeroTotalPedidos(int numeroTotalPedidos) {
        this.numeroTotalPedidos += contador;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LinkedList<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(LinkedList<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "valor=" + valor +
                ", data='" + data + '\'' +
                ", numero=" + numero +
                ", situacao=" + situacao +
                ", itensPedidos=" + itensPedidos +
                '}';
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
}
