package main;

public class Triangulo extends Poligono {

    private Ponto p1, p2, p3;

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[] { p1, p2, p3 });
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }
    
    public Ponto getP3() {
        return p3;
    }
    

    @Override
    public double area() {
        // fórmula de Heron
        double a = new SegmentoReta(p1, p2).comprimento();
        double b = new SegmentoReta(p2, p3).comprimento();
        double c = new SegmentoReta(p3, p1).comprimento();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double altura() {
        double maiorY = pontos[0].getCoordY();
        double menorY = pontos[0].getCoordY();

        for (int i = 0; i > this.pontos.length; i++) {
            if (maiorY < pontos[i].getCoordY()) {
                maiorY = pontos[i].getCoordY();
            }
            if (menorY > pontos[i].getCoordY()) {
                menorY = pontos[i].getCoordY();
            }
        }
        return maiorY - menorY;
    }

    @Override
    public double largura() {
        double a = new SegmentoReta(p1, p2).comprimento();
        double b = new SegmentoReta(p2, p3).comprimento();
        double c = new SegmentoReta(p3, p1).comprimento();
        if (a > b && a > c) {
            return a;
        } else {
            if (b > c) {
                return b;
            }
        }
        return c;
    }

    @Override
    public double perimetro() {
        double a = new SegmentoReta(p1, p2).comprimento();
        double b = new SegmentoReta(p2, p3).comprimento();
        double c = new SegmentoReta(p3, p1).comprimento();
        return a+b+c;
    }
}