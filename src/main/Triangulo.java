package main;

public class Triangulo extends Poligono {

    public Triangulo(Ponto p1, Ponto p2, Ponto p3) {
        super(new Ponto[] { p1, p2, p3 });

    }

    public Ponto getP1() {
        return super.pontos[0];
    }

    public Ponto getP2() {
        return super.pontos[1];
    }

    public Ponto getP3() {
        return super.pontos[2];
    }

    @Override
    public double area() {
        // fórmula de Heron
        double a = new SegmentoReta(getP1(), getP2()).comprimento();
        double b = new SegmentoReta(getP2(), getP3()).comprimento();
        double c = new SegmentoReta(getP3(), getP1()).comprimento();
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public double altura() {
        double maiorY = pontos[0].getCoordY();
        double menorY = pontos[0].getCoordY();

        for (int i = 0; i < this.pontos.length; i++) {
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
        return new SegmentoReta(getP2(), getP3()).comprimento();
    }

    @Override
    public double perimetro() {
        double a = new SegmentoReta(getP1(), getP2()).comprimento();
        double b = new SegmentoReta(getP2(), getP3()).comprimento();
        double c = new SegmentoReta(getP3(), getP1()).comprimento();
        return a + b + c;
    }
}