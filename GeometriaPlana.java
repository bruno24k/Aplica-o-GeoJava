public class GeometriaPlana {
    // Área e perímetro de círculo
    public double areaCirculo(double raio) {
        return Math.PI * raio * raio;
    }
    public double perimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    // Área e perímetro de retângulo
    public double areaRetangulo(double base, double altura) {
        return base * altura;
    }
    public double perimetroRetangulo(double base, double altura) {
        return 2 * (base + altura);
    }

    // Área e perímetro de triângulo
    public double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }
    public double perimetroTriangulo(double lado1, double lado2, double lado3) {
        return lado1 + lado2 + lado3;
    }

    // Área e perímetro de polígono regular
    public double areaPoligonoRegular(double lado, int n) {
        return (n * lado * lado) / (4 * Math.tan(Math.PI / n));
    }
    public double perimetroPoligonoRegular(double lado, int n) {
        return n * lado;
    }
}
