package br.edu.ifrs.pw1.util;

public enum Situacao {
    ABERTO("ABERTO", 1), CANCELADO("CANCELADO",2), ENTREGUE("ENTREGUE",3);

    private final String nome;
    private final int id;

    Situacao(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public String getNome(){return nome;}

    @Override
    public String toString() {
        return this.getId() + " - " + this.getNome();
    }
}
