import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        if (valor2 != 0) {
            double divisao = (double) valor1 / valor2;
            System.out.println("A divisão de " + valor1 + " por " + valor2 + " é: " + divisao);
        } else {
            System.out.println("Ops! Não é possível dividir por zero.");
        }

        scanner.close();
    }
}