package atividade05Formas2D;

public class SegmentoReta extends ObjetoGeometrico {
    private final Ponto p1;
    private final Ponto p2;

    public SegmentoReta(Ponto p1, Ponto p2) {
        this.p1 = p1;        
        this.p2 = p2;
    }

    private double comprimento() {
        double cateto1 = this.p2.getCoordX() - this.p1.getCoordX();
        double cateto2 = this.p2.getCoordY() - this.p1.getCoordY();
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }

    private double coeficienteAngular() {
        
        double catetox = this.p2.getCoordX() - this.p1.getCoordX();
        double catetoy = this.p2.getCoordY() - this.p1.getCoordY();

        if (catetox == 0) {
            return Double.POSITIVE_INFINITY;
        }

        return catetoy / catetox;
    }

    private boolean paralelo(SegmentoReta s) {

        return this.coeficienteAngular() == s.coeficienteAngular();
    }
}
