package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Vendas {
    // atributos
    private Map<String, List<Produto>> vendasCPF;

    // contrutor
    public Vendas() {
        vendasCPF = new HashMap<>();
    }

    // metodos
    // cadastrar - venda
    public void cadastroVenda(String cpf, Produto p) {
        for (String cpfUsuario : vendasCPF.keySet()) {
            if (cpfUsuario.equals(cpf)) {
                List<Produto> produtosCPF = vendasCPF.get(cpf);
                produtosCPF.add(p);
                vendasCPF.put(cpf, produtosCPF);
                return;
            }
        }
        List<Produto> produtosCPFVazio = new ArrayList<>();
        produtosCPFVazio.add(p);
        vendasCPF.put(cpf, produtosCPFVazio);
    }

    // listar - produtos de algum cpf
    public List<Produto> listarProdutos(String cpf) {
        List<Produto> listaCPF = vendasCPF.getOrDefault(cpf, Collections.emptyList());
        return listaCPF;
    }

    // listar - com filtro(stream)
    public List<Produto> listarProdutosFiltro(String cpf, double valorMinimo) throws Exception {
        List<Produto> listaCpfFiltro = vendasCPF.getOrDefault(cpf, Collections.emptyList());
        if (listaCpfFiltro.isEmpty()) {
            throw new Exception("CPF não encontrado");
        } else {
            List<Produto> resultado = listaCpfFiltro.stream()
                    .filter(p -> p.getPreco() >= valorMinimo)
                    .collect(Collectors.toList());
            return resultado;
        }
    }
}
