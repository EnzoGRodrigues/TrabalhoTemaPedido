package br.edu.ifrs.pw1.pessoas;

import br.edu.ifrs.pw1.pedidos.Pedido;

import java.util.TreeSet;

public final class ClientePF extends Cliente{

    private String cpf;
    private String telefone;
    Cliente cliente;
    TreeSet<Pedido> pedidos;

    public ClientePF(){}

    public ClientePF(String nome, String endereco, String cpf, String telefone, Cliente cliente, TreeSet<Pedido> pedidos) {
        super(nome, endereco);
        this.cpf = cpf;
        this.telefone = telefone;
        this.cliente = cliente;
        this.pedidos = pedidos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public TreeSet<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(TreeSet<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return "ClientePF{" +
                "cpf='" + cpf + '\'' +
                ", telefone='" + telefone + '\'' +
                ", cliente=" + cliente +
                ", pedidos=" + pedidos +
                '}';
    }
}
