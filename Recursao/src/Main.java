import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;

        while (entradaValida) {
            try {
                System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
                int numero = scanner.nextInt();

                if (numero < 0) {
                    throw new ExceptionErro("Número negativo não é permitido.");
                }

                int resultado = Recursao.calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é " + resultado);
                entradaValida = true;

            } catch (ExceptionErro e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next();
            }
            entradaValida = false;
        }

        scanner.close();

    }

}
