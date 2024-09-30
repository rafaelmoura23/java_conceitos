package com.example;

public class Revista extends ItemBiblioteca {

    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public int getDuracaoEmprestimo() {
        return 7; // emprestimo de 7 dias
    }


    @Override
    public void emprestar() {
        System.out.println("Empréstimo da revista: " + titulo + " por " + getDuracaoEmprestimo() + " dias.");
    }

}
