package Exercicios.DividindoXporY;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        for (int i = 0; i < N; i++) {
            int x = entrada.nextInt();
            int y = entrada.nextInt();

            if(y == 0)  {
                System.out.println("divisao impossivel");
            } else {
                double total = (double) x / y;
                System.out.printf("%.1f\n",total);
            }

        }
    }
}

