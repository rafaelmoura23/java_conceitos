package br.com.rafaelmoura23;

import java.util.Scanner;

public class Ex5Recursao {
    int numero = -1;
    Scanner sc = new Scanner(System.in);

    public long calculoFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculoFatorial(n - 1);
        }
    }

    public void calculadora() throws Exception{
        System.out.print("Digite um número:");
        numero = sc.nextInt();

       
            
        if(numero < 0) {
            throw new Exception("O número deve ser Positivo.");
        }

        try {
            System.out.println(calculoFatorial(numero));
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
