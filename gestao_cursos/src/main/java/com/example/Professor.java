package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Professor extends Pessoa {
    private double salario;

    Pessoa pessoa = new Pessoa();

    @Override
    public String exibirInfo() {
        return "nome: " + pessoa.getNome() + "cpf: " + pessoa.getCpf() + "salario: " + salario;
    }
}
