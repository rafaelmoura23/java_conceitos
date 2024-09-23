package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        FuncionarioController gerencia = new FuncionarioController();
        int operacao = 0;

        do {
            try {
                operacao = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\n ===== Gerenciamento de Funcionários =====\n 1- Adicionar Funcionário \n 2- Listar Funcionários\n 3- Remover Funcionários\n 4-Calcular Média Salarial\n 5-Sair"));
            } catch (Exception e) {
                System.err.println(e);
                operacao = 0;
            }
            switch (operacao) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Digite um nome: ");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                    double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário: "));
                    gerencia.addFuncionario(new Funcionario(nome, idade, salario));
                    break;
                case 2:
                    gerencia.listarFuncionarios();
                    break;
                case 3:
                    String nome_remover = JOptionPane.showInputDialog("Digite o nome do Funcionário a ser removido: ");
                    gerencia.removerFuncionario(nome_remover);
                    break;
                case 4:
                    gerencia.mediaSal();
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
                    break;
            }
        } while (operacao != 5);
    }
}