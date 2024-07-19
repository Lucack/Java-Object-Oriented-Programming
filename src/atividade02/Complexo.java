package atividade02;

class Complexo {
    

    double real;
    double imaginario;

    Complexo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    Complexo adiciona(Complexo num){
        double realNum = this.real + num.real;
        double imgNum = this.imaginario + num.imaginario;
        return new Complexo(real= realNum, imaginario= imgNum);
    }

    Complexo subtrai(Complexo num){
        double realNum = this.real - num.real;
        double imgNum = this.imaginario - num.imaginario;
        return new Complexo(real= realNum, imaginario= imgNum);
    }

    Complexo multiplica(Complexo num){
        double realNum = (this.real * num.real) - (this.imaginario * num.imaginario);
        double imgNum = (this.real * num.imaginario) + (num.real * this.imaginario);
        return new Complexo(real= realNum, imaginario= imgNum);
    }

    Complexo divide(Complexo num){
        double div = num.real*num.real + num.imaginario*num.imaginario;
        double realNum = ((this.real * num.real) + (this.imaginario * num.imaginario)) / div;
        double imgNum = ((num.real * this.imaginario) - (this.real * num.imaginario)) / div;
        return new Complexo(real= realNum, imaginario= imgNum);
    }


    String converteParaString() {
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
}
