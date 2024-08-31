package main;

public class SemiCirculo extends FormaGeometrica {
    private final Ponto centro;
    private final double raio;

    public SemiCirculo(Ponto centro, double raio) {
        this.centro = centro;
        if(raio>0){
            this.raio = raio;

        }
        else{
            throw  new IllegalArgumentException(String.format(
                "Raio deve ser positivo"));
        }
    }

    public Ponto getCentro() {
        return centro;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double area() {
        return ((Math.PI * raio* raio) / 2);
    }

    @Override
    public double altura() {
        return raio;
    }

    @Override
    public double largura() {
        return 2 * raio;
    }

    @Override
    public double perimetro() {
        return (Math.PI * raio) + (2 * raio);
    }
}