package main;

public class Trapezio extends Quadrilatero {
    

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
        
    }

    public SegmentoReta baseMenor() {
        return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));
    }

    public SegmentoReta baseMaior() {
        return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return true;
    }

    @Override
    public double area() {
        double baseMenor = baseMenor().comprimento();
        double baseMaior = baseMaior().comprimento();
        double altura = altura();
        return ((baseMenor + baseMaior) * altura) / 2;
    }

    @Override
    public double altura() {
        return Math.abs(super.getP1().getCoordY() - super.getP3().getCoordY());
    }

    @Override
    public double largura() {
        return super.getP2().getCoordX();
    }

    @Override
    public double perimetro() {
        return baseMenor().comprimento() + baseMaior().comprimento() + 
               new SegmentoReta(super.getP1(), super.getP4()).comprimento() + new SegmentoReta(super.getP2(), super.getP3()).comprimento();
    } 
}