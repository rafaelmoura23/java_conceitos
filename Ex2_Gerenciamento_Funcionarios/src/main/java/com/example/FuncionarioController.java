package com.example;

import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        funcionarios = new ArrayList<>();
    }

    // Adicionar Funcionário
    public void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
        
    }

    // Listar Funcionários
    public void listarFuncionarios() {
        if (funcionarios.size() == 0) {
            System.out.println("Lista vazia");
        } else {
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario.toString());
            }
        }
    }

    // Deletar Funcionário
    public void removerFuncionario(String nome) {
        try {
            boolean encontrado = true;
            for (Funcionario funcionario : funcionarios) {
                if (funcionario.getNome().equalsIgnoreCase(nome)) {
                    funcionarios.remove(funcionario);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                throw new Exception("Funcionário não existe!");
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // Média Salarial
    public double mediaSal() {
        double mediaSal = 0;
        if (funcionarios.size() == 0) {
            return mediaSal;
        } else {
            for (Funcionario funcionario : funcionarios) {
                mediaSal += funcionario.getSalario();
            }
            return mediaSal / funcionarios.size();
        }
    }

}
