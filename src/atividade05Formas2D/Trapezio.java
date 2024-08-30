package atividade05Formas2D;

public class Trapezio extends Quadrilatero{
    public Trapezio(Ponto p1, Ponto p2, Ponto p3, Ponto p4){
        super(p1, p2, p3, p4);
}

private SegmentoReta baseMenor(){
    return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));

}

private SegmentoReta baseMaior(){
    return new SegmentoReta(new Ponto(1, 2), new Ponto(2, 2));
}

static boolean existe(Ponto p1,Ponto p2, Ponto p3, Ponto p4){
    return true;
}

}
