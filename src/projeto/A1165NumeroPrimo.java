/*A entrada contém vários casos de teste. A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 100),
indicando o número de casos de teste da entrada. Cada uma das N linhas seguintes contém um valor inteiro
X (1 < X ≤ 107), que pode ser ou não, um número primo.

 */
package projeto;

import java.util.Scanner;

public class A1165NumeroPrimo {
    public static void main(String[] args) {
        int N,X,i =0;
        Scanner leitor = new Scanner(System.in);

        N = leitor.nextInt();
        while (i < N) {
            X = leitor.nextInt();
            int contador = 0;
            for (int c = 1; c <= X; c++) {
                if (X % c == 0) {
                    contador = contador + 1;
                }

            }
           System.out.print(X);



           if (contador == 2) {
                System.out.println(" eh primo");
            }
           else {
                System.out.println(" nao eh primo");
            }

            i = i + 1;

        }

        
    }
}
