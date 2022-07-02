package projeto;

import java.util.Scanner;

public class A2395TransporteConteineres {


    public static void main(String[] args) {
        int p = 0;
        int A = 0;
        try {


            Scanner leitor = new Scanner(System.in);
            String x = leitor.nextLine();
            String valores[] = x.split("\s");
            A = Integer.parseInt(valores[0]);
            int B = Integer.parseInt(valores[1]);
            int C = Integer.parseInt(valores[2]);


            String y = leitor.nextLine();
            String valorea01[] = y.split("");
            leitor.close();
            p = Integer.parseInt(valorea01[0]);
            int g = Integer.parseInt(valorea01[1]);
            int h = Integer.parseInt(valorea01[2]);

        } catch (NumberFormatException nfe) {
           

        }


    }

}
