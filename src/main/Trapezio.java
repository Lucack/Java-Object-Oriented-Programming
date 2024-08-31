package main;

public class Trapezio extends Quadrilatero {

    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        
        super(p1, p2, p3, p4);

    }

    public SegmentoReta baseMenor() {
        SegmentoReta a = new SegmentoReta(getP1(), getP2());
        SegmentoReta b = new SegmentoReta(getP4(), getP3());
        if (a.comprimento() < b.comprimento()) {
            return a;
        }
        return b;
    }

    public SegmentoReta baseMaior() {
        SegmentoReta a = new SegmentoReta(getP1(), getP2());
        SegmentoReta b = new SegmentoReta(getP4(), getP3());
        if (a.comprimento() < b.comprimento()) {
            return b;
        }
        return a;
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta a = new SegmentoReta(p1, p2);
        SegmentoReta b = new SegmentoReta(p4, p3);
    
        if (a.paralelo(b)== false){
            return false;
        }
        return true;
        
    }

    @Override
    public double area() {
        
        return ((baseMenor().comprimento() + baseMaior().comprimento()) * altura()) / 2;
    }

    @Override
    public double altura() {
        return getP2().getCoordY() - getP3().getCoordY();
    }

    @Override
    public double largura() {
        return baseMaior().comprimento();
    }

    
}