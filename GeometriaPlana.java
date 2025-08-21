public class GeometriaPlana {

    public double calcularAreaCirculo(double raio) {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetroCirculo(double raio) {
        return 2 * Math.PI * raio;
    }

    public double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public double calcularPerimetroRetangulo(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public double calcularPerimetroTriangulo(double ladoA, double ladoB, double ladoC) {
        return ladoA + ladoB + ladoC;
    }

    public double calcularAreaPoligonoRegular(int numeroLados, double tamanhoLado, double apotema) {
        return (numeroLados * tamanhoLado * apotema) / 2;
    }

    public double calcularPerimetroPoligonoRegular(int numeroLados, double tamanhoLado) {
        return numeroLados * tamanhoLado;
    }
}