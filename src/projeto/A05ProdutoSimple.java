package projeto;

import java.util.Scanner;

public class A05ProdutoSimple {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int PROD = A * B;
        System.out.println("PROD = "+ PROD);


    }
}
