package com.example;

public class MaterialEletronico extends ItemBiblioteca {

    public MaterialEletronico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int getDuracaoEmprestimo() {
        return 7; // emprestimo de 7 dias
    }

    @Override
    public void emprestar() {
        System.out.println("Empréstimo do material eletrônico: " + titulo + " por " + getDuracaoEmprestimo() + " dias.");
    }

}
