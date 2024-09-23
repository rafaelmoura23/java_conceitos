package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa implements Avaliavel {
    private String matricula;
    private double nota;

    public Aluno(String nome, String cpf, String matricula, double nota) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = 0.0;
    }

    // Polimorfismo
    @Override
    public String exibirInfo() {
        super.exibirInfo();
        return "matricula: " + matricula + "nota: " + nota;
    }

    // Interface
    @Override
    public void avaliarDesempenho() {
        if (nota >= 7) {
            System.out.println("Aluno aprovado!");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Aluno em Recuperação!");
        } else {
            System.out.println("Aluno Reprovado!");
        }
    }

}
