package main;

public class Elipse extends FormaGeometrica {
    private final Ponto centro;
    private final double semiEixoA;
    private final double semiEixoB;

    public Elipse(Ponto centro, double semiEixoA, double semiEixoB) {
        this.centro = centro;

        if (semiEixoA<0 || semiEixoB<0 ){
            throw  new IllegalArgumentException(String.format(
                "Eixo deve ser positivo"));
        }
        else{
            this.semiEixoA = semiEixoA;
            this.semiEixoB = semiEixoB;
        }
        
    }


    public Ponto getCentro() {
        return centro;
    }


    public double getSemiEixoMenor() {
        if (semiEixoA < semiEixoB) {
            return semiEixoA;
        } else {
            return semiEixoB;
        }
    }

    public double getSemiEixoMaior() {
        if (semiEixoA > semiEixoB) {
            return semiEixoA;
        } else {
            return semiEixoB;
        }
    }

    public double circunferencia() {
        return 2 * Math.PI * Math.sqrt((semiEixoA * semiEixoA + semiEixoB * semiEixoB) / 2);
    }

    @Override
    public double area() {
        return Math.PI * semiEixoA * semiEixoB;
    }

    @Override
    public double altura() {
        return 2 * semiEixoB;
    }

    @Override
    public double largura() {
        return 2 * semiEixoA;
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }
}