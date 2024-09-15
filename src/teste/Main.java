package teste;


public class Main {

    public static void main(String[] args) {

        
        Carro c1 = new Carro("Uno","Fiat", 23, "Vermelho" ) ;
        Carro c2 = new Carro();

        System.out.println();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();


        System.out.println("Printando carro c1");
        System.out.println("Carro c1: " + c1.getNome() + " da marca " + c1.getMarca() + " cor "+ c1.getCor()+ " aro "+ c1.getAro());
       
        System.out.println(Carro.getNumParcelaMax());
        
        Calculadora calc1 = new Calculadora();
        calc1.sum(2, 10);

        Calculadora.sum(2, 10);

        

        




        



    }

}
