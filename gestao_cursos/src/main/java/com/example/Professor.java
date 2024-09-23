package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = 0.0;
    }

    // Polimorfismo
    @Override
    public String exibirInfo() {
        super.exibirInfo();
        return "salario: " + salario;
    }
}
