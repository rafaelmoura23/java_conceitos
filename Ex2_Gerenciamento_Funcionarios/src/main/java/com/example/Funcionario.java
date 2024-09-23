package com.example;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Funcionario {
    private String nome;
    private int idade;
    private double salario;

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade + " | Salário: " + salario;
    }
}
