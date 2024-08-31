package main;

public class Retangulo  extends Paralelogramo{
    public Retangulo(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        super(p1, p2, p3, p4);
    }
    public boolean quadrado(){
        return true;
    }

    public static boolean existe(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        return true;
    }


    @Override
    public double perimetro() {
        double a = new SegmentoReta(super.getP1(), super.getP2()).comprimento();
        double b = new SegmentoReta(super.getP2(), super.getP3()).comprimento();
        double c = new SegmentoReta(super.getP3(), super.getP4()).comprimento();
        double d = new SegmentoReta(super.getP4(), super.getP1()).comprimento();
        return a+b+c+d;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double altura() {
        return 0;
    }

    @Override
    public double largura() {
        return 0;
    }
}
