package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pessoa {
    private String nome;
    private String cpf;


    public String exibirInfo(){
        return "Nome: " + nome + "Cpf: " + cpf;
    }
}
