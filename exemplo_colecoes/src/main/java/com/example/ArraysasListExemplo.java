package com.example;

import java.util.*;

public class ArraysasListExemplo {
    private String[] nomes = {"Maria", "João", "Pedro"};
    private List<String> nomesList;

    public ArraysasListExemplo(){
        nomesList = new ArrayList<>(Arrays.asList(nomes));
    }

    public void addArray(String nome){
        try {
            nomes[3] = nome;
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void addNome(String nome){
        nomesList.add(nome);
        System.out.println("Nome adicionado com sucesso!");
    }

    public void listarNome(){
        System.out.println(nomesList);
    }

    
}
