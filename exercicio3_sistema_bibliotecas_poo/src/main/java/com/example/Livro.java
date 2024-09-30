package com.example;

public class Livro extends ItemBiblioteca implements Reservavel{

    public Livro(String titulo, String autor) {
        super(titulo, autor);
    }

    // abstract - Item Biblioteca
    @Override
    public int getDuracaoEmprestimo() {
        return 14; // 14 dias de emprestimo
    }

    // abstarct - Item Biblioteca
    @Override
    public void emprestar() {
        System.out.println("Empréstimo do livro: " + titulo + " por " + getDuracaoEmprestimo() + " dias.");
    }

    // interface - Reservavel
    @Override
    public void reservar() {
        System.out.println("Livro " + titulo + " reservado.");
    }

}
