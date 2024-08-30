package atividade05Formas2D;

public class SegmentoReta extends ObjetoGeometrico {
    
    public SegmentoReta(Ponto p1, Ponto p2){

    }

    private double comprimento(){
        return 0;
    }

    private double coeficienteAngular(){
        // O coeficiente angulara mede a inclinação da reta
// em relação ao eixo x. Caso a reta seja paralela ao eixo y (coeficiente indefinido), retorna
// Double.POSITIVE_INFINITY.
        return 0;
    }

    private boolean paralelo(SegmentoReta s){
//         Verifica se a linha onde passa o segmento de reta atual é paralela à linha onde passa o
// segmento de reta s.

        return true;
    }
}
