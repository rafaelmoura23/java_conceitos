package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSimples extends JPanel {
    private JTextField resultado;
    private String operador;
    private double num1, num2;

    public CalculadoraSimples() {
        setLayout(new BorderLayout());

        // campo de resultado
        resultado = new JTextField();
        resultado.setEditable(false);
        add(resultado, BorderLayout.NORTH);

        // painel de botões
        JPanel botoesPanel = new JPanel(new GridLayout(4, 4));
        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.addActionListener(new BotaoClickListener());
            botoesPanel.add(botao);
        }

        add(botoesPanel, BorderLayout.CENTER);
    }

    // ações para botões da calculadora
    public class BotaoClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            switch (comando) {
                case "C":
                    resultado.setText("");
                    operador = null;
                    break;
                case "=":
                    if (operador != null) {
                        num2 = Double.parseDouble(resultado.getText());
                        double resultadoFinal = calcular(num1, num2, operador);
                        resultado.setText(String.valueOf(resultadoFinal));
                        operador = null;
                    }
                    break;
                case "/":
                case "*":
                case "-":
                case "+":
                    num1 = Double.parseDouble(resultado.getText());
                    operador = comando;
                    resultado.setText("");
                    break;
                default:
                    resultado.setText(resultado.getText() + comando);
            }
        }


        // metodo para as operacoes
        public double calcular(double num1, double num2, String operador) {
            switch (operador) {
                case "+":
                    return num1 + num2;
                case "-":
                    return num1 - num2;
                case "*":
                    return num1 * num2;
                case "/":
                    if (num2 != 0) {
                        return num1 / num2;
                    } else {
                        JOptionPane.showMessageDialog(null, "Divisão por zero não é permitida.");
                        return 0.0;
                    }
                default:
                    return 0;
            }
        }
    }
}
