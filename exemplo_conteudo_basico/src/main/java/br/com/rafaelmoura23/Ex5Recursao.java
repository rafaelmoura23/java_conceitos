package br.com.rafaelmoura23;

public class Ex5Recursao {
    public static int calcularFatorial(int n) {
        // Fatorial de 0 ou 1 é igual a 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursão
            return n * calcularFatorial(n - 1);
        }
    }

    public class ExceptionErro extends Exception {
        public ExceptionErro(String mensagem) {
            super(mensagem);
        }
    }
}
