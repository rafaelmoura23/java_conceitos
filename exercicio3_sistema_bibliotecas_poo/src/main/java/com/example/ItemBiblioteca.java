package com.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class ItemBiblioteca {
    protected String titulo;
    protected String autor;

    public abstract int getDuracaoEmprestimo();

    public abstract void emprestar();
}
