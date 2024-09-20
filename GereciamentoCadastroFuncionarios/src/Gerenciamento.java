import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Gerenciamento {
    // array para adicionar os funcionarios
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        boolean rodando = true;


        while (rodando) {
            
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma Opção: ", opcao));

            switch (opcao) {
                case 1:
                    adicionarFuncionario();
                    break;
                case 2:
                    removerFuncionario();
                    break;
                case 3:
                    listarFuncionarios();
                    break;
                case 4:
                    calcularMediaSalarial();
                    break;
                case 5:
                    System.out.println("Sair");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    // Adicionar o funcionario ao array
    private static void adicionarFuncionario() {
        String nome = JOptionPane.showInputDialog("Informe o nome do Funcionário: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade do Funcionário: "));
        Double salario = (double) Integer.parseInt(JOptionPane.showInputDialog("Informe o salário do Funcionário: "));

        // Cria um nobvo objeto e insere no array
        Funcionario funcionario = new Funcionario(nome, idade, salario);
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado com sucesso!");
    }

    // Remover o funcionario através do nome
    private static void removerFuncionario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do funcionário a ser removido: ");
        String nome = scanner.nextLine();

        Funcionario funcionarioRemover = null;
        for (Funcionario func : funcionarios) {
            // ignorar letras maiusculas
            if (func.nome.equalsIgnoreCase(nome)) {
                funcionarioRemover = func;
                break;
            }
        }

        if (funcionarioRemover != null) {
            funcionarios.remove(funcionarioRemover);
            System.out.println("Funcionário removido com sucesso!");
            scanner.close();
        }
    }

    // Listar os funcionarios que estão no array
    private static void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario func : funcionarios) {
                System.out.println(func);
            }
        }
    }

    // Media Salarial
    private static void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado");
            return;
        }

        double somaSalarios = 0;
        for (Funcionario func : funcionarios) {
            somaSalarios += func.salario;
        }

        double mediaSalarial = somaSalarios / funcionarios.size();
        System.out.println("Média Salarial: " + mediaSalarial);
    }
}
