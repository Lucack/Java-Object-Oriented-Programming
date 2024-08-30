package atividade05Formas2D;

public class Retangulo  extends Paralelogramo{
    public Retangulo(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        super(p1, p2, p3, p4);
    }
    boolean quadrado(){
        return true;
    }

    static boolean existe(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        return true;
    }

}
