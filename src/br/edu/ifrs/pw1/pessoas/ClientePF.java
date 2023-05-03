package br.edu.ifrs.pw1.pessoas;

import br.edu.ifrs.pw1.pedidos.Pedido;

import java.util.Objects;
import java.util.TreeSet;

public final class ClientePF extends Cliente implements Comparable<ClientePF>{

    private String cpf;
    private String telefone;
    TreeSet<Pedido> pedidos;

    public ClientePF(){}

    public ClientePF(String nome, String endereco, String cpf, String telefone, TreeSet<Pedido> pedidos) {
        super(nome, endereco);
        this.cpf = cpf;
        this.telefone = telefone;
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
                ", pedidos=" + pedidos +
                '}';
    }

    @Override
    public int compareTo(ClientePF o) {
        return super.getNome().compareTo(o.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientePF clientePF = (ClientePF) o;
        return Objects.equals(getNome(), clientePF.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
}
