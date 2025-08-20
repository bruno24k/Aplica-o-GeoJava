import java.util.Scanner;

public class MediaFrequenciaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a frequência do aluno (em %): ");
        double frequencia = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 6 && frequencia >= 75) {
            System.out.println(nome + " está APROVADO com média " + media + " e frequência " + frequencia + "%.");
        } else {
            System.out.println(nome + " está REPROVADO com média " + media + " e frequência " + frequencia + "%.");
        }

        scanner.close();
    }
}