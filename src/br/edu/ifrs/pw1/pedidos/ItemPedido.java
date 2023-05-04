package br.edu.ifrs.pw1.pedidos;

public class ItemPedido {

    private int quantidade;
    private String descricao;
    private double valor;

    public ItemPedido() {
    }

    public ItemPedido(int quantidade, String descricao, double valor) {
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Quantidade: ").append(quantidade).append("\n");
        sb.append("Valor Unitário: ").append(valor).append("\n");
        sb.append("Valor Total: ").append(quantidade * valor).append("\n");
        return sb.toString();
    }
}