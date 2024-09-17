import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    private static ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;
        int opcao = 1;

        while (rodando) {
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    removerContato();
                    break;
                case 3:
                    listarContatos();
                    break;
                case 4:
                    System.out.println("Sair");
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

        scanner.close();
    }

    private static void adicionarContato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o Nome do Contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o Telefone do Contato: ");
        String telefone = scanner.nextLine();
        scanner.nextLine();

        // Cria um nobvo objeto e insere no array
        Contato contato = new Contato(nome, telefone);
        contatos.add(contato);
        System.out.println("Contato adicionado com sucesso!");
        scanner.close();
    }

    private static void removerContato() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do Contatao a ser removido: ");
        String nome = scanner.nextLine();

        Contato removerContato = null;
        for (Contato cont : contatos) {
            // ignorar letras maiusculas
            if (cont.nome.equalsIgnoreCase(nome)) {
                removerContato = cont;
                break;
            }
        }

        if (removerContato != null) {
            contatos.remove(removerContato);
            System.out.println("Contato removido com sucesso!");
            scanner.close();
        }
    }

        private static void listarContatos() {
            if (contatos.isEmpty()) {
                System.out.println("Nenhum Contato cadastrado.");
            } else {
                System.out.println("Lista de Contatos:");
                for (Contato cont : contatos) {
                    System.out.println(cont);
                }
            }
        }

}
