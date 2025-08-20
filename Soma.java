import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        int soma = valor1 + valor2;
        System.out.println("A soma de " + valor1 + " e " + valor2 + " é: " + soma);

        scanner.close();
    }
}