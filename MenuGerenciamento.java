import java.util.Scanner;

public class MenuGerenciamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Menu Principal:");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Cadastro");
            System.out.println("3. Cadastrar Produto");
            System.out.println("4. Excluir Produto");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Cadastrando Usuário...");
                    break;
                case 2:
                    System.out.println("Atualizando Cadastro...");
                    break;
                case 3:
                    System.out.println("Cadastrando Produto...");
                    break;
                case 4:
                    System.out.println("Excluindo Produto...");
                    break;
                case 5:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
            System.out.println();
        } while (opcao != 5);

        scanner.close();
    }
}