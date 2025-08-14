package geo;


public class GeometriaEspacial {
    public double volumeCubo(double aresta) {
        return Math.pow(aresta, 3);
    }

    public double areaCubo(double aresta) {
        return 6 * Math.pow(aresta, 2);
    }

    public double volumeEsfera(double raio) {
        return (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
    }

    public double areaEsfera(double raio) {
        return 4 * Math.PI * Math.pow(raio, 2);
    }

    public double volumeCilindro(double raio, double altura) {
        return Math.PI * Math.pow(raio, 2) * altura;
    }

    public double areaCilindro(double raio, double altura) {
        return 2 * Math.PI * raio * (raio + altura);
    }
}