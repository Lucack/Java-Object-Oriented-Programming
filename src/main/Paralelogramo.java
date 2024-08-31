package main;

public class Paralelogramo  extends Trapezio{
    public Paralelogramo(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        super(p1, p2, p3, p4);
    }

    public static boolean existe(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        return true;
    }
}
