import java.util.Scanner;

public class Menu {
    private Scanner scanner = new Scanner(System.in);

    // Geometria Plana
    private double areaCirculo(double raio) { return Math.PI * raio * raio; }
    private double perimetroCirculo(double raio) { return 2 * Math.PI * raio; }
    private double areaRetangulo(double base, double altura) { return base * altura; }
    private double perimetroRetangulo(double base, double altura) { return 2 * (base + altura); }
    private double areaTriangulo(double base, double altura) { return (base * altura) / 2; }
    private double perimetroTriangulo(double l1, double l2, double l3) { return l1 + l2 + l3; }
    private double areaPoligonoRegular(int lados, double compLado, double apotema) { return (lados * compLado * apotema) / 2; }
    private double perimetroPoligonoRegular(int lados, double compLado) { return lados * compLado; }

    // Geometria Espacial
    private double volumeCubo(double lado) { return Math.pow(lado, 3); }
    private double areaCubo(double lado) { return 6 * Math.pow(lado, 2); }
    private double volumeEsfera(double raio) { return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3); }
    private double areaEsfera(double raio) { return 4 * Math.PI * Math.pow(raio, 2); }
    private double volumeCilindro(double raio, double altura) { return Math.PI * Math.pow(raio, 2) * altura; }
    private double areaCilindro(double raio, double altura) { return 2 * Math.PI * raio * (raio + altura); }
    private double volumePrisma(double areaBase, double altura) { return areaBase * altura; }
    private double areaPrisma(double areaBase, double perimetroBase, double altura) { return 2 * areaBase + perimetroBase * altura; }

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
                case 1: menuPlana(); break;
                case 2: menuEspacial(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
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
                System.out.printf("Área: %.2f\n", areaCirculo(raio));
                System.out.printf("Perímetro: %.2f\n", perimetroCirculo(raio));
                break;
            case 2:
                System.out.print("Base: ");
                double base = scanner.nextDouble();
                System.out.print("Altura: ");
                double altura = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", areaRetangulo(base, altura));
                System.out.printf("Perímetro: %.2f\n", perimetroRetangulo(base, altura));
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
                System.out.printf("Área: %.2f\n", areaTriangulo(baseT, alturaT));
                System.out.printf("Perímetro: %.2f\n", perimetroTriangulo(l1, l2, l3));
                break;
            case 4:
                System.out.print("Número de lados: ");
                int lados = scanner.nextInt();
                System.out.print("Comprimento do lado: ");
                double compLado = scanner.nextDouble();
                System.out.print("Apótema: ");
                double apotema = scanner.nextDouble();
                System.out.printf("Área: %.2f\n", areaPoligonoRegular(lados, compLado, apotema));
                System.out.printf("Perímetro: %.2f\n", perimetroPoligonoRegular(lados, compLado));
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
        System.out.println("4. Prisma Reto de Base Regular");
        System.out.print("Escolha o sólido: ");
        int solido = scanner.nextInt();
        switch (solido) {
            case 1:
                System.out.print("Lado: ");
                double lado = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", volumeCubo(lado));
                System.out.printf("Área superficial: %.2f\n", areaCubo(lado));
                break;
            case 2:
                System.out.print("Raio: ");
                double raio = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", volumeEsfera(raio));
                System.out.printf("Área superficial: %.2f\n", areaEsfera(raio));
                break;
            case 3:
                System.out.print("Raio: ");
                double raioC = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaC = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", volumeCilindro(raioC, alturaC));
                System.out.printf("Área superficial: %.2f\n", areaCilindro(raioC, alturaC));
                break;
            case 4:
                System.out.print("Área da base: ");
                double areaBase = scanner.nextDouble();
                System.out.print("Perímetro da base: ");
                double perimetroBase = scanner.nextDouble();
                System.out.print("Altura: ");
                double alturaP = scanner.nextDouble();
                System.out.printf("Volume: %.2f\n", volumePrisma(areaBase, alturaP));
                System.out.printf("Área superficial: %.2f\n", areaPrisma(areaBase, perimetroBase, alturaP));
                break;
            default:
                System.out.println("Sólido inválido!");
        }
    }

    public static void main(String[] args) {
        new Menu().exibirMenu();
    }
}