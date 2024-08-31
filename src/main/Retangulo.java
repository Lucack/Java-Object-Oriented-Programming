package main;

public class Retangulo extends Paralelogramo {
    public Retangulo(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        super(p1, p2, p3, p4);
    }

    public boolean quadrado() {
        return Math.abs(altura() - largura()) < 0.00001;
    }

    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta s1 = new SegmentoReta(p1, p2);
        SegmentoReta s2 = new SegmentoReta(p2, p3);
        SegmentoReta s3 = new SegmentoReta(p3, p4);
        SegmentoReta s4 = new SegmentoReta(p4, p1);

        return s1.paralelo(s3) && s2.paralelo(s4) &&
                Math.abs(s1.coeficienteAngular() * s2.coeficienteAngular() + 1) < 0.00001;
    }

    @Override
    public double area() {
        return altura() * largura();
    }

    @Override
    public double altura() {
        return new SegmentoReta(getP1(), getP4()).comprimento();
    }


}