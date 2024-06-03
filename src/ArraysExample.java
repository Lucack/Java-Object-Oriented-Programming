public class ArraysExample {
    public static void main(String[] args) throws Exception {
        System.out.println("Tipos Referencia");

        int[] numeros = {1, 2, 3, 4, 5, 6, 7};
        double[] decimais = {1.0, 2.0};
        char[] caracteres = {'a', 'b'};
        
        System.out.println(numeros[2]);
        System.out.println(decimais[1]);
        System.out.println(numeros[1]);

        System.out.println(numeros.length);
        System.out.println(decimais.length);
        System.out.println(numeros.length);

        for (int i = 0; i<numeros.length ; i++){
            System.out.print(numeros[i]+"");
        }
        System.out.println("");
    }
}
