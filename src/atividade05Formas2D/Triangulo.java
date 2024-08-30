package atividade05Formas2D;

public class Triangulo extends Poligono {

    private Ponto p1, p2, p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[]{p1, p2, p3});
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    protected double area() {
        // Implementação da área do triângulo usando a fórmula de Heron
        double a = p1.distancia(p2);
        double b = p2.distancia(p3);
        double c = p3.distancia(p1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    protected double altura() {
        // Implementação da altura do triângulo
        // Supondo que a altura seja a distância vertical do ponto mais alto ao ponto mais baixo
        return Math.max(p1.getY(), Math.max(p2.getY(), p3.getY())) - Math.min(p1.getY(), Math.min(p2.getY(), p3.getY()));
    }

    @Override
    protected double largura() {
        // Implementação da largura do triângulo
        // Supondo que a largura seja a distância horizontal entre os pontos mais distantes
        return Math.max(p1.getX(), Math.max(p2.getX(), p3.getX())) - Math.min(p1.getX(), Math.min(p2.getX(), p3.getX()));
    }

    @Override
    protected double perimetro() {
        // Implementação do perímetro do triângulo
        return p1.distancia(p2) + p2.distancia(p3) + p3.distancia(p1);
    }
}