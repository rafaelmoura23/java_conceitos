import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("Menu:");
                System.out.println("1. Soma");
                System.out.println("2. Subtração");
                System.out.println("3. Multiplicação");
                System.out.println("4. Divisão");
                System.out.println("5. Raiz Quadrada");
                System.out.println("6. Sair");
                System.out.print("Escolha uma opção: ");
                
                int escolha = scanner.nextInt();
                Operacao operacao = null;
                double resultado = 0;
                
                switch (escolha) {
                    case 1:
                        operacao = new Soma();
                        break;
                    case 2:
                        operacao = new Subtracao();
                        break;
                    case 3:
                        operacao = new Multiplicacao();
                        break;
                    case 4:
                        operacao = new Divisao();
                        break;
                    case 5:
                        operacao = new RaizQuadrada();
                        break;
                    case 6:
                        continuar = false;
                        System.out.println("Sair");
                        continue;
                    default:
                        System.out.println("Escolha inválida. Tente novamente.");
                        continue;
                }

                double num1 = 0, num2 = 0;
                if (escolha != 5) {
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();
                } else {
                    System.out.print("Digite o número: ");
                    num1 = scanner.nextDouble();
                }

                try {
                    if (escolha == 5) {
                        resultado = operacao.calcular(num1, 0); 
                    } else {
                        resultado = operacao.calcular(num1, num2);
                    }
                    System.out.println("Resultado: " + resultado);
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}
