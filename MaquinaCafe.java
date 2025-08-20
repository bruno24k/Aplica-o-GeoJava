import java.util.Scanner;

public class MaquinaCafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu de Cafés:");
        System.out.println("1. Expresso");
        System.out.println("2. Cappuccino");
        System.out.println("3. Latte");
        System.out.println("4. Mocha");
        System.out.println("5. Sair");

        System.out.print("Escolha o número do café desejado: ");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1: System.out.println("Preparando Expresso..."); break;
            case 2: System.out.println("Preparando Cappuccino..."); break;
            case 3: System.out.println("Preparando Latte..."); break;
            case 4: System.out.println("Preparando Mocha..."); break;
            case 5: System.out.println("Saindo..."); break;
            default: System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}