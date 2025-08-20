public class GeometriaEspacial {
    // Cubo
    public double volumeCubo(double lado) {
        return Math.pow(lado, 3);
    }
    public double areaCubo(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    // Esfera
    public double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    public double areaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    // Cilindro
    public double volumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }
    public double areaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }

    // Prisma reto de base regular
    public double volumePrisma(double areaBase, double altura) {
        return areaBase * altura;
    }
    public double areaPrisma(double areaBase, double perimetroBase, double altura) {
        return 2 * areaBase + perimetroBase * altura;
    }
}