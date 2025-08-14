package geo;

// Métodos para cálculo de figuras planas
public class GeometriaPlana {
    public double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public double areaRetangulo(double base, double altura) {
        return base * altura;
    }

    public double perimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    public double areaPoligonoRegular(int n, double lado, double apotema) {
        return (n * lado * apotema) / 2;
    }

    public double perimetroPoligonoRegular(int n, double lado) {
        return n * lado;
    }
}