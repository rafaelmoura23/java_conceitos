package com.example;

public class Revista extends ItemBiblioteca {

    public Revista(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void emprestar() {
        System.out.println("Empréstimo da revista: " + titulo + " por " + getDuracaoEmprestimo() + " dias.");
    }

}
