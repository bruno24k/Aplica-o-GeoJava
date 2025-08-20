import java.util.Scanner;

public class Multiplicacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        int multiplicacao = valor1 * valor2;
        System.out.println("A multiplicação de " + valor1 + " por " + valor2 + " é: " + multiplicacao);

        scanner.close();
    }
}