public class GeometriaEspacial {
    public double calcularVolumeCubo(double comprimentoLado) {
        return Math.pow(comprimentoLado, 3);
    }

    public double calcularAreaCubo(double comprimentoLado) {
        return 6 * Math.pow(comprimentoLado, 2);
    }

    public double calcularVolumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double calcularAreaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public double calcularVolumeCilindro(double raioBase, double altura) {
        return Math.PI * Math.pow(raioBase, 2) * altura;
    }

    public double calcularAreaCilindro(double raioBase, double altura) {
        return 2 * Math.PI * raioBase * (raioBase + altura);
    }

    public double calcularVolumePrisma(double areaBase, double altura) {
        return areaBase * altura;
    }

    public double calcularAreaPrisma(double areaBase, double perimetroBase, double altura) {
        return 2 * areaBase + perimetroBase * altura;
    }
}