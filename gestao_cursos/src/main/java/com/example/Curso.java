package com.example;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Curso {
    private String nomeCurso;
    private List<Aluno> alunos;
    private Professor professor;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    // Adicionar Professor no Curso
    public void addProf(Professor professor) {
        this.professor = professor;
    }

    // Adicionar Alunos
    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    // Lançar Notas
    public void lancarNotas(String nomeAluno, double notaAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setNota(notaAluno);
                System.out.println("Nota inserida com Sucesso!");
                return;
            }
        }
        System.out.println("Aluno não encontrado!");
    }

    // Exibir notas de todos os alunos

    public void resultadoFinal() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.exibirInfo());
            aluno.avaliarDesempenho();
        }
    }

    public void menu() {
        int operacao = 0;
        do {
            try {
                operacao = Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        "\nGerenciamento de Funcionários\n 1- Adicionar Aluno \n 2- Adicionar Professor\n 3- Lançar Notas \n 4- Resultado Final\n 5-Sair"));
            } catch (Exception e) {
                System.err.println(e);
                operacao = 0;
            }
            switch (operacao) {
                case 1: // aluno
                    String nome = JOptionPane.showInputDialog("Digite o nome: ");
                    String cpf = JOptionPane.showInputDialog("Digite o cpf: ");
                    String matricula = JOptionPane.showInputDialog("Digite a matrícula");
                    double nota = 0.0;
                    addAluno(new Aluno(nome, cpf, matricula, nota));
                    break;
                case 2: // professor
                    addProf(professor);
                    break;
                case 3:
                    String nomel = JOptionPane.showInputDialog("Digite o nome: ");
                    double notal = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
                    lancarNotas(nomel, notal);
                    break;
                case 4:
                    resultadoFinal();
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
