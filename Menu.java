import java.util.Scanner;

public class Menu {
    private GeometriaPlana gp;
    private GeometriaEspacial ge;
    private Scanner scanner;

    public Menu() {
        gp = new GeometriaPlana();
        ge = new GeometriaEspacial();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n===== MENU GEOMETRIA =====");
            System.out.println("1. Geometria Plana");
            System.out.println("2. Geometria Espacial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    menuPlana();
                    break;
                case 2:
                    menuEspacial();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        scanner.close();
    }

    private void menuPlana() {
        System.out.println("\n--- Geometria Plana ---");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Polígono Regular");
        System.out.print("Escolha a figura: ");
        int fig = scanner.nextInt();
        switch (fig) {
            case 1:
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", gp.areaCirculo(raio));
                System.out.printf("Perímetro: %.2f\n", gp.perimetroCirculo(raio));
                break;
            case 2:
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", gp.areaRetangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", gp.perimetroRetangulo(base, altura));
                break;
            case 3:
                System.out.print("Base: ");
                double baseT = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaT = scanner.nextDouble();
                System.out.print("Lado 1: ");
                double l1 = scanner.nextDouble();
                System.out.print("Lado 2: ");
                double l2 = scanner.nextDouble();
                System.out.print("Lado 3: ");
                double l3 = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", gp.areaTriangulo(baseT, alturaT));
                System.out.printf("Perímetro: %.2f\n", gp.perimetroTriangulo(l1, l2, l3));
                break;
            case 4:
                System.out.print("Número de lados: ");
                int n = scanner.nextInt();
                System.out.print("Medida do lado: ");
                double lado = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", gp.areaPoligonoRegular(lado, n));
                System.out.printf("Perímetro: %.2f\n", gp.perimetroPoligonoRegular(lado, n));
                break;
            default:
                System.out.println("Figura inválida!");
        }
    }

    private void menuEspacial() {
        System.out.println("\n--- Geometria Espacial ---");
        System.out.println("1. Cubo");
        System.out.println("2. Esfera");
        System.out.println("3. Cilindro");
        System.out.println("4. Prisma Retangular");
        System.out.print("Escolha o sólido: ");
        int solido = scanner.nextInt();
        switch (solido) {
            case 1:
                System.out.print("Lado: ");
                double ladoC = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", ge.volumeCubo(ladoC));
                System.out.printf("Área superficial: %.2f\n", ge.areaCubo(ladoC));
                break;
            case 2:
                System.out.print("Raio: ");
                double raioE = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", ge.volumeEsfera(raioE));
                System.out.printf("Área superficial: %.2f\n", ge.areaEsfera(raioE));
                break;
            case 3:
                System.out.print("Raio: ");
                double raioCi = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaCi = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", ge.volumeCilindro(raioCi, alturaCi));
                System.out.printf("Área superficial: %.2f\n", ge.areaCilindro(raioCi, alturaCi));
                break;
            case 4:
                System.out.print("Base: ");
                double baseP = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaP = scanner.nextDouble();
                System.out.print("Comprimento: ");
                double comprimentoP = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", ge.volumePrismaRetangular(baseP, alturaP, comprimentoP));
                System.out.printf("Área superficial: %.2f\n", ge.areaPrismaRetangular(baseP, alturaP, comprimentoP));
                break;
            default:
                System.out.println("Sólido inválido!");
        }
    }
}
