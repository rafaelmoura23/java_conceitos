package com.example;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();

    public void addAlunos(Aluno aluno) {
        alunos.add(aluno);
        System.out.println("Aluno adicionado com sucesso!");
        aluno.exibirInfo();
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
        System.out.println("Professor adicionado com sucesso!");
    }

    public String mediaAluno() {
        double media = 0;
        if (alunos.isEmpty()) {
            return "Notas vazias!";
        } else {
            for (Aluno aluno : alunos) {

                media += aluno.getNota();

            }
            double mediaGeral = media / alunos.size();
            return "Media Geral: " + mediaGeral;
        }
    }

    public void menu() {
        int operacao = 0;
        do {
            try {
                operacao = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nGerenciamento de Funcionários\n 1- Adicionar Aluno \n 2- Adicionar Professor\n 3- Remover Funcionários\n 4-Calcular Média Salarial\n 5-Sair"));
            } catch (Exception e) {
                System.err.println(e);
                operacao = 0;
            }
            switch (operacao) {
                case 1: // aluno
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
                    String matricula = JOptionPane.showInputDialog("Digite a matrícula");
                    double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
                    addAlunos(new Aluno());
                    break;
                case 2: // professor
                    // String nomep = JOptionPane.showInputDialog("Digite o nome: ");
                    // String cpfp = JOptionPane.showInputDialog("Digite o cpf: ");
                    // double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário"));
                    // addProfessor(new Professor());
                    break;
                case 3:
                    mediaAluno();
                    break;
                case 4:

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
