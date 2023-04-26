package br.edu.ifrs.pw1.util;

import br.edu.ifrs.pw1.pessoas.ClientePF;

import javax.swing.*;
import java.util.ArrayList;

public class Menu {
    ArrayList<ClientePF> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true){
            switch (montaMenu()){
                case 1: menu.CadastrarCliente();//Cadastra Clientes
                    break;
                case 2: pesquisarClienteNome();//Pesquisar Cliente pelo nome ou a razão social do cliente
                    break;
                case 3: pesquisarClienteNumero();//Pesquisar Cliente usando o número do pedido
                    break;
                case 4: listarTodosClientes();//Listar todos os clientes
                    break;
                case 5: listarOrdCliente();//Listar todos os cleintes ordenados pelo nome
                    break;
                case 6: System.exit(0);
                break;
                default:
                    System.out.println("Opcao inválida!");
                    break;
            }
        }
    }

    public static int montaMenu(){
        String aux = " ";
        for(OpcoesMenu opcoesMenu : OpcoesMenu.values())
            aux += opcoesMenu.toString()+"\n";
        return Integer.parseInt(JOptionPane.showInputDialog(aux));
    }
    public void CadastrarCliente() {

        JOptionPane.showMessageDialog(null,"Cadastro de Clientes");

        String nome = JOptionPane.showInputDialog(null,"Digite o nome do cliente: ");
        String endereco = JOptionPane.showInputDialog(null,"Digite o endereco do cliente: ");
        String cpf = JOptionPane.showInputDialog(null,"Digite o cpf cliente: ");
        String telefone = JOptionPane.showInputDialog(null,"Digite o telefone do cliente: ");





        ClientePF novoCliente = new ClientePF(nome, endereco, cpf, telefone);
        listaClientes.add(novoCliente);

        JOptionPane.showMessageDialog(null,"Cliente cadastrado!");



    }
    private static void pesquisarClienteNome() {

    }
    private static void pesquisarClienteNumero() {

    }
    private static void listarTodosClientes() {

    }
    private static void listarOrdCliente() {

    }
}
