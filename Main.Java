package geo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometriaPlana gp = new GeometriaPlana();
        GeometriaEspacial ge = new GeometriaEspacial();
        boolean executando = true;

        while (executando) {
            System.out.println("\n====== Menu de Geometria ======");
            System.out.println("1 - Figuras Planas");
            System.out.println("2 - Sólidos Geométricos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\nEscolha a figura plana:");
                    System.out.println("1 - Círculo");
                    System.out.println("2 - Retângulo");
                    System.out.println("3 - Triângulo");
                    System.out.println("4 - Polígono Regular");
                    System.out.print("Opção: ");
                    int figura = sc.nextInt();

                    if (figura == 1) {
                        System.out.print("Digite o raio: ");
                        double raio = sc.nextDouble();
                        if (raio > 0) {
                            System.out.printf("Área: %.2f\n", gp.areaCirculo(raio));
                            System.out.printf("Perímetro: %.2f\n", gp.perimetroCirculo(raio));
                        } else {
                            System.out.println("Valor inválido! O raio deve ser positivo.");
                        }
                    }
                    else if (figura == 2) {
                        System.out.print("Digite a base: ");
                        double base = sc.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = sc.nextDouble();
                        if (base > 0 && altura > 0) {
                            System.out.printf("Área: %.2f\n", gp.areaRetangulo(base, altura));
                            System.out.printf("Perímetro: %.2f\n", gp.perimetroRetangulo(base, altura));
                        } else {
                            System.out.println("Valores inválidos! Base e altura devem ser positivos.");
                        }
                    }
                    else if (figura == 3) {
                        System.out.print("Digite a base: ");
                        double base = sc.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = sc.nextDouble();
                        System.out.print("Digite o lado 1: ");
                        double lado1 = sc.nextDouble();
                        System.out.print("Digite o lado 2: ");
                        double lado2 = sc.nextDouble();
                        System.out.print("Digite o lado 3: ");
                        double lado3 = sc.nextDouble();
                        if (base > 0 && altura > 0 && lado1 > 0 && lado2 > 0 && lado3 > 0) {
                            System.out.printf("Área: %.2f\n", gp.areaTriangulo(base, altura));
                            System.out.printf("Perímetro: %.2f\n", gp.perimetroTriangulo(lado1, lado2, lado3));
                        } else {
                            System.out.println("Todos os valores devem ser positivos!");
                        }
                    }
                    else if (figura == 4) {
                        System.out.print("Digite o número de lados: ");
                        int n = sc.nextInt();
                        System.out.print("Digite o comprimento do lado: ");
                        double lado = sc.nextDouble();
                        System.out.print("Digite o apótema: ");
                        double apotema = sc.nextDouble();
                        if (n >= 3 && lado > 0 && apotema > 0) {
                            System.out.printf("Área: %.2f\n", gp.areaPoligonoRegular(n, lado, apotema));
                            System.out.printf("Perímetro: %.2f\n", gp.perimetroPoligonoRegular(n, lado));
                        } else {
                            System.out.println("Valores inválidos!");
                        }
                    }
                    else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 2:
                    System.out.println("\nEscolha o sólido geométrico:");
                    System.out.println("1 - Cubo");
                    System.out.println("2 - Esfera");
                    System.out.println("3 - Cilindro");
                    System.out.print("Opção: ");
                    int solido = sc.nextInt();

                    if (solido == 1) {
                        System.out.print("Digite a aresta: ");
                        double aresta = sc.nextDouble();
                        if (aresta > 0) {
                            System.out.printf("Volume: %.2f\n", ge.volumeCubo(aresta));
                            System.out.printf("Área superficial: %.2f\n", ge.areaCubo(aresta));
                        } else {
                            System.out.println("A aresta deve ser positiva!");
                        }
                    }
                    else if (solido == 2) {
                        System.out.print("Digite o raio: ");
                        double raio = sc.nextDouble();
                        if (raio > 0) {
                            System.out.printf("Volume: %.2f\n", ge.volumeEsfera(raio));
                            System.out.printf("Área superficial: %.2f\n", ge.areaEsfera(raio));
                        } else {
                            System.out.println("O raio deve ser positivo!");
                        }
                    }
                    else if (solido == 3) {
                        System.out.print("Digite o raio da base: ");
                        double raioBase = sc.nextDouble();
                        System.out.print("Digite a altura: ");
                        double altura = sc.nextDouble();
                        if (raioBase > 0 && altura > 0) {
                            System.out.printf("Volume: %.2f\n", ge.volumeCilindro(raioBase, altura));
                            System.out.printf("Área superficial: %.2f\n", ge.areaCilindro(raioBase, altura));
                        } else {
                            System.out.println("Raio e altura devem ser positivos!");
                        }
                    }
                    else {
                        System.out.println("Opção inválida.");
                    }
                    break;

                case 0:
                    executando = false;
                    System.out.println("Programa encerrado!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }
}