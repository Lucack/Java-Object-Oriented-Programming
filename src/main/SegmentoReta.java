package main;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;        
        this.p2 = p2;
    }

    public Ponto getP1() {
        return p1;
    }

    public Ponto getP2() {
        return p2;
    }

    public double comprimento() {
        double cateto1 = this.p2.getCoordX() - this.p1.getCoordX();
        double cateto2 = this.p2.getCoordY() - this.p1.getCoordY();
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    public double coeficienteAngular() {
        
        double catetox = this.p2.getCoordX() - this.p1.getCoordX();
        double catetoy = this.p2.getCoordY() - this.p1.getCoordY();

        if (catetox == 0 || catetoy == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return catetoy / catetox;
    }

    public boolean paralelo(SegmentoReta s) {
        double delta = 0.00001; 
        return Math.abs(this.coeficienteAngular() - s.coeficienteAngular()) < delta;
    }
}
