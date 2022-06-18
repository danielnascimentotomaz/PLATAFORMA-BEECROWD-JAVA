/*Leia 2 valores inteiros e armazene-os nas variáveis A e B.
Efetue a soma de A e B atribuindo o seu resultado na variável X.
Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem
alguma além daquilo que está sendo especificado e não esqueça de imprimir
o fim de linha após o resultado.
* */
package projeto;
import java.util.Scanner;

public class A02ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int X = A + B;
        System.out.println("X = "+ X);
    }
}
