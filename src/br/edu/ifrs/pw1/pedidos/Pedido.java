package br.edu.ifrs.pw1.pedidos;

import java.util.Objects;
import java.util.TreeSet;

public class Pedido {

    public static int contador = 0;
    public double numeroTotalPedidos;
    private double valor;
    private String data;
    private int numero;

    TreeSet<ItemPedido> itensPedidos;

    public Pedido(){}

    public Pedido(double numeroTotalPedidos, double valor, String data, int numero, TreeSet<ItemPedido> itensPedidos) {
        contador++;
        this.numeroTotalPedidos = numeroTotalPedidos;
        this.valor = valor;
        this.data = data;
        this.numero = numero;
        this.itensPedidos = itensPedidos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pedido.contador = contador;
    }

    public double getNumeroTotalPedidos() {
        return numeroTotalPedidos+= contador;
    }

    public void setNumeroTotalPedidos(double numeroTotalPedidos) {
        this.numeroTotalPedidos = numeroTotalPedidos;
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

    public TreeSet<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(TreeSet<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Double.compare(pedido.numeroTotalPedidos, numeroTotalPedidos) == 0 && Double.compare(pedido.valor, valor) == 0 && numero == pedido.numero && Objects.equals(data, pedido.data) && Objects.equals(itensPedidos, pedido.itensPedidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroTotalPedidos, valor, data, numero, itensPedidos);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroTotalPedidos=" + numeroTotalPedidos +
                ", valor=" + valor +
                ", data='" + data + '\'' +
                ", numero=" + numero +
                ", itensPedidos=" + itensPedidos +
                '}';
    }
}
