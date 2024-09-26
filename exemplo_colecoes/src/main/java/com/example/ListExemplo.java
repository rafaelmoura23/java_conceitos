package com.example;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    private List<String> nomes;

    public ListExemplo() {
        nomes = new ArrayList<>();
    }

    // Adicionar
    public void addNome(String nome) {
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    // Listar
    public void listarNomes() {
        System.out.println(nomes);
    }

    // Remover
    public void removerNome(String nome) {
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // Modificar
    public void modificarNome(String nomeAntigo, String nomeNovo) {
        try {
            int index = nomes.indexOf(nomeAntigo);
            nomes.set(index, nomeNovo);
            System.out.println("Nome alterado com Sucesso!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}