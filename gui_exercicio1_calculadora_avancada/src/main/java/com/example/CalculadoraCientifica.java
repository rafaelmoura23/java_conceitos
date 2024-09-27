package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCientifica extends JPanel {
    private JTextField resultado;

    public CalculadoraCientifica() {
        setLayout(new BorderLayout());

        // Criação do campo de resultado
        resultado = new JTextField();
        resultado.setEditable(false);
        add(resultado, BorderLayout.NORTH);

        // Criação do painel de botões
        JPanel botoesPanel = new JPanel(new FlowLayout());
        String[] botoes = { "x^y", "√x", "log(x)", "C" };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    acaoBotao(e.getActionCommand());
                }
            });
            botoesPanel.add(botao);
        }

        add(botoesPanel, BorderLayout.CENTER);
    }

    private void acaoBotao(String comando) {
        if (comando.equals("C")) {
            resultado.setText("");
            return;
        }
        
        try {
            double numero = Double.parseDouble(resultado.getText());
            double resultadoFinal = 0;

            switch (comando) {
                case "x^y":
                    String input = JOptionPane.showInputDialog("Digite a potência:");
                    if (input != null) {
                        double potencia = Double.parseDouble(input);
                        resultadoFinal = Math.pow(numero, potencia);
                    }
                    break;
                case "√x":
                    resultadoFinal = Math.sqrt(numero);
                    break;
                case "log(x)":
                    resultadoFinal = Math.log(numero);
                    break;
            }
            resultado.setText(String.valueOf(resultadoFinal));
        } catch (NumberFormatException ex) {
            resultado.setText("Erro");
        }
    }
}

