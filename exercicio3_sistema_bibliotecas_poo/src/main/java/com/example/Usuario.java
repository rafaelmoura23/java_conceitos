package com.example;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String cpf;
    List<ItemBiblioteca> itensEmprestados;

    public Usuario(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.itensEmprestados = new ArrayList<>();
    }

    public void emprestarItem(ItemBiblioteca item) {
        itensEmprestados.add(item);
        item.emprestar();
    }

    public void devolverItem(ItemBiblioteca item) {
        itensEmprestados.remove(item);
        System.out.println("Item " + item.getTitulo() + " devolvido.");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public List<ItemBiblioteca> getItensEmprestados() {
        return itensEmprestados;
    }
}
