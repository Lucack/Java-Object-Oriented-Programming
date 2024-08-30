package atividade05Formas2D;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    @Override
    protected double area() {
        return (Math.PI * Math.pow(raio, 2)) / 2;
    }

    @Override
    protected double altura() {
        return raio;
    }

    @Override
    protected double largura() {
        return 2 * raio;
    }

    @Override
    protected double perimetro() {
        return (Math.PI * raio) + (2 * raio);
    }
}