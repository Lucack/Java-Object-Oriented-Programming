package main;

public class Paralelogramo  extends Trapezio{
    public Paralelogramo(Ponto p1,Ponto p2,Ponto p3,Ponto p4){
        super(p1, p2, p3, p4);
    }


    @Override
    public double area() {
        
        return ((baseMenor().comprimento() + baseMaior().comprimento()) * altura()) / 2;
    }


    @Override
    public double largura() {
        double maiorX = pontos[0].getCoordX();
        double menorX = pontos[0].getCoordX();

        for (int i = 0; i < this.pontos.length; i++) {
            if (maiorX < pontos[i].getCoordX()) {
                maiorX = pontos[i].getCoordX();
            }
            if (menorX > pontos[i].getCoordX()) {
                menorX = pontos[i].getCoordX();
            }
        }
        return maiorX - menorX;
    }

    

    
    public static boolean existe(Ponto p1, Ponto p2, Ponto p3, Ponto p4) {
        SegmentoReta a = new SegmentoReta(p1, p2);
        SegmentoReta b = new SegmentoReta(p4, p3);
        SegmentoReta c = new SegmentoReta(p1, p4);
        SegmentoReta d = new SegmentoReta(p2, p3);
    
        if (a.paralelo(b) == false || c.paralelo(d) == false ){
            return false;
        }
        return true;
        
    }
}
