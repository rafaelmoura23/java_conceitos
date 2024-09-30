package com.example;

public class Main {
    public static void main(String[] args) {
        Usuario user = new Usuario("Rafael", "123");

        Livro livro = new Livro("1984", "George Orwell");

        Revista revista = new Revista("Turma da Mônica", "Mauricio de Souza");

        MaterialEletronico materialEletronico = new MaterialEletronico("Java", "me");

        user.emprestarItem(livro);
        user.emprestarItem(revista);
        user.emprestarItem(materialEletronico);

        livro.reservar();
        user.devolverItem(livro);
    }
}