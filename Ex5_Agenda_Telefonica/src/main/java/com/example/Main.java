package com.example;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        AgendaTelefonica agenda = new AgendaTelefonica(5);

        int operador = 0;
        try{
        do {
            System.out.println("\n ==== Agenda Telefônica ==== ");
            System.out.println("1- Adicionar Contato");
            System.out.println("2- Listar Contato");
            System.out.println("3- Buscar Contato");
            System.out.println("4- Remover Contato");
            System.out.println("5- Sair");
            try{
            operador = Integer.parseInt(JOptionPane.showInputDialog("Informe a Operação"));
            }catch(NumberFormatException e){
                System.err.println(e);
                operador = 0;
            }
            switch (operador) {
                case 1:
                try{
                    String nome = JOptionPane.showInputDialog("Informe o nome: ");
                    String telefone = JOptionPane.showInputDialog("Informe o Telefone: ");
                    Contato contato = new Contato(nome, telefone);
                    agenda.addContato(contato);
                } catch(Exception e){
                    System.err.println(e);
                }
                    break;
                case 2:
                    agenda.listarContato();
                    break;
                case 3:
                try{
                    String nome = JOptionPane.showInputDialog("Informe o nome");
                    System.out.println(agenda.buscarContato(nome).toString());
                } catch(Exception e){
                    System.err.println(e);
                }
                    break;
                case 4:
                try{
                    String nome = JOptionPane.showInputDialog("Informe o nome");
                    agenda.removerContato(nome);
                } catch(Exception e){
                    System.err.println(e);
                }
                    break;
                default:
                System.out.println("Digite um Número Válido!");
                    break;
            }
        } while (operador!=5);
    } catch (Exception e){

    }
    }
}