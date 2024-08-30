package atividade05Formas2D;

public class Trapezio extends Quadrilatero {
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    private SegmentoReta baseMenor() {
        return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));
    }

    private SegmentoReta baseMaior() {
        return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));
    }

    static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        return true;
    }

    @Override
    protected double area() {
        double baseMenor = baseMenor().comprimento();
        double baseMaior = baseMaior().comprimento();
        double altura = altura();
        return ((baseMenor + baseMaior) * altura) / 2;
    }

    @Override
    protected double altura() {
        // Implementação da altura do trapézio
        // Supondo que a altura seja a distância vertical entre as bases
        return Math.abs(p1.getY() - p3.getY());
    }

    @Override
    protected double largura() {
        // Implementação da largura do trapézio
        // Supondo que a largura seja a distância horizontal entre os pontos mais distantes
        return Math.max(p1.getX(), p2.getX(), p3.getX(), p4.getX()) - Math.min(p1.getX(), p2.getX(), p3.getX(), p4.getX());
    }

    @Override
    protected double perimetro() {
        // Implementação do perímetro do trapézio
        return baseMenor().comprimento() + baseMaior().comprimento() + 
               new SegmentoReta(p1, p4).comprimento() + new SegmentoReta(p2, p3).comprimento();
    }
}