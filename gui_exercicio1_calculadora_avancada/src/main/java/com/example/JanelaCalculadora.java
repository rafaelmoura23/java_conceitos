package com.example;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaCalculadora extends JFrame {

    public JanelaCalculadora() {
        super("Calculadora Avançada");

        // Configurações da janela
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Criação do JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Adicionando as abas
        CalculadoraSimples simples = new CalculadoraSimples();
        CalculadoraCientifica cientifica = new CalculadoraCientifica();

        tabbedPane.addTab("Calculadora Simples", simples);
        tabbedPane.addTab("Calculadora Científica", cientifica);

        // Adicionando o JTabbedPane à janela
        this.add(tabbedPane);
        
        // Tornar a janela visível
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new JanelaCalculadora();
    }
}
