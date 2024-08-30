package atividade05Formas2D;

public class Elipse extends FormaGeometrica {
    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = centro;
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }

    double getSemiEixoMenor() {
        if (semiEixoA < semiEixoB) {
            return semiEixoA;
        } else {
            return semiEixoB;
        }
    }

    double getSemiEixoMaior() {
        if (semiEixoA > semiEixoB) {
            return semiEixoA;
        } else {
            return semiEixoB;
        }
    }

    double circunferencia() {
        // Aproximação de Ramanujan para a circunferência de uma elipse
        double h = Math.pow((semiEixoA - semiEixoB), 2) / Math.pow((semiEixoA + semiEixoB), 2);
        return Math.PI * (semiEixoA + semiEixoB) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    @Override
    protected double area() {
        return Math.PI * semiEixoA * semiEixoB;
    }

    @Override
    protected double altura() {
        return 2 * semiEixoB;
    }

    @Override
    protected double largura() {
        return 2 * semiEixoA;
    }

    @Override
    protected double perimetro() {
        return circunferencia();
    }
}