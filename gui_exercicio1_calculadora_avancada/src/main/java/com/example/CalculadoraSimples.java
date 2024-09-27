package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples extends JPanel {
    private JTextField resultado;
    private String operador = "";
    private double operando1 = 0;

    public CalculadoraSimples() {
        setLayout(new BorderLayout());

        // Criação do campo de resultado
        resultado = new JTextField();
        resultado.setEditable(false);
        add(resultado, BorderLayout.NORTH);

        // Criação do painel de botões
        JPanel botoesPanel = new JPanel(new GridLayout(4, 4));
        String[] botoes = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

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
        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            resultado.setText(resultado.getText() + comando);
        } else if (comando.equals("C")) {
            resultado.setText("");
            operando1 = 0;
            operador = "";
        } else if (comando.equals("=")) {
            calcular();
        } else {
            if (!operador.isEmpty()) {
                calcular();
            }
            operando1 = Double.parseDouble(resultado.getText());
            operador = comando;
            resultado.setText("");
        }
    }

    private void calcular() {
        double operando2 = Double.parseDouble(resultado.getText());
        double resultadoFinal = 0;

        switch (operador) {
            case "+":
                resultadoFinal = operando1 + operando2;
                break;
            case "-":
                resultadoFinal = operando1 - operando2;
                break;
            case "*":
                resultadoFinal = operando1 * operando2;
                break;
            case "/":
                resultadoFinal = (operando2 != 0) ? operando1 / operando2 : Double.NaN;
                break;
        }
        resultado.setText(String.valueOf(resultadoFinal));
        operador = "";
    }
}
