package main;

public class Circulo extends Elipse {

    private final Ponto centro;
    private final double raio;

    public Circulo(Ponto centro, double raio) {
        super(centro, raio, raio);
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
    public double circunferencia() {
        return 2 * Math.PI * raio;
    }


    @Override
    public double area() {
        return 2 * Math.PI * raio* raio;
    }

    @Override
    public double altura() {
        return 2 * raio;
    }

    @Override
    public double largura() {
        return 2 * raio;
    }

    @Override
    public double perimetro() {
        return circunferencia();
    }
}
