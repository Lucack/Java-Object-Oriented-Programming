package main;

public abstract class Poligono extends FormaGeometrica {

    protected final Ponto[] pontos;

    public Poligono(Ponto[] pontos) {
        this.pontos = pontos;

    }

    @Override
    public double perimetro() {
        double perimetro = 0.0;
        for (int i = 0; i < pontos.length - 1; i++) {
            Ponto pontoAtual = pontos[i];
            Ponto proximoPonto = pontos[i + 1];
            perimetro += new SegmentoReta(pontoAtual, proximoPonto).comprimento();
        }
        perimetro += new SegmentoReta(pontos[pontos.length - 1], pontos[0]).comprimento();
        return perimetro;
    }

    @Override
    public double area() {
        double somaArea = 0.0;
        for (int i = 0; i < pontos.length - 1; i++) {
            Ponto pontoAtual = pontos[i];
            Ponto proximoPonto = pontos[i + 1];
            somaArea += pontoAtual.getCoordX() * proximoPonto.getCoordY() - 
                        proximoPonto.getCoordX() * pontoAtual.getCoordY();
        }

        // ultimo ponto faltando
        Ponto ultimoPonto = pontos[pontos.length - 1];
        Ponto primeiroPonto = pontos[0];
        somaArea += ultimoPonto.getCoordX() * primeiroPonto.getCoordY() - 
                    primeiroPonto.getCoordX() * ultimoPonto.getCoordY();
        
        return Math.abs(somaArea / 2.0);
    }
}