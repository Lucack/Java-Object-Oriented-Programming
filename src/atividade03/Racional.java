package atividade03;

public class Racional {
    int numerador;
    int denominador;


    Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
    }

    Racional adiciona(Racional nRacional) {
        int newDenominador = this.denominador * nRacional.denominador;
        int newNumerador = (this.numerador * nRacional.denominador)+(this.denominador * nRacional.numerador);
        Racional result =  new Racional(newNumerador,newDenominador);   
        result.simplifica();
        return result;    
    }

    Racional subtrai(Racional nRacional) {
        int newDenominador = this.denominador * nRacional.denominador;
        int newNumerador = (this.numerador * nRacional.denominador)-(this.denominador * nRacional.numerador);
        Racional result =  new Racional(newNumerador,newDenominador);   
        result.simplifica();
        return result; 
    }

    Racional multiplica(Racional nRacional) {
        int newDenominador = this.denominador * nRacional.denominador;
        int newNumerador = (this.numerador * nRacional.numerador);
        Racional result = new Racional(newNumerador,newDenominador);
        result.simplifica();
        return result;
    }

    Racional divide(Racional nRacional) {
        return this.multiplica(new Racional(nRacional.denominador,nRacional.numerador));

    }

    String converteParaString() {
        int num = this.numerador;
        int den = this.denominador;

        if (den < 0 ){
            den = -den;
            num = -num;            
        }

        return String.format("%d/%d", num, den);
        
    }

    boolean igual(Racional nRacional) {
        return true;
    }

    private void simplifica() {
        int resultMdc = mdc(numerador, denominador);
        this.numerador /= resultMdc;
        this.denominador /= resultMdc;

        if (this.denominador < 0) {
            this.numerador = -this.numerador;
            this.denominador = -this.denominador;
        }
    }

    private int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
