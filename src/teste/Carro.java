package teste;

public class Carro {
    

    private String nome;
    private String marca;
    private int aro;
    private String cor;
    private  static int  numParcelaMax = 24;


    Carro(){
        nome = "undefined";
        marca = "undefined";
        aro = 999999;
        cor = "undefined";
    }

    Carro(String novoNome, String novaMarca, int novoAro, String novaCor ){

        nome = novoNome;
        marca = novaMarca;
        aro = novoAro;
        cor = novaCor;

    }

    public String getNome(){
        return nome;
    }

    public int getAro(){
        return aro;
    }

    public String getMarca(){
        return marca;
    }

    public String getCor(){
        return cor;
    }

    public static int getNumParcelaMax(){
        return numParcelaMax;
    }





    public void setNome(String novoNome){
        nome = novoNome;
    }

    public void setAro( int novoAro){
        aro = novoAro;
    }

    public void setMarca(String novaMarca){
        marca = novaMarca;
    }

    public void setCor(String novaCor){
        cor = novaCor;
    }

   


}


