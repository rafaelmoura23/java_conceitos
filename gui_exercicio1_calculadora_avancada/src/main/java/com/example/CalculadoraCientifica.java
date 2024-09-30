package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraCientifica extends JPanel {
    private JTextField resultado;

    public CalculadoraCientifica() {
        setLayout(new BorderLayout());

        // campo de resultado
        resultado = new JTextField();
        resultado.setEditable(false);
        add(resultado, BorderLayout.NORTH);

        // painel de botões
        JPanel botoesPanel = new JPanel(new FlowLayout());
        String[] botoes = { "x^y", "√x", "log(x)", "C" };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.addActionListener(new BotaoClickListener());
            botoesPanel.add(botao);
        }

        add(botoesPanel, BorderLayout.CENTER);
    }

    private class BotaoClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String comando = e.getActionCommand();

            switch (comando) {
                case "C":
                    resultado.setText("");
                    break;
                case "x^y":
                    calcularPotencia();
                    break;
                case "√x":
                    calcularRaiz();
                    break;
                case "log(x)":
                    calcularLogaritmo();
                    break;
                default:
                    break;
            }
        }


        // metodo para calcular protencia
        public void calcularPotencia() {
           
        }

        // metodo para calcular raiz
        public void calcularRaiz() {
            
        }

        // metodo para calcular log
        public void calcularLogaritmo() {
            
        }
    }
}
