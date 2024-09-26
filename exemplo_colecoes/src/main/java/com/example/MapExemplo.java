package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
    private Map<String, Integer> nomesIdades;

    public MapExemplo() {
        nomesIdades = new HashMap<>();
    }

    public void addNomeIdade(String nome, int idade) {
        nomesIdades.put(nome, idade);
        // System.out.println(nomesIdades);
        System.out.println(nomesIdades.keySet());
        // System.out.println(nomesIdades.getOrDefault(nome, idade));
    }

    public void listarNomesIdades(){
        System.out.println(nomesIdades);
    }

    public void removerNomesIdades(String nome){
        nomesIdades.remove(nome);
    }

    //modificar o valor da chave
    public void modificarValor(String nome, int novaIdade){
        nomesIdades.replace(nome, novaIdade);
    }
}
