import java.util.Scanner;

public class SaidaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testando cast
        int a = (int) ((float) 1 / 2.0f); // Retornaria 0.5 mas retorna 0 (int)
        System.out.println(a);

        

        System.out.println("Digite um número inteiro:");
        int num = scanner.nextInt();
        System.out.printf("Digitado: %d%n", num);

        System.out.println("Digite um texto (String):");
        scanner.nextLine(); // Por conta do buffer do ENTER de cima
        String s = scanner.nextLine();
        System.out.printf("Texto digitado: %s%n", s);

        System.out.println("Digite um booleano:");
        boolean b = scanner.nextBoolean();
        System.out.println("Booleano digitado: " + b);

        System.out.println("Digite um número decimal:");
        double d = scanner.nextDouble();
        System.out.printf("Número decimal digitado: %.2f%n", d);

    }
}
