package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Produto {
    // atributos
    private String nome;
    private double preco;

    @Override
    public String toString() {
        return "Produto: " + nome + "c| Preço: " + preco;
    }
}
