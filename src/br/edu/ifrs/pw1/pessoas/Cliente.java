package br.edu.ifrs.pw1.pessoas;


public abstract class Cliente {

    private String nome;
    private String endereco;

    protected Cliente () {}

    protected Cliente(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(getNome()).append("\n");
        sb.append("Endereço: ").append(getEndereco()).append("\n");
        return sb.toString();
    }
}
