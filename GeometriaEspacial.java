public class GeometriaEspacial {
    // Volume e área superficial de cubo
    public double volumeCubo(double lado) {
        return Math.pow(lado, 3);
    }
    public double areaCubo(double lado) {
        return 6 * lado * lado;
    }

    // Volume e área superficial de esfera
    public double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }
    public double areaEsfera(double raio) {
        return 4 * Math.PI * raio * raio;
    }

    // Volume e área superficial de cilindro
    public double volumeCilindro(double raio, double altura) {
        return Math.PI * raio * raio * altura;
    }
    public double areaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }

    // Volume e área superficial de prisma reto de base retangular
    public double volumePrismaRetangular(double base, double altura, double comprimento) {
        return base * altura * comprimento;
    }
    public double areaPrismaRetangular(double base, double altura, double comprimento) {
        return 2 * (base * altura + base * comprimento + altura * comprimento);
    }
}
