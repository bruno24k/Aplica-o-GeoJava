import java.util.Scanner;

public class Menu {
    private Scanner entrada = new Scanner(System.in);

    private double calcularAreaCirculo(double raio) { return Math.PI * raio * raio; }
    private double calcularPerimetroCirculo(double raio) { return 2 * Math.PI * raio; }
    private double calcularAreaRetangulo(double largura, double altura) { return largura * altura; }
    private double calcularPerimetroRetangulo(double largura, double altura) { return 2 * (largura + altura); }
    private double calcularAreaTriangulo(double base, double altura) { return (base * altura) / 2; }
    private double calcularPerimetroTriangulo(double ladoA, double ladoB, double ladoC) { return ladoA + ladoB + ladoC; }
    private double calcularAreaPoligonoRegular(int numeroLados, double tamanhoLado, double apotema) { return (numeroLados * tamanhoLado * apotema) / 2; }
    private double calcularPerimetroPoligonoRegular(int numeroLados, double tamanhoLado) { return numeroLados * tamanhoLado; }

    private double calcularVolumeCubo(double comprimentoLado) { return Math.pow(comprimentoLado, 3); }
    private double calcularAreaCubo(double comprimentoLado) { return 6 * Math.pow(comprimentoLado, 2); }
    private double calcularVolumeEsfera(double raio) { return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3); }
    private double calcularAreaEsfera(double raio) { return 4 * Math.PI * Math.pow(raio, 2); }
    private double calcularVolumeCilindro(double raioBase, double altura) { return Math.PI * Math.pow(raioBase, 2) * altura; }
    private double calcularAreaCilindro(double raioBase, double altura) { return 2 * Math.PI * raioBase * (raioBase + altura); }
    private double calcularVolumePrisma(double areaBase, double altura) { return areaBase * altura; }
    private double calcularAreaPrisma(double areaBase, double perimetroBase, double altura) { return 2 * areaBase + perimetroBase * altura; }

    public void mostrarMenu() {
        int opcao;
        do {
            System.out.println("\n===== MENU GEOMETRIA =====");
            System.out.println("1. Geometria Plana");
            System.out.println("2. Geometria Espacial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 1: menuPlana(); break;
                case 2: menuEspacial(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
        entrada.close();
    }

    private void menuPlana() {
        System.out.println("\n--- Geometria Plana ---");
        System.out.println("1. Círculo");
        System.out.println("2. Retângulo");
        System.out.println("3. Triângulo");
        System.out.println("4. Polígono Regular");
        System.out.print("Escolha a figura: ");
        int figura = entrada.nextInt();
        switch (figura) {
            case 1:
                System.out.print("Raio: ");
                double raio = entrada.nextDouble();
                System.out.printf("Área: %.2f\n", calcularAreaCirculo(raio));
                System.out.printf("Perímetro: %.2f\n", calcularPerimetroCirculo(raio));
                break;
            case 2:
                System.out.print("Largura: ");
                double largura = entrada.nextDouble();
                System.out.print("Altura: ");
                double altura = entrada.nextDouble();
                System.out.printf("Área: %.2f\n", calcularAreaRetangulo(largura, altura));
                System.out.printf("Perímetro: %.2f\n", calcularPerimetroRetangulo(largura, altura));
                break;
            case 3:
                System.out.print("Base: ");
                double baseT = entrada.nextDouble();
                System.out.print("Altura: ");
                double alturaT = entrada.nextDouble();
                System.out.print("Lado A: ");
                double ladoA = entrada.nextDouble();
                System.out.print("Lado B: ");
                double ladoB = entrada.nextDouble();
                System.out.print("Lado C: ");
                double ladoC = entrada.nextDouble();
                System.out.printf("Área: %.2f\n", calcularAreaTriangulo(baseT, alturaT));
                System.out.printf("Perímetro: %.2f\n", calcularPerimetroTriangulo(ladoA, ladoB, ladoC));
                break;
            case 4:
                System.out.print("Número de lados: ");
                int numeroLados = entrada.nextInt();
                System.out.print("Tamanho do lado: ");
                double tamanhoLado = entrada.nextDouble();
                System.out.print("Apótema: ");
                double apotema = entrada.nextDouble();
                System.out.printf("Área: %.2f\n", calcularAreaPoligonoRegular(numeroLados, tamanhoLado, apotema));
                System.out.printf("Perímetro: %.2f\n", calcularPerimetroPoligonoRegular(numeroLados, tamanhoLado));
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
        int solido = entrada.nextInt();
        switch (solido) {
            case 1:
                System.out.print("Comprimento do lado: ");
                double comprimentoLado = entrada.nextDouble();
                System.out.printf("Volume: %.2f\n", calcularVolumeCubo(comprimentoLado));
                System.out.printf("Área superficial: %.2f\n", calcularAreaCubo(comprimentoLado));
                break;
            case 2:
                System.out.print("Raio: ");
                double raio = entrada.nextDouble();
                System.out.printf("Volume: %.2f\n", calcularVolumeEsfera(raio));
                System.out.printf("Área superficial: %.2f\n", calcularAreaEsfera(raio));
                break;
            case 3:
                System.out.print("Raio da base: ");
                double raioBase = entrada.nextDouble();
                System.out.print("Altura: ");
                double alturaCilindro = entrada.nextDouble();
                System.out.printf("Volume: %.2f\n", calcularVolumeCilindro(raioBase, alturaCilindro));
                System.out.printf("Área superficial: %.2f\n", calcularAreaCilindro(raioBase, alturaCilindro));
                break;
            case 4:
                System.out.print("Área da base: ");
                double areaBase = entrada.nextDouble();
                System.out.print("Perímetro da base: ");
                double perimetroBase = entrada.nextDouble();
                System.out.print("Altura: ");
                double alturaPrisma = entrada.nextDouble();
                System.out.printf("Volume: %.2f\n", calcularVolumePrisma(areaBase, alturaPrisma));
                System.out.printf("Área superficial: %.2f\n", calcularAreaPrisma(areaBase, perimetroBase, alturaPrisma));
                break;
            default:
                System.out.println("Sólido inválido!");
        }
    }

    public static void main(String[] args) {
        new Menu().mostrarMenu();
    }
}