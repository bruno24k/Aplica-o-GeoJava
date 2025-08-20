import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        int subtracao = valor1 - valor2;
        System.out.println("A subtração de " + valor1 + " menos " + valor2 + " é: " + subtracao);

        scanner.close();
    }
}