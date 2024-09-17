import java.util.Scanner;

public class SistemaAlunos {
    public static void main(String[] args) {

        // importando scanner para ler as informações que o usuario digitar
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[4];
        double somaNotas = 0;
        double media = 0;

        for (int i = 0; i <= 3; i++) {
            System.out.println("Digite sua a " + (i + 1) + "ª nota: ");
            notas[i] = scanner.nextInt();
            somaNotas+=notas[i];
        }

        scanner.close();
        media = somaNotas / notas.length;


        if (somaNotas >= 36) {
            media = media * 1.1;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        System.out.println("Soma Final: " + somaNotas);
        System.out.println("Média Final: " + media);

        if (media >= 7) {
            System.out.println("Aluno Aprovado!");
        } else if(media >= 5 && media <= 6.9){
            System.out.println("Aluno em Recuperação!");
        } else{
            System.out.println("Aluno Reprovado!");
        }
    }
}
