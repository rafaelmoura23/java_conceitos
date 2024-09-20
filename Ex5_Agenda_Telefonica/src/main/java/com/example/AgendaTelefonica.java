package com.example;

public class AgendaTelefonica {
    // atributos
    private Contato[] contatos;
    private int contador;

    public AgendaTelefonica(int maxContato) {
        contatos = new Contato[maxContato];
        contador = 0;
    }

    // métodos
    // adicionar
    public void addContato(Contato contato) throws AgendaCheiaException {
        if (contador >= contatos.length) {
            throw new AgendaCheiaException("Agenda Cheia");
        }
        contatos[contador] = contato;
        contador++;
        System.out.println("Contato Adicionado com Sucesso!");
    }

    // listar
    public void listarContato() {
        if (contador == 0) {
            System.out.println("Agenda Vazia!");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(contatos[i].toString());
            }
        }
    }

    // buscar
    public Contato buscarContato(String nome) throws ContatoNaoEncontadoException {
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                return contatos[i];
            }
        }
        throw new ContatoNaoEncontadoException("Contato não encontrado!");
    }

    // remover
    public void removerContato(String nome) throws ContatoNaoEncontadoException {
        boolean encontrado = false;
        for (int i = 0; i < contador; i++) {
            if (contatos[i].getNome().equalsIgnoreCase(nome)) {
                encontrado = true;
                contatos[i] = contatos[contador - 1];
                contatos[contador - 1] = null;
                contador--;
                System.out.println("Contato Removido com Sucesso!");
            }
        }
        if (!encontrado) {
            throw new ContatoNaoEncontadoException("Contato não encontrado!");
        }
    }
}
