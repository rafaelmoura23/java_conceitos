package br.com.rafaelmoura23;

import java.util.Scanner;

public class Ex1SistemaNotas {
    double[] notas = new double[4];
    double mediaNotas = 0;
    boolean bonus = true;
    Scanner sc = new Scanner(System.in);

    public void calculosNotas() {
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            mediaNotas+=notas[i];

            if (notas[i] < 9) {
                bonus = false;
            }
        }
        mediaNotas/=notas.length;

        if (bonus) {
            mediaNotas = (mediaNotas * 1.1 > 10 ? mediaNotas = 10 : mediaNotas * 1.1);
        }

        if (mediaNotas >= 7) {
            System.out.println("Aprovado " + mediaNotas);
        } else if(mediaNotas >= 5 && mediaNotas < 7){
            System.out.println("Recuperação " + mediaNotas);
        } else {
            System.out.println("Reprovado " + mediaNotas);
        }
    }
}
