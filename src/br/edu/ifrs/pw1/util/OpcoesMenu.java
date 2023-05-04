package br.edu.ifrs.pw1.util;

public enum OpcoesMenu {
    CADASTRAR_CLIENTE(1,"Cadastrar Cliente"),
    PESQUISA_CLIENTE_NOME(2,"Pesquisa Cliente pelo Nome ou Razao Social"),
    PESQUISA_CLIENTE_NUMERO(3,"Pesquisa Cliente pelo Numero Pedido"),
    LISTAR_CLIENTES(4,"Listar Todos os Clientes"),
    LISTAR_CLIENTES_ORD(5,"Listar Todos os Clientes em Ordem"),
    SAIR(6,"Sair");


    private final int id;
    private final String descricao;

    OpcoesMenu(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString(){
        return this.getId() + " - " + this.getDescricao();
    }
}
