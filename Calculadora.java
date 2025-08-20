import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int valor2 = scanner.nextInt();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (valor1 + valor2));
                break;
            case '-':
                System.out.println("Resultado: " + (valor1 - valor2));
                break;
            case '*':
                System.out.println("Resultado: " + (valor1 * valor2));
                break;
            case '/':
                if (valor2 != 0) {
                    System.out.println("Resultado: " + ((double) valor1 / valor2));
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}