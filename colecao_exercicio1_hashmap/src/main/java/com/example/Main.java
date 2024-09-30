package com.example;

import java.util.List;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Vendas venda = new Vendas();
        String operacao;

        do {
            operacao = JOptionPane.showInputDialog("GERENCIAMENTO DE VENDAS\n"
                    + "1 - Cadastrar Venda\n"
                    + "2 - Listar Vendas por CPF\n"
                    + "3 - Listar Vendas por CPF e Valor Mínimo\n"
                    + "4 - Sair\n"
                    + "🛒🛍");

            switch (operacao) {
                case "1":
                    String cpfVenda = JOptionPane.showInputDialog("Informe o CPF do Cliente: ");
                    String nomeProduto = JOptionPane.showInputDialog("Informe o Nome do Produto: ");
                    double precoProduto = Double
                            .parseDouble(JOptionPane.showInputDialog("Informe o Preço do Produto: "));
                    Produto produto = new Produto(nomeProduto, precoProduto);
                    venda.cadastroVenda(cpfVenda, produto);
                    JOptionPane.showMessageDialog(null, "Produto Cadastrado com Sucesso!", nomeProduto, 1);
                    break;
                case "2":
                    String cpfCliente = JOptionPane.showInputDialog("Informe o CPF do Cliente: ");
                    System.out.println(venda.listarProdutos(cpfCliente).toString());
                    break;
                case "3":
                    String cpfClienteFiltro = JOptionPane.showInputDialog("Informe o CPF do Cliente: ");
                    double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o Valor Mínimo: "));
                    try {
                        System.out.println(venda.listarProdutosFiltro(cpfClienteFiltro, valorMinimo).toString());
                    } catch (Exception e) {
                        System.err.println(e);
                    }
                case "4":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Insira uma opção válida!");
                    break;
            }

        } while (operacao != "4");
    }
}