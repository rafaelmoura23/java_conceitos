package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa {
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
        return "nome: " + getNome() + "cpf: " + getCpf() + "matricula: " + matricula;
    }
}
