package br.com.rafaelmoura23;

import java.util.Scanner;

public class Ex3CalculadoraAvancada {
    double a;
    double b;
    double resultado;
    int escolha;
    Scanner sc = new Scanner(System.in);

    // Operações

    // Soma
    public double som(double a, double b) {
        resultado = a + b;
        return resultado;
    }

    // Subtração
    public double sub(double a, double b) {
        resultado = a - b;
        return resultado;
    }

    // Multiplicação
    public double mult(double a, double b) {
        resultado = a * b;
        return resultado;
    }

    // Divisão
    public double div(double a, double b) {
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.err.println(e);
        }
        return resultado;
    }

    // Raiz
    public double raiz(double a) throws Exception {
        if (a < 0) {
            throw new IllegalArgumentException("Raiz quadrada de número negativo não permitida.");
        }
        try {
            resultado = Math.sqrt(a);
        } catch (Exception e) {
            System.err.println(e);
        }
        return resultado;
    }

    public void menu() {
        System.out.println("Calculadora:");
        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");
        System.out.println("5. Raiz Quadrada");
        System.out.println("6. Sair");
    }

    public void entradaDados() {
        if (escolha >= 1 && escolha < 5) {
            System.err.print("Digite o Valor a: ");
            a = sc.nextDouble();
            System.err.print("Digite o Valor b: ");
            b = sc.nextDouble();
        } else if (escolha == 5) {
            System.err.print("Digite o Valor a: ");
            a = sc.nextDouble();
        } else if (escolha == 6) {
            System.out.println("Saindo...");
        } else {
            System.out.println("Escolha inválida. Tente novamente.");
        }
    }

    public void calculadora() {
        do {
            menu();
            try {
                escolha = sc.nextInt();
                switch (escolha) {
                    case 1:
                        entradaDados();
                        som(a, b);
                        break;
                    case 2:
                        entradaDados();
                        sub(a, b);
                        break;
                    case 3:
                        entradaDados();
                        mult(a, b);
                        break;
                    case 4:
                        entradaDados();
                        div(a, b);
                        break;
                    case 5:
                        entradaDados();
                        raiz(a);
                        break;
                    case 6:
                        entradaDados();
                        break;
                    default:
                        entradaDados();
                        break;
                }
            } catch (Exception e) {
                System.err.println(e);
            }
        } while (escolha != 6);
    }
}
