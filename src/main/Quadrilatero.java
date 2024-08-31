package main;

public abstract class Quadrilatero extends Poligono {

    public Quadrilatero(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(new Ponto[]{p1, p2, p3, p4});
        
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

    public Ponto getP4() {
        return super.pontos[3];
    }

    @Override
    public double perimetro() {
        double a = new SegmentoReta(getP1(), getP2()).comprimento();
        double b = new SegmentoReta(getP2(), getP3()).comprimento();
        double c = new SegmentoReta(getP3(), getP4()).comprimento();
        double d = new SegmentoReta(getP4(), getP1()).comprimento();
        return a+b+c+d;
    }
}