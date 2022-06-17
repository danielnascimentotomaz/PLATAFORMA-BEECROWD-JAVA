/*Leia dois valores inteiros, no caso para variáveis A e B.
A seguir, calcule a soma entre elas e atribua à variável SOMA.
A seguir escrever o valor desta variável
* */

package projeto;

import java.util.Scanner;

public class A04SomaSimple004 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int SOMA = A + B;
        System.out.println("SOMA = "+ SOMA);
    }
}
