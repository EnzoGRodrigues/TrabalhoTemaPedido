package br.edu.ifrs.pw1.util;

import br.edu.ifrs.pw1.pedidos.ItemPedido;
import br.edu.ifrs.pw1.pedidos.Pedido;
import br.edu.ifrs.pw1.pessoas.Cliente;
import br.edu.ifrs.pw1.pessoas.ClientePF;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Menu {
    static ArrayList<ClientePF> listaClientes = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            switch (montaMenu()) {
                case 1:
                    menu.cadastrarCliente();//Cadastra Clientes
                    break;
                case 2:
                    pesquisarClienteNome();//Pesquisar Cliente pelo nome ou a razão social do cliente
                    break;
                case 3:
                    pesquisarClienteNumero();//Pesquisar Cliente usando o número do pedido
                    break;
                case 4:
                    listarTodosClientes();//Listar todos os clientes
                    break;
                case 5:
                    listarOrdCliente();//Listar todos os cleintes ordenados pelo nome
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcao inválida!");
                    break;
            }
        }
    }

    public static int montaMenu() {
        String aux = " ";
        for (OpcoesMenu opcoesMenu : OpcoesMenu.values())
            aux += opcoesMenu.toString() + "\n";
        return Integer.parseInt(JOptionPane.showInputDialog(aux));
    }

    public static void cadastrarCliente() {

        TreeSet<Pedido> pedidos = new TreeSet<>();

        JOptionPane.showMessageDialog(null, "Cadastro de Clientes\nClique em OK para seguir em frente");

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do cliente: ");
        String endereco = JOptionPane.showInputDialog(null, "Digite o endereco do cliente: ");
        String cpf = JOptionPane.showInputDialog(null, "Digite o cpf cliente: ");
        String telefone = JOptionPane.showInputDialog(null, "Digite o telefone do cliente: ");
        ClientePF clientePF = new ClientePF(nome, endereco, cpf, telefone, pedidos);
        listaClientes.add(clientePF);

        int opcao = 0;
        final int SIM = 1;
        final int NAO = 2;

        try { //esse try catch faz o tratamento do parseInt
            //perguntando ao usuario se ele quer registrar um pedido
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Quer registrar um pedido\n" +
                            "Se sim, digite 1\n" +
                            "Se nao, digite 2\n"));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Opcao invalida!");
        }
        if (opcao == SIM) {
            LinkedList<ItemPedido> itemPedidos = new LinkedList<>();
            double totalValorPedido = 0;
            while (opcao == SIM) {

                ItemPedido itens = new ItemPedido(Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do item: ")),
                        JOptionPane.showInputDialog(null, "Descricao do item: "),
                        Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do item")));
                totalValorPedido += itens.getValor() * itens.getQuantidade();
                itemPedidos.add(itens);
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja registrar mais itens?\nDigite 1 para SIM: \nDigite 2 para NAO: "));
            }
            String date;
            Pedido pedido = new Pedido(totalValorPedido,
                    (JOptionPane.showInputDialog(null, "Digite a data: ")),
                    Pedido.getNumeroTotalPedidos(),
                    Situacao.ABERTO,
                    itemPedidos
            );
            pedidos.add(pedido);

                opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Quer registrar mais pedidos?\n" +
                                "Se sim, digite 1\n" +
                                "Se nao, digite 2\n" + "O valor o pedido e: " + pedido.getValor()));

        }

            if (opcao == SIM) {
                JOptionPane.showMessageDialog(null, "Pedido realizado!");
            } else if (opcao == NAO) {
                JOptionPane.showMessageDialog(null, "Cadastro finalizado");
            } else {
                JOptionPane.showMessageDialog(null, "Opcao invalida");
            }
        }


 /*int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Quer registrar um pedido?" + "\n" + "Digite 1 para SIM" +"\n" + "Digite 2 para NAO"));
    while(opcao == 1){
        if(opcao == 1){
            ArrayList<ItemPedido> itensPedido = new ArrayList<>();
            double total = 0;
            while (opcao == 1){

                ItemPedido itens = new ItemPedido((Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade do item: "))),
                        JOptionPane.showInputDialog(null,"Descricao do item: "),
                        (Double.parseDouble(JOptionPane.showInputDialog(null, "Valor do item: ")))
                );
                total += itens.getValor();
                itensPedido.add(itens);
                opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Quer registrar mais itens?" + "\n" + "Se SIM, digite 1" + "\n" + "Se NAO, digite 2"))
            }
            Pedido pedido = new Pedido(total, (JOptionPane.showInputDialog(null,"Informe a data: ")),
                    pedido.getNumeroTotalPedidos(),
                    Situacao.ABERTO,
                    itensPedido
            );
            pedidos.add(pedido);

            JOptionPane.showMessageDialog(null,"Pedido Finalizado" + "\n" + "Valor total: " + pedido.getValor());
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"Finalizando..." + "" +
                    "\n" + "Para fazer outro pedido, digite 1" + "\n" + "Para finalizar cadastro do cliente, digite 2"));
        }
    }
    if(opcao == 1){
        JOptionPane.showMessageDialog(null, "Cliente cadastrado!");
    }else{
        JOptionPane.showMessageDialog(null, "Opcao inválida.");
    }
    JOptionPane.showMessageDialog(null,"Cliente cadastrado!");
*/


    public static void pesquisarClienteNome() {
        String busca = JOptionPane.showInputDialog(null,"Digite o nome do cliente: ");
        for(Cliente cliente : listaClientes){
            if (busca.equals(cliente.getNome()))
                JOptionPane.showMessageDialog(null, cliente.toString());
        }
        JOptionPane.showMessageDialog(null,"Nome invalido");
    }



    public static void pesquisarClienteNumero() {
        boolean flag = false;
        if(listaClientes!=null){
            int busca = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero do pedido: "));
            for(ClientePF cliente : listaClientes){
                if(busca == listaClientes.size())
                    JOptionPane.showMessageDialog(null,cliente.getNome());
            }
            JOptionPane.showMessageDialog(null, "Numero de pedido invalido");
        }
    }

    public static void listarTodosClientes() {
        StringBuilder clientes = new StringBuilder();
        for (ClientePF clientePF : listaClientes){
            clientes.append(clientePF.getNome().toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null,clientes);
    }

    public static void listarOrdCliente() {
        StringBuilder clientes = new StringBuilder();
        Comparator<ClientePF> comparator = new Comparator<ClientePF>() {
            @Override
            public int compare(ClientePF o1, ClientePF o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        };
        Collections.sort(listaClientes,comparator);
        for (ClientePF clientePF : listaClientes){
            clientes.append(clientePF.getNome().toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null,clientes);
    }
}
