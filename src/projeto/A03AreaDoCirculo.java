package projeto;

import java.util.Scanner;

public class A03AreaDoCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double raio = leitor.nextDouble();

       double area = 3.14159 * Math.pow(raio,2);

       System.out.printf("A=%.4f%n",area);

    }
}
