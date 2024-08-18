package Exercicios.QuadradoDePares;

import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();

        for (int i = 2; i <= N; i+= 2) {
            int quadrado = i * i;
            System.out.printf("%d^2 = %d\n", i, quadrado);
        }
    }
}
