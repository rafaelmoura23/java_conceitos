package com.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Aluno extends Pessoa {
    private int matricula;
    private double nota;

    Pessoa pessoa = new Pessoa();

    @Override
    public String exibirInformacoes() {
        return "nome: " + pessoa.getNome() + "cpf: " + pessoa.getCpf() + "salario: " + "matricula: " + matricula;
    }
}
