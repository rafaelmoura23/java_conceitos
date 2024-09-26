package com.example;

public class Main {
    public static void main(String[] args) {
        // ListExemplo list = new ListExemplo();
        // list.addNome("Maria");
        // list.addNome("João");
        // list.addNome("Pedro");
        // list.listarNomes();
        // list.modificarNome("Pedro", "Maria");
        // list.listarNomes();
        // list.removerNome("Maria");
        // list.listarNomes();

        // SetExemplo list = new SetExemplo();
        // list.addNome("Maria");
        // list.addNome("João");
        // list.addNome("Pedro");
        // list.listarNomes();
        // list.removerNome("Maria");
        // list.listarNomes();

        MapExemplo list = new MapExemplo();
        list.addNomeIdade("Maria", 30);
        list.addNomeIdade("Pedro", 10);
        list.addNomeIdade("João", 25);
        list.listarNomesIdades();
        list.modificarValor("Maria", 7);
        list.listarNomesIdades();
        list.removerNomesIdades("Maria");
        list.listarNomesIdades();
    }
}